package com.sidharth.swaasth.ui.presentation.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun OtpScreen() {
    Scaffold {
        Column(modifier = Modifier.padding(it)) {
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Back")
            }

            Text(text = "")
            Text(text = "")
            // todo otp layout
            Text(text = "")
            Text(text = "")
            Button(onClick = { /*TODO*/ }) {
                Text(text = "")
            }
            Text(text = "")
        }
    }
}

@Preview
@Composable
private fun OtpScreenPreview() {
    OtpScreen()
}