package com.sidharth.swaasth.ui.presentation.notification

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun NotificationsScreen() {
    val notifications = listOf(
        "Dr. Maria started Live Queue",
        "Your appointment is successful",
        "Dr. Maria started Live Queue",
        "Your appointment is successful",
        "Dr. Maria started Live Queue",
        "Your appointment is successful"
    )

    LazyColumn {
        items(notifications) {
            NotificationItem(it)
        }
    }
}

@Preview
@Composable
private fun NotificationsScreenPreview() {
    NotificationsScreen()
}

@Preview
@Composable
private fun NoNotificationsScreenPreview() {
    NotificationsScreen()
}