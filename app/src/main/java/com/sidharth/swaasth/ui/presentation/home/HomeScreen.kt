package com.sidharth.swaasth.ui.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sidharth.swaasth.ui.presentation.home.component.GreetingsCard
import com.sidharth.swaasth.ui.presentation.home.component.PostersList
import com.sidharth.swaasth.ui.presentation.home.component.NearbyDoctorsList
import com.sidharth.swaasth.ui.presentation.home.component.SpecialitiesList

@Composable
fun HomeScreen() {
    val scrollState = rememberScrollState()

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
//            .verticalScroll(scrollState)
    ) {
        GreetingsCard()
        PostersList()
        SpecialitiesList()
        NearbyDoctorsList()
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}