package com.sidharth.swaasth.ui.presentation.appointment

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.rounded.ArrowBackIosNew
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sidharth.swaasth.common.constant.DemoConstants
import com.sidharth.swaasth.domain.model.Doctor
import com.sidharth.swaasth.ui.component.DoctorCard
import com.sidharth.swaasth.ui.presentation.appointment.component.DateCard
import com.sidharth.swaasth.ui.presentation.appointment.component.ExperienceCard
import com.sidharth.swaasth.ui.theme.Black
import com.sidharth.swaasth.ui.theme.Blue80
import com.sidharth.swaasth.ui.theme.Grey40
import com.sidharth.swaasth.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppointmentScreen(
    doctor: Doctor,
    onBookClick: () -> Unit,
    onBackClick: () -> Unit,
) {
    val scrollState = rememberScrollState()
    var expandedState by remember { mutableStateOf(false) }
    var selectedItem by remember { mutableStateOf("Select a time slot") }

    Scaffold {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .padding(it)
                .padding(16.dp)
                .fillMaxHeight()
                .fillMaxWidth()
                .verticalScroll(scrollState)
        ) {
            TextButton(
                onClick = onBackClick,
                contentPadding = PaddingValues(0.dp),
                modifier = Modifier
                    .align(Alignment.Start)
                    .defaultMinSize(1.dp, 1.dp),
            ) {
                Icon(
                    imageVector = Icons.Rounded.ArrowBackIosNew,
                    contentDescription = null,
                    modifier = Modifier.size(14.dp),
                    tint = Blue80
                )
                Text(text = "Back")
            }

            Text(
                text = "Appointment",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.padding(top = 8.dp))
            Box(
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                DoctorCard(doctor)
            }

            Spacer(modifier = Modifier.padding(top = 8.dp))
            ExperienceCard(doctor)

            Spacer(modifier = Modifier.padding(top = 8.dp))
            Text(
                text = "About Doctor",
                fontSize = 24.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Black
            )
            Text(
                text = doctor.about,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                color = Grey40
            )

            Spacer(modifier = Modifier.padding(top = 8.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Select Date:",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Icon(
                    imageVector = Icons.Filled.CalendarMonth,
                    tint = Blue80,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)
                )
            }
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(doctor.availableDaysOfMonth) { timestamp ->
                    DateCard(timestamp)
                }
            }

            Spacer(modifier = Modifier.padding(top = 8.dp))
            Text(
                text = "Select Time:",
                fontSize = 24.sp,
                fontWeight = FontWeight.ExtraBold,
            )
            ExposedDropdownMenuBox(
                expanded = expandedState,
                onExpandedChange = {
                    expandedState = !expandedState
                },
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                OutlinedTextField(
                    value = selectedItem,
                    shape = RoundedCornerShape(12.dp),
                    onValueChange = { value -> selectedItem = value },
                    readOnly = true,
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(
                            expanded = expandedState
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .menuAnchor()
                )

                ExposedDropdownMenu(
                    expanded = expandedState,
                    onDismissRequest = { expandedState = false },
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    doctor.availableTimeRange.forEach { v ->
                        val text = "${v.first} - ${v.second}"
                        DropdownMenuItem(
                            text = {
                                Text(text = text)
                            },
                            onClick = {
                                selectedItem = text
                                expandedState = false
                            },
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.weight(1f))
            Button(
                onClick = onBookClick,
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Book appointment",
                    fontSize = 16.sp,
                    color = White,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(12.dp, 8.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AppointmentScreenPreview() {
    AppointmentScreen(DemoConstants.demoDoctors[0], {}, {})
}