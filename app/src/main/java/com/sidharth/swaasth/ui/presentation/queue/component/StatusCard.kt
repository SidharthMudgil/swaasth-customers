package com.sidharth.swaasth.ui.presentation.queue

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun StatusCard() {
    Row {
        AsyncImage(
            model = "",
            contentDescription = null,
            modifier = Modifier.size(60.dp, 60.dp)
        )
        Column {
            Text(text = "Doctor status:")
            Text(text = "In clinic")
        }
        Text(text = "Total patients")
        Card {
            Text(text = "5")
        }
    }
}

@Preview
@Composable
private fun StatusCardPreview() {
    StatusCard()
}