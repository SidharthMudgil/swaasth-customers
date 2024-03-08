package com.sidharth.swaasth.ui.presentation.queue

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sidharth.swaasth.ui.components.DoctorCard

@Composable
fun LiveQueueScreen() {
    Column {
        DoctorCard()
        StatusCard()
        Text(text = "In Clinic Patient")
        PatientList(inClinic = false, patients = listOf("Rajeev", "Alok", "Rajveer", "Aditya"))
        Text(text = "Out Clinic Patient")
        PatientList(inClinic = true, patients = listOf("Sameer", "Karan", "Aditya", "Suraj", "Balu"))
    }
}

@Preview
@Composable
private fun LiveQueueScreenPreview() {
    LiveQueueScreen()
}