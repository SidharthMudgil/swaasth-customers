package com.sidharth.swaasth.ui.presentation.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sidharth.swaasth.R
import com.sidharth.swaasth.ui.theme.Blue80
import com.sidharth.swaasth.ui.theme.Red

@Composable
fun SplashScreen() {
    val screenWidth = LocalContext.current.resources
        .displayMetrics.widthPixels.toFloat()

    Scaffold {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .padding(it)
        ) {
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .offset(
                            x = -(screenWidth * 0.02f).dp,
                            y = -(screenWidth * 0.1f).dp
                        )
                        .size(300.dp)
                        .align(Alignment.TopStart)
                        .background(
                            color = Blue80,
                            shape = CircleShape
                        ),
                ) {}

                Box(
                    modifier = Modifier
                        .offset(
                            x = (screenWidth * 0.02f).dp,
                            y = -(screenWidth * 0.07f).dp
                        )
                        .size(200.dp)
                        .align(Alignment.TopEnd)
                        .background(
                            color = Red,
                            shape = CircleShape
                        ),
                ) {}
            }

            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                alignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(.4f)
            )

            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .offset(
                            x = -(screenWidth * 0.02f).dp,
                            y = (screenWidth * 0.07f).dp
                        )
                        .size(200.dp)
                        .align(Alignment.BottomStart)
                        .background(
                            color = Red,
                            shape = CircleShape
                        ),
                ) {}

                Box(
                    modifier = Modifier
                        .offset(
                            x = (screenWidth * 0.02f).dp,
                            y = (screenWidth * 0.1f).dp
                        )
                        .size(300.dp)
                        .align(Alignment.BottomEnd)
                        .background(
                            color = Blue80,
                            shape = CircleShape
                        ),
                ) {}
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SplashScreenPreview() {
    SplashScreen()
}