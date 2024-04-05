package com.sidharth.swaasth.ui.presentation.appointments

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppointmentsScreen() {
    val tabs = listOf("Upcoming", "Past")
    var active = 1

    Column {
        SearchBar(
            query = "Search Appointments",
            onQueryChange = {},
            onSearch = {},
            active = true,
            onActiveChange = {}
        ) {

        }

        TabRow(selectedTabIndex = active) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    selected = index == active,
                    onClick = {
                        active = index
                    }
                ) {
                    Text(text = title)
                }
            }
        }

        LazyColumn {
            items(listOf("")) {
                AppointmentCard()
            }
        }
        when (active) {
            0 -> {}
            else -> {}
        }
    }
}

@Preview
@Composable
private fun AppointmentsScreenPreview() {
    AppointmentsScreen()
}