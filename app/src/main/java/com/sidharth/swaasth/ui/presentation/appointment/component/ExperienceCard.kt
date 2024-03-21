package com.sidharth.swaasth.ui.presentation.appointment.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ExperienceCard() {
    Row {
        ExperienceItem(
            value = 350,
            label = "Patients",
            color = Color(255, 0, 0)
        )
    }
}

@Composable
fun ExperienceItem(
    value: Int, label: String, color: Color
) {
    Column {
        Text(text = "$value +")
        Text(text = label)
    }
}

@Preview
@Composable
private fun ExperienceItemPreview() {
    ExperienceItem(
        value = 350,
        label = "Patients",
        color = Color(255, 0, 0)
    )
}

@Preview
@Composable
private fun ExperienceCardPreview() {
    ExperienceCard()
}