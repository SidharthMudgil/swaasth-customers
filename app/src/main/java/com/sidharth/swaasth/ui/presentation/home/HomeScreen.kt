package com.sidharth.swaasth.ui.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sidharth.swaasth.ui.presentation.home.component.BannersList
import com.sidharth.swaasth.ui.presentation.home.component.GreetingsCard
import com.sidharth.swaasth.ui.presentation.home.component.NearbyDoctorsList
import com.sidharth.swaasth.ui.presentation.home.component.SpecialitiesList

@Composable
fun HomeScreen(
    onQrClick: () -> Unit,
    onNotificationClick: () -> Unit,
    onDoctorClick: () -> Unit,
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        item {
            GreetingsCard(onQrClick, onNotificationClick)
        }
        item {
            BannersList()
        }
        item {
            SpecialitiesList()
        }
        item {
            NearbyDoctorsList(onDoctorClick)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen({}, {}, {})
}