package com.sidharth.swaasth.ui.presentation.appointment

import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import java.time.LocalDateTime

@Composable
fun DateCard(date: LocalDateTime) {
    Card {
        Text(text = "${date.dayOfMonth}")
        Text(text = date.dayOfWeek.name)
    }
}

@Preview
@Composable
private fun DateCardPreview() {
    DateCard(LocalDateTime.now())
}