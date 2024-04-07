package com.sidharth.swaasth.ui.presentation.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.QrCodeScanner
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sidharth.swaasth.ui.theme.Black
import com.sidharth.swaasth.ui.theme.Blue80
import com.sidharth.swaasth.ui.theme.Grey100
import com.sidharth.swaasth.ui.theme.Purple
import com.sidharth.swaasth.ui.theme.White

@Composable
fun GreetingsCard() {
    Card(
        shape = RoundedCornerShape(bottomEnd = 40.dp, bottomStart = 40.dp),
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        var query by remember { mutableStateOf("") }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(
                    Brush.linearGradient(
                        start = Offset(0f, Float.POSITIVE_INFINITY),
                        end = Offset(Float.POSITIVE_INFINITY, 0f),
                        colors = listOf(
                            Blue80, Purple
                        ),
                    )
                )
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Image(
                        imageVector = Icons.Rounded.QrCodeScanner,
                        contentDescription = "QR Scanner",
                        colorFilter = ColorFilter.tint(White),
                        modifier = Modifier.size(28.dp)
                    )

                    Image(
                        imageVector = Icons.Rounded.Notifications,
                        contentDescription = "QR Scanner",
                        colorFilter = ColorFilter.tint(White),
                        modifier = Modifier.size(28.dp)
                    )
                }

                Text(
                    text = "Hello,\nSuhani",
                    fontSize = 48.sp,
                    color = White,
                    fontWeight = FontWeight.ExtraBold
                )

                BasicTextField(
                    value = query,
                    onValueChange = { query = it },
                    maxLines = 1,
                    singleLine = true,
                    textStyle = TextStyle(
                        color = Black,
                        fontSize = 18.sp
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(bottom = 12.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(White)
                        .padding(12.dp),
                    decorationBox = {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Icon(imageVector = Icons.Rounded.Search, contentDescription = null)
                            Box(modifier = Modifier.weight(1f)) {
                                if (query.isEmpty()) {
                                    Text(
                                        text = "Search Doctor",
                                        color = Grey100,
                                        modifier = Modifier.background(Color.Transparent)
                                    )
                                }
                                it()
                            }
                        }
                    }
                )
            }
        }
    }
}

@Preview
@Composable
private fun GreetingsCardPreview() {
    GreetingsCard()
}