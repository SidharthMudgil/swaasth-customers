package com.sidharth.swaasth.ui.presentation.payment

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBackIosNew
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sidharth.swaasth.ui.theme.Blue80
import com.sidharth.swaasth.ui.theme.Grey40

@Composable
fun PaymentMethodScreen(
    onClick: () -> Unit,
    onBackClick: () -> Unit
) {
    var selected by remember { mutableIntStateOf(0) }

    Scaffold {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(it)
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            TextButton(
                onClick = onBackClick,
                contentPadding = PaddingValues(0.dp),
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(bottom = 16.dp)
                    .defaultMinSize(1.dp, 1.dp),
            ) {
                Icon(
                    imageVector = Icons.Rounded.ArrowBackIosNew,
                    contentDescription = null,
                    modifier = Modifier.size(14.dp),
                    tint = Blue80
                )
                Text(text = "Back")
            }

            Text(
                text = "Patients Details",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Text(text = "Select your payment method")

            Spacer(modifier = Modifier.padding(top = 60.dp))
            PaymentTypeCard(
                title = "Online",
                selected = selected == 0
            ) {
                selected = 0
            }

            Spacer(modifier = Modifier.padding(top = 16.dp))
            PaymentTypeCard(
                title = "Offline",
                selected = selected == 1
            ) {
                selected = 1
            }

            Spacer(modifier = Modifier.weight(1f))
            Box(
                modifier = Modifier.fillMaxWidth()
                    .height(2.dp)
                    .shadow(1.dp)
            ) {

            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Total",
                        fontSize = 24.sp,
                        color = Grey40,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "₹500",
                        fontSize = 24.sp,
                        color = Grey40,
                        fontWeight = FontWeight.Bold
                    )
                }

                Button(
                    shape = RoundedCornerShape(12.dp),
                    onClick = onClick, modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Next",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PaymentMethodScreenPreview() {
    PaymentMethodScreen({}, {})
}