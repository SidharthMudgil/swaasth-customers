package com.sidharth.swaasth.ui.presentation.appointment.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sidharth.swaasth.common.constant.DemoConstants
import com.sidharth.swaasth.common.datatype.Date
import com.sidharth.swaasth.ui.theme.Blue80
import com.sidharth.swaasth.ui.theme.Grey20
import com.sidharth.swaasth.ui.theme.Grey40
import com.sidharth.swaasth.ui.theme.White

@Composable
fun DateCard(
    timestamp: Long,
    selected: Boolean,
    onClick: () -> Unit
) {
    val date = Date(timestamp)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .border(1.dp, Grey20, RoundedCornerShape(12.dp))
            .background(if (selected) Blue80 else White)
            .padding(12.dp)
            .clickable {
                onClick()
            }
    ) {
        Text(
            text = "${date.DATE}",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Grey40
        )
        Text(
            text = date.formattedDate("EEE"),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Grey40
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DateCardPreview() {
    DateCard(
        DemoConstants.demoDoctors[0].availableDaysOfMonth[0],
        false
    ) {

    }
}