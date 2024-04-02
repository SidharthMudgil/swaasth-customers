package com.sidharth.swaasth.ui.presentation.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage

@Composable
fun EditProfileScreen() {
    Scaffold {
        Column(modifier = Modifier.padding(it)) {
            Text(text = "")
            AsyncImage(model = "", contentDescription = null)
            TextField(value = "", onValueChange = {})
            TextField(value = "", onValueChange = {})
            TextField(value = "", onValueChange = {})
            TextField(value = "", onValueChange = {})
            Button(onClick = { /*TODO*/ }) {
                Text(text = "")
            }
        }
    }
}

@Preview
@Composable
private fun EditProfileScreenPreview() {
    EditProfileScreen()
}