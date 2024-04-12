package com.sidharth.swaasth.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sidharth.swaasth.common.constant.DemoConstants
import com.sidharth.swaasth.ui.presentation.appointment.AppointmentScreen
import com.sidharth.swaasth.ui.presentation.appointment.PatientDetailsScreen
import com.sidharth.swaasth.ui.presentation.home.HomeScreen
import com.sidharth.swaasth.ui.presentation.notification.NotificationsScreen
import com.sidharth.swaasth.ui.presentation.payment.PaymentMethodScreen

@Composable
fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        route = Graph.HOME,
        startDestination = HomeGraph.Home.route
    ) {
        composable(HomeGraph.Home.route) {
            HomeScreen(
                onQrClick = {
                    navController.navigate(HomeGraph.QrScanner.route)
                },
                onNotificationClick = {
                    navController.navigate(HomeGraph.Notifications.route)
                },
                onDoctorClick = {
                    navController.navigate(HomeGraph.Appointment.route)
                }
            )
        }

        composable(HomeGraph.Notifications.route) {
            NotificationsScreen()
        }

        composable(HomeGraph.QrScanner.route) {

        }

        composable(HomeGraph.Appointment.route) {
            AppointmentScreen(
                DemoConstants.demoDoctors[0],
                onBookClick = {
                    navController.navigate(HomeGraph.PatientDetails.route)
                },
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }



        composable(HomeGraph.PatientDetails.route) {
            PatientDetailsScreen(
                onClick = {
                    navController.navigate(HomeGraph.PaymentMethod.route)
                },
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

        composable(HomeGraph.PaymentMethod.route) {
            PaymentMethodScreen(
                onClick = {

                },
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}

sealed class HomeGraph(val route: String) {
    data object Home : HomeGraph("HOME")
    data object Appointment : HomeGraph("APPOINTMENT")
    data object Notifications : HomeGraph("NOTIFICATIONS")
    data object QrScanner : HomeGraph("QR_SCANNER")
    data object PatientDetails : HomeGraph("PATIENT_DETAILS")
    data object PaymentMethod : HomeGraph("PAYMENT_METHOD")
}