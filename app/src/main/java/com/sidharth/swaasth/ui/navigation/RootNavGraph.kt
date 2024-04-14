package com.sidharth.swaasth.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.sidharth.swaasth.ui.presentation.MainScreen
import com.sidharth.swaasth.ui.presentation.splash.SplashScreen

@Composable
fun RootNavigationGraph(navController: NavHostController) {
    val splashScreen = "SPLASH"

    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.SPLASH
    ) {
        navigation(
            startDestination = splashScreen,
            route = Graph.SPLASH
        ) {
            composable(splashScreen) {
                SplashScreen(navController)
            }
        }
        authNavGraph(navController = navController)
        composable(route = Graph.MAIN) {
            MainScreen()
        }
    }
}

object Graph {
    const val ROOT = "root_graph"
    const val SPLASH = "splash_graph"
    const val AUTHENTICATION = "auth_graph"
    const val MAIN = "main_graph"
    const val HOME = "home_graph"
    const val PROFILE = "profile_graph"
}