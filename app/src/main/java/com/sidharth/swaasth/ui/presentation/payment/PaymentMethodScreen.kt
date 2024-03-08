package com.sidharth.swaasth.ui.presentation.payment

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun PaymentMethodScreen() {
    Scaffold {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Text(text = "Payment method")
            Text(text = "Select your payment method")
            PaymentMethodCard(title = "Online", selected = true)
            PaymentMethodCard(title = "Offline", selected = false)
            Card {
                Row {
                    Text(text = "Total")
                    Text(text = "₹500")
                }
                Card {
                    Text(text = "Pay")
                }
            }
        }
    }
}

@Composable
fun PaymentMethodCard(
    title: String,
    selected: Boolean
) {
    Card {
        Text(text = "Online")
        RadioButton(selected = selected, onClick = {})
    }
}