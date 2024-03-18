package com.sidharth.swaasth.ui.presentation.home.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage

@Composable
fun FeaturesList() {
    val features = listOf("")

    Column {
        Row {
            Text(text = "Specialities")
            Text(text = "See all")
        }

        LazyRow {
            items(features) { item ->
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
private fun FeaturesListPreview() {
    FeaturesList()
}

