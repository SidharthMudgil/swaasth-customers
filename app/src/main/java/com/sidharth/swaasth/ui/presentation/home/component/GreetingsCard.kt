package com.sidharth.swaasth.ui.presentation.home.component

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage

@Composable
fun GreetingsCard() {
    Card {
        Row {
            AsyncImage(model = "", contentDescription = null)
            AsyncImage(model = "", contentDescription = null)
        }
        Text(text = "Hello, Suhani")
        TextField(value = "Search Doctor", { value ->
            TODO(value)
        })
    }
}

@Preview
@Composable
private fun GreetingsCardPreview() {
    GreetingsCard()
}