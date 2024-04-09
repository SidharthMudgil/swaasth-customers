package com.sidharth.swaasth.ui.presentation.appointments

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sidharth.swaasth.common.constant.DemoConstants
import com.sidharth.swaasth.common.datatype.Date
import com.sidharth.swaasth.domain.model.Appointment
import com.sidharth.swaasth.ui.component.SearchBar
import com.sidharth.swaasth.ui.theme.Black
import com.sidharth.swaasth.ui.theme.Blue80
import com.sidharth.swaasth.ui.theme.Grey100
import com.sidharth.swaasth.ui.theme.Transparent
import com.sidharth.swaasth.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppointmentsScreen() {
    val tabs = listOf("Upcoming", "Past")
    var active by remember { mutableIntStateOf(0) }

    val upcomingAppointments = mutableListOf<Appointment>()
    val pastAppointments = mutableListOf<Appointment>()

    DemoConstants.appointments.forEach {
        val date = Date(it.timestamp)
        if (date.compareWithToday() > 0) {
            upcomingAppointments.add(it)
        } else {
            pastAppointments.add(it)
        }
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(16.dp)
    ) {
        Text(
            text = "Your Appointments",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.padding(top = 16.dp))
        SearchBar(
            hint = "Search Appointments",
            elevation = 2.dp
        ) {

        }        

        Spacer(modifier = Modifier.padding(top = 16.dp))
        TabRow(
            selectedTabIndex = active,
            indicator = {

            },
            divider = {

            },
            containerColor = Grey100,
            modifier = Modifier
                .clip(RoundedCornerShape(12.dp))
                .background(Grey100)
        ) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    selected = index == active,
                    onClick = {
                        active = index
                    },
                ) {
                    if (index == active) {
                        Text(
                            text = title,
                            color = White,
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .background(Blue80, RoundedCornerShape(12.dp))
                                .padding(12.dp)
                        )
                    } else {
                        Text(
                            text = title,
                            color = Black,
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .padding(12.dp)
                                .background(Transparent, RoundedCornerShape(12.dp))
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.padding(top = 16.dp))
        when (active) {
            0 -> AppointmentsList(upcomingAppointments, true)
            else -> AppointmentsList(pastAppointments, false)
        }
    }
}

@Preview
@Composable
private fun AppointmentsScreenPreview() {
    AppointmentsScreen()
}