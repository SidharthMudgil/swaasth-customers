package com.sidharth.swaasth.ui.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sidharth.swaasth.ui.presentation.home.component.FeaturesList
import com.sidharth.swaasth.ui.presentation.home.component.GreetingsCard
import com.sidharth.swaasth.ui.presentation.home.component.NearbyDoctorsList
import com.sidharth.swaasth.ui.presentation.home.component.SpecialitiesList

@Composable
fun HomeScreen() {
    Column {
        GreetingsCard()
        FeaturesList()
        SpecialitiesList()
        NearbyDoctorsList()
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}