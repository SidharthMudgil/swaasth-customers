package com.sidharth.swaasth.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.sidharth.swaasth.ui.presentation.login.LoginScreen
import com.sidharth.swaasth.ui.presentation.login.OtpScreen
import com.sidharth.swaasth.ui.presentation.onboarding.OnBoardingScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
) {
    navigation(
        route = Graph.AUTHENTICATION,
        startDestination = AuthGraph.Onboarding.route
    ) {
        composable(AuthGraph.Onboarding.route) {
            OnBoardingScreen {
                navController.navigate(AuthGraph.Login.route)
            }
        }

        composable(AuthGraph.Login.route) {
            LoginScreen {
                navController.navigate(AuthGraph.OTP.route)
            }
        }

        composable(AuthGraph.OTP.route) {
            OtpScreen(
                onClick = {
                    navController.navigate(Graph.MAIN) {
                    }
                },
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}

sealed class AuthGraph(val route: String) {
    data object Onboarding : AuthGraph("ONBOARDING")
    data object Login : AuthGraph("LOGIN")
    data object OTP : AuthGraph("OTP")
}