package com.sidharth.swaasth.ui.presentation.appointment

import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TimingCard(time: String) {
    Card {
        Text(text = time)
    }
}

@Preview
@Composable
private fun TimingCardPreview() {
    TimingCard("08:00 AM")
}