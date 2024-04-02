package com.sidharth.swaasth.ui.presentation.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.compose.AsyncImage

@Composable
fun LoginScreen() {
    Scaffold {
        Column(modifier = Modifier.padding(it)) {
            AsyncImage(model = "", contentDescription = null)
            Text(text = "")
            Text(text = "")
            TextField(value = "", onValueChange = {

            })
            DropdownMenu(expanded = false, onDismissRequest = { /*TODO*/ }) {

            }
            TextField(value = "", onValueChange = {

            })
            Button(onClick = { /*TODO*/ }) {
                Text(   text = "")
            }
            Divider()
            AsyncImage(model = "", contentDescription = null)
            Text(text = "")
            Row {
                Text(text = "")
                Text(text = "")
                Text(text = "")
            }
        }
    }
}