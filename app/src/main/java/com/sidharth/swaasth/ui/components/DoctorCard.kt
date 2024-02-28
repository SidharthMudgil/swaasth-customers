package com.sidharth.swaasth.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.LocalHospital
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun DoctorCard() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AsyncImage(
            model = "https://thumbs.dreamstime.com/b/indian-doctor-21487084.jpg",
            contentDescription = null,
            modifier = Modifier.size(150.dp, 150.dp)
                .border(BorderStroke(0.dp, Color.Black), RoundedCornerShape(8.dp))
        )
        Text(text = "Dr. Tarun Kumar Giroti")
        Row {
            Icon(
                imageVector = Icons.Rounded.LocalHospital,
                contentDescription = null
            )
            Text(text = "General Dentist, Park Hospital")
        }
        Text(text = "06:00 AM to 09:00 PM")
    }
}

@Preview
@Composable
private fun DoctorCardPreview() {
    DoctorCard()
}
