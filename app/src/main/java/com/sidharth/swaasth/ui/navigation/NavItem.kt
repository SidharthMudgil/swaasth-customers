package com.sidharth.swaasth.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Groups
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.ui.graphics.vector.ImageVector
import com.sidharth.swaasth.common.constant.AppConstants

sealed class NavItem(
    val title: String,
    val path: String,
    val icon: ImageVector
) {
    data object Home : NavItem(
        AppConstants.HOME, "HOME", Icons.Rounded.Home
    )

    data object Appointments : NavItem(
        AppConstants.APPOINTMENTS, "APPOINTMENTS", Icons.Rounded.Home
    )

    data object LiveQueue : NavItem(
        AppConstants.LIVE_QUEUE, "QUEUE", Icons.Rounded.Groups
    )

    data object Profile : NavItem(
        AppConstants.PROFILE, "PROFILE", Icons.Rounded.Person
    )
}