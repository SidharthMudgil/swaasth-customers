package com.sidharth.swaasth.ui.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sidharth.swaasth.ui.navigation.NavItem
import com.sidharth.swaasth.ui.theme.SwaasthTheme

@Composable
fun SwaasthApp(finishActivity: () -> Unit) {
    SwaasthTheme {
        Scaffold(
            bottomBar = { BottomNavigationBar() }
        ) {
            Text(
                text = "asd",
                modifier = Modifier.padding(it)
            )
        }
    }
}

@Composable
fun BottomNavigationBar() {
    val items = listOf(NavItem.Home, NavItem.LiveQueue, NavItem.Appointments, NavItem.Profile)
    var selectedItem by rememberSaveable { mutableIntStateOf(0) }

    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                alwaysShowLabel = true,
                icon = { Icon(item.icon, contentDescription = item.title) },
                label = { Text(item.title) },
                selected = selectedItem == index,
                onClick = { selectedItem = index }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SwaasthAppPreview() {
    SwaasthApp {}
}

@Preview
@Composable
private fun BottomNavBarPreview() {
    BottomNavigationBar()
}