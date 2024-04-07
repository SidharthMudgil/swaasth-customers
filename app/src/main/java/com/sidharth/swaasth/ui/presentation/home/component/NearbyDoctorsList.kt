package com.sidharth.swaasth.ui.presentation.home.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun NearbyDoctorsList() {
    val doctors = listOf("")

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
    ) {
        Row {
            Text(text = "Specialities")
            Text(text = "See all")
        }

        LazyColumn {
            items(doctors) { item ->
                DoctorCard(item)
            }
        }
    }
}

@Composable
fun DoctorCard(
    doctor: String
) {
    Row {
        AsyncImage(model = "", contentDescription = null)
        Column {
            Text(text = doctor)
            Text(text = "General Dentist, Dantmanjan clinic")
            Row {
                AsyncImage(model = "", contentDescription = null)
                Text(text = "4.5")
                Card {
                    Text(text = "Appointment")
                }
            }
        }
    }
}

@Preview
@Composable
private fun DoctorCardPreview() {
    DoctorCard("Ramesh Tejupati")
}

@Preview
@Composable
private fun NearbyDoctorsListPreview() {
    NearbyDoctorsList()
}