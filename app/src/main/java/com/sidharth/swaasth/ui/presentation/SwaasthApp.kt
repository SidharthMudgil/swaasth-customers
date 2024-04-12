package com.sidharth.swaasth.ui.presentation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.sidharth.swaasth.ui.navigation.RootNavigationGraph
import com.sidharth.swaasth.ui.navigation.component.BottomNavItem
import com.sidharth.swaasth.ui.theme.SwaasthTheme

@Composable
fun SwaasthApp(
    navController: NavHostController
) {
    SwaasthTheme {
        RootNavigationGraph(navController = rememberNavController())
//        Scaffold(
//            bottomBar = { BottomNavigationBar(navController) }
//        ) {
//            NavHost(
//                navController = navController,
//                startDestination = BottomNavItem.Home.route,
//                modifier = Modifier.padding(it)
//            ) {
//                composable(BottomNavItem.Home.route) { HomeScreen() }
//                composable(BottomNavItem.LiveQueue.route) { LiveQueueScreen() }
//                composable(BottomNavItem.Appointments.route) { AppointmentsScreen() }
//                composable(BottomNavItem.Profile.route) { ProfileScreen() }
//            }
//        }
    }
}

@Composable
fun BottomNavigationBar(
    navController: NavHostController
) {
    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.LiveQueue,
        BottomNavItem.Appointments,
        BottomNavItem.Profile
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    NavigationBar {
        items.forEach { item ->
            NavigationBarItem(
                alwaysShowLabel = true,
                icon = { Icon(item.icon, contentDescription = item.route) },
                label = { Text(item.route) },
                selected = currentDestination?.hierarchy?.any { it.route == item.route } == true,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SwaasthAppPreview() {
    SwaasthApp(rememberNavController())
}

@Preview
@Composable
private fun BottomNavBarPreview() {
    BottomNavigationBar(rememberNavController())
}