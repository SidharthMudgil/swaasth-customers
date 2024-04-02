package com.sidharth.swaasth.ui.presentation.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage

@Composable
fun ProfileScreen() {
    Column {
        Text(text = "")
        AsyncImage(model = "", contentDescription = null)
        Text(text = "")
        Button(onClick = { /*TODO*/ }) {
            Text(text = "")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "")
        }
    }
}

@Preview
@Composable
private fun ProfileScreenPreview() {
    ProfileScreen()
}
