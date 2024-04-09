package com.sidharth.swaasth.ui.presentation.onboarding

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun OnBoardingScreen() {
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AsyncImage(
            model = "https://cpworldgroup.com/wp-content/uploads/2021/01/placeholder.png",
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        )
        AsyncImage(
            model = "https://cpworldgroup.com/wp-content/uploads/2021/01/placeholder.png",
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )
        Text(text = "Introducing Swaasth")
        Text(text = "With Swaasth, accessing healthcare services is effortless and efficient. Take control of your health journey with the convenience of Swaasth at your fingertips.")
        Card(
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Let's Start",
                Modifier
                    .padding(16.dp, 8.dp)
                    .align(Alignment.CenterHorizontally)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun OnBoardingScreenPreview() {
    OnBoardingScreen()
}