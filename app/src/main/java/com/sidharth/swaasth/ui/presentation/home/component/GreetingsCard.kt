package com.sidharth.swaasth.ui.presentation.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun GreetingsCard() {
    Card(
        shape = RoundedCornerShape(bottomEnd = 40.dp, bottomStart = 40.dp),
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.4f)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(
                    Brush.linearGradient(
                        colors = listOf(Color.Blue, Color.Green),
                    )
                )
        ) {
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
}

@Preview
@Composable
private fun GreetingsCardPreview() {
    GreetingsCard()
}