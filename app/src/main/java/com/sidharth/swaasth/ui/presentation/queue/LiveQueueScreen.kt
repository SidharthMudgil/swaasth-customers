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
        Text(text = "In Clinic Patient")
        Text(text = "Out Clinic Patient")
    }
}

@Preview(showBackground = true)
@Composable
private fun LiveQueueScreenPreview() {
    LiveQueueScreen()
}