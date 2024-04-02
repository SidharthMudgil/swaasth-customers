package com.sidharth.swaasth.ui.presentation.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage

@Composable
fun AddMediaScreen() {
    Column {
        AsyncImage(model = "", contentDescription = null)
        Row {
            AsyncImage(model = "", contentDescription = null)
            AsyncImage(model = "", contentDescription = null)
            AsyncImage(model = "", contentDescription = null)
        }
    }
}

@Preview
@Composable
private fun AddMediaScreenPreview() {
    AddMediaScreen()
}