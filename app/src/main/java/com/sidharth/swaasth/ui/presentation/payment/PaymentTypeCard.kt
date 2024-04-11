package com.sidharth.swaasth.ui.presentation.payment

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sidharth.swaasth.ui.theme.Blue80
import com.sidharth.swaasth.ui.theme.Grey10
import com.sidharth.swaasth.ui.theme.White

@Composable
fun PaymentTypeCard(
    title: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 12.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = White,
        ),
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
            .border(1.dp, Grey10, RoundedCornerShape(12.dp))
            .shadow(
                spotColor = Blue80,
                ambientColor = Blue80,
                elevation = 15.dp,
                clip = true,
                shape = RoundedCornerShape(12.dp)
            ).clickable {
                onClick()
            }
    ) {
        RadioButton(
            selected = selected,
            onClick = {
                onClick()
            },
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.End)
                .defaultMinSize(1.dp, 1.dp)
        )

        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.CenterHorizontally)
        ) {
            Text(
                text = title,
                fontSize = 36.sp,
                fontWeight = FontWeight.ExtraBold
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SelectedPaymentTypeCardPreview() {
    PaymentTypeCard(
        title = "Online", selected = true
    ) {

    }
}

@Preview(showBackground = true)
@Composable
private fun UnselectedPaymentTypeCardPreview() {
    PaymentTypeCard(
        title = "Offline", selected = false
    ) {

    }
}