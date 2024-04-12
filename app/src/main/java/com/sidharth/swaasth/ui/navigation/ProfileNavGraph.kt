package com.sidharth.swaasth.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sidharth.swaasth.ui.presentation.profile.AddMediaScreen
import com.sidharth.swaasth.ui.presentation.profile.EditProfileScreen
import com.sidharth.swaasth.ui.presentation.profile.ProfileScreen

@Composable
fun NavGraphBuilder.profileNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        route = Graph.PROFILE,
        startDestination = ProfileGraph.Profile.route
    ) {
        composable(ProfileGraph.Profile.route) {
            ProfileScreen(
                onMediaClick = {
                    navController.navigate(ProfileGraph.AddMedia.route)
                },
                onEditClick = {
                    navController.navigate(ProfileGraph.Edit.route)
                }
            )
        }

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
    data object Profile : ProfileGraph("PROFILE")
    data object AddMedia : ProfileGraph("ADD_MEDIA")
    data object Edit : ProfileGraph("EDIT")
}