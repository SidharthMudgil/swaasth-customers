package com.sidharth.swaasth.ui.presentation.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sidharth.swaasth.R
import com.sidharth.swaasth.ui.theme.Blue80
import com.sidharth.swaasth.ui.theme.Grey80

@Composable
fun OnBoardingScreen(onClick: () -> Unit) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight()
            .padding(16.dp),
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_hor),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alignment = Alignment.Center,
            modifier = Modifier
                .height(150.dp)
                .width(400.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.joinus),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1.3f)
        )

        Spacer(modifier = Modifier.padding(bottom = 32.dp))
        Text(
            text = "Introducing Swaasth",
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Blue80,
            textAlign = TextAlign.Center
        )
        Text(
            text = "With Swaasth, accessing healthcare services is effortless and efficient. Take control of your health journey with the convenience of Swaasth at your fingertips.",
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            color = Grey80,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.padding(bottom = 64.dp))
        Button(
            onClick = onClick,
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp, 8.dp)
        ) {
            Text(
                text = "Let's Start",
                modifier = Modifier.padding(12.dp, 12.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun OnBoardingScreenPreview() {
    OnBoardingScreen {

    }
}
