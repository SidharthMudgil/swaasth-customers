package com.sidharth.swaasth.ui.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.sidharth.swaasth.ui.navigation.RootNavigationGraph
import com.sidharth.swaasth.ui.theme.SwaasthTheme

@Composable
fun SwaasthApp(
    navController: NavHostController
) {
    SwaasthTheme {
        RootNavigationGraph(navController)
    }
}