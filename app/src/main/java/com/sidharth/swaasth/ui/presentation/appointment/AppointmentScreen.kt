package com.sidharth.swaasth.ui.presentation.appointment

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sidharth.swaasth.ui.components.DoctorCard

@Composable
fun AppointmentScreen() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Text(text = "Appointment")
        DoctorCard()
//        todo create the doctor profile card
        Text(text = "About Doctor")
        Text(text = "Has Extensive Scientific Knowledge: Good dental surgeon should have a wealth of knowledge about teeth and oral hygiene. They are able to quickly identify problems as well as their most effective treatments.")
        Row {
            Text(text = "Schedules")
            Text(text = "See all")
        }
        LazyRow {
//        todo create date schedule card
        }
        Text(text = "Schedules")
        LazyVerticalGrid(
            columns = GridCells.Adaptive(150.dp)
        ) {
//        todo create time schedule card
        }
        Card {
            Text(text = "Book appointment")
        }
    }
}