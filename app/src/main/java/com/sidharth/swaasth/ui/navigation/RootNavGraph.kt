package com.sidharth.swaasth.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sidharth.swaasth.ui.presentation.home.HomeScreen

@Composable
fun RootNavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.AUTHENTICATION
    ) {
        authNavGraph(navController = navController)
        composable(route = Graph.HOME) {
            HomeScreen({},{},{})
        }
    }
}

object Graph {
    const val ROOT = "root_graph"
    const val AUTHENTICATION = "auth_graph"
    const val HOME = "home_graph"
    const val PROFILE = "profile_graph"
}