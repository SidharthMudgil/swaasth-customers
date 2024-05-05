package com.sidharth.swaasth.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.sidharth.swaasth.common.constant.DemoConstants
import com.sidharth.swaasth.ui.presentation.appointment.AppointmentScreen
import com.sidharth.swaasth.ui.presentation.appointment.PatientDetailsScreen
import com.sidharth.swaasth.ui.presentation.home.NearbyDoctorsScreen
import com.sidharth.swaasth.ui.presentation.notification.NotificationsScreen
import com.sidharth.swaasth.ui.presentation.payment.PaymentMethodScreen

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
) {
    navigation(
        route = Graph.HOME,
        startDestination = HomeGraph.Appointment.route
    ) {
        composable(HomeGraph.Notifications.route) {
            NotificationsScreen()
        }

        composable(HomeGraph.QrScanner.route) {

        }

        composable(HomeGraph.NearbyDoctors.route) {
            NearbyDoctorsScreen(
                onBackClick = { navController.popBackStack() },
                onAppointmentClick = { navController.navigate(HomeGraph.Appointment.route) }
            )
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
    data object Appointment : HomeGraph("APPOINTMENT")
    data object Notifications : HomeGraph("NOTIFICATIONS")
    data object QrScanner : HomeGraph("QR_SCANNER")
    data object PatientDetails : HomeGraph("PATIENT_DETAILS")
    data object PaymentMethod : HomeGraph("PAYMENT_METHOD")
    data object NearbyDoctors : HomeGraph("NEARBY_DOCTORS")
}