package com.sidharth.swaasth.ui.presentation.appointment

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.rounded.AccessTime
import androidx.compose.material.icons.rounded.ArrowBackIosNew
import androidx.compose.material.icons.rounded.ArrowDropDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sidharth.swaasth.ui.component.InputField
import com.sidharth.swaasth.ui.theme.Blue80

@Composable
fun PatientDetailsScreen() {
    Scaffold {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .padding(it)
                .padding(16.dp)
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            TextButton(
                onClick = {},
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
                text = "Patients Details",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.padding(top = 8.dp))
            InputField(
                hint = "Enter Full Name",
                onValueChange = {},
                outlined = true
            )

            InputField(
                hint = "Enter Age",
                onValueChange = {},
                outlined = true
            )

            InputField(
                hint = "Gender",
                onValueChange = {},
                trailingIcon = Icons.Rounded.ArrowDropDown,
                outlined = true
            )

            InputField(
                hint = "Select Date",
                onValueChange = {},
                trailingIcon = Icons.Filled.CalendarMonth,
                outlined = true,
                readOnly = true
            )

            InputField(
                hint = "Select Time",
                onValueChange = {},
                trailingIcon = Icons.Rounded.AccessTime,
                outlined = true,
                readOnly = true
            )
        }
    }
}

@Preview
@Composable
private fun PatientDetailsScreenPreview() {
    PatientDetailsScreen()
}