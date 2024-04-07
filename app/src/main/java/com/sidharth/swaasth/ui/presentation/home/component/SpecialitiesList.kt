package com.sidharth.swaasth.ui.presentation.home.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage

@Composable
fun SpecialitiesList() {
    val specialities = listOf("")

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        Row {
            Text(text = "Doctors near you")
            Text(text = "See all")
        }

        LazyRow {
            items(specialities) { item ->
                SpecialityCard(item)
            }
        }
    }
}

@Composable
fun SpecialityCard(
    speciality: String
) {
    Column {
        AsyncImage(model = "", contentDescription = null)
        Text(text = speciality)
    }
}

@Preview
@Composable
private fun SpecialityCardPreview() {
    SpecialityCard("General Physician")
}

@Preview
@Composable
private fun SpecialitiesListPreview() {
    SpecialitiesList()
}