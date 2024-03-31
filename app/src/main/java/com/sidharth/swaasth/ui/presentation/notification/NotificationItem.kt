package com.sidharth.swaasth.ui.presentation.notification

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun NotificationItem(
    notification: String
) {
    Text(text = notification)
}

@Preview
@Composable
private fun NotificationItemPreview() {
    NotificationItem("Empty Notification")
}