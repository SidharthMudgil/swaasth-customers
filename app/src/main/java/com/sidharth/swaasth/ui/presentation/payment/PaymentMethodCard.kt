package com.sidharth.swaasth.ui.presentation.payment

import androidx.compose.material3.Card
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

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

@Preview
@Composable
private fun SelectedPaymentMethodCardPreview() {
    PaymentMethodCard(
        title = "Online", selected = true
    )
}

@Preview
@Composable
private fun UnselectedPaymentMethodCardPreview() {
    PaymentMethodCard(
        title = "Offline", selected = false
    )
}