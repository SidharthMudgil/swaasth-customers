package com.sidharth.swaasth.ui.presentation.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PhotoLibrary
import androidx.compose.material.icons.rounded.CameraAlt
import androidx.compose.material.icons.rounded.FlashlightOn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.sidharth.swaasth.ui.theme.Blue80
import com.sidharth.swaasth.ui.theme.Grey200
import com.sidharth.swaasth.ui.theme.White

@Composable
fun AddMediaScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(16.dp)
    ) {
        Text(
            text = "Prescription",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.padding(top = 16.dp))
        AsyncImage(
            model = "",
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(.7f)
                .height(300.dp)
                .background(Grey200, RoundedCornerShape(12.dp))
        )

        Spacer(modifier = Modifier.weight(1f))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Image(
                imageVector = Icons.Filled.PhotoLibrary,
                contentDescription = null,
                contentScale = ContentScale.Fit,
                colorFilter = ColorFilter.tint(Grey200),
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .border(1.dp, Grey200, CircleShape)
                    .padding(12.dp)
            )

            Image(
                imageVector = Icons.Rounded.CameraAlt,
                contentDescription = null,
                colorFilter = ColorFilter.tint(White),
                modifier = Modifier.size(60.dp)
                    .clip(CircleShape)
                    .background(Blue80)
                    .border(1.dp, Blue80, CircleShape)
                    .padding(16.dp)
            )

            Image(
                imageVector = Icons.Rounded.FlashlightOn,
                contentDescription = null,
                colorFilter = ColorFilter.tint(Grey200),
                modifier = Modifier.size(48.dp)
                    .clip(CircleShape)
                    .border(1.dp, Grey200, CircleShape)
                    .padding(12.dp)
            )
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview(showBackground = true)
@Composable
private fun AddMediaScreenPreview() {
    AddMediaScreen()
}