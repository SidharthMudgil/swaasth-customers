package com.sidharth.swaasth.ui.presentation.queue.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Person2
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sidharth.swaasth.ui.theme.Blue80
import com.sidharth.swaasth.ui.theme.Grey40

@Composable
fun StatusCard() {
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Icon(
            imageVector = Icons.Rounded.Person2,
            contentDescription = null,
            modifier = Modifier.size(60.dp),
            tint = Blue80
        )

        Column {
            Text(
                text = "Doctor status:",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
                modifier = Modifier.widthIn(max = 300.dp)
            )

            Text(
                text = "In clinic",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
                modifier = Modifier.widthIn(max = 300.dp)
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = "Total patients",
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1,
            modifier = Modifier.widthIn(max = 300.dp)
        )

        Box(
            modifier = Modifier
                .padding(start = 8.dp)
                .border(1.dp, Grey40, RoundedCornerShape(12.dp))
                .padding(16.dp, 4.dp)
        ) {
            Text(
                text = "10",
                fontSize = 18.sp,
                fontWeight = FontWeight.ExtraBold,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun StatusCardPreview() {
    StatusCard()
}