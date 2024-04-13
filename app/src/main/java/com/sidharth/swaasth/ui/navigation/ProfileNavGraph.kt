package com.sidharth.swaasth.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.sidharth.swaasth.ui.presentation.profile.AddMediaScreen
import com.sidharth.swaasth.ui.presentation.profile.EditProfileScreen

fun NavGraphBuilder.profileNavGraph(
    navController: NavHostController
) {
    navigation(
        route = Graph.PROFILE,
        startDestination = ProfileGraph.Edit.route
    ) {
        composable(ProfileGraph.AddMedia.route) {
            AddMediaScreen()
        }

        composable(ProfileGraph.Edit.route) {
            EditProfileScreen(
                onClick = {
                    navController.popBackStack()
                },
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}

sealed class ProfileGraph(val route: String) {
    data object AddMedia : ProfileGraph("ADD_MEDIA")
    data object Edit : ProfileGraph("EDIT")
}