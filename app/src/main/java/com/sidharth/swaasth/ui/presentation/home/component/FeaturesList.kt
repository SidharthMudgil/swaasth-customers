package com.sidharth.swaasth.ui.presentation.home.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage

@Composable
fun FeaturesList() {
    val features = listOf("")

    Column {
        LazyRow {
            items(features) { item ->
                AsyncImage(model = item, contentDescription = null)
            }
        }

//        TODO add dots indicator library
    }
}


@Preview
@Composable
private fun FeaturesListPreview() {
    FeaturesList()
}

