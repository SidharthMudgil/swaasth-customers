package com.sidharth.swaasth.ui.presentation.appointment

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sidharth.swaasth.ui.components.DoctorCard
import java.time.LocalDateTime

@Composable
fun AppointmentScreen() {
    val timings = listOf("08:00 AM", "08:00 AM", "08:00 AM", "08:00 AM", "08:00 AM", "08:00 AM")
    val dates = listOf(
        LocalDateTime.now(),
        LocalDateTime.now(),
        LocalDateTime.now(),
        LocalDateTime.now(),
        LocalDateTime.now()
    )

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Text(text = "Appointment")
        DoctorCard()
        DoctorScoreCard()
        Text(text = "About Doctor")
        Text(text = "Has Extensive Scientific Knowledge: Good dental surgeon should have a wealth of knowledge about teeth and oral hygiene. They are able to quickly identify problems as well as their most effective treatments.")
        Row {
            Text(text = "Schedules")
            Text(text = "See all")
        }
        LazyRow {
            items(dates) { date ->
                DateCard(date)
            }
        }
        Text(text = "Schedules")
        LazyVerticalGrid(
            columns = GridCells.Adaptive(150.dp)
        ) {
            items(timings) { time ->
                TimingCard(time)
            }
        }
        Card {
            Text(text = "Book appointment")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AppointmentScreenPreview() {
    AppointmentScreen()
}