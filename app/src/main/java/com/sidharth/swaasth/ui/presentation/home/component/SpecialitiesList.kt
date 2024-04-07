package com.sidharth.swaasth.ui.presentation.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.sidharth.swaasth.common.constant.AppConstants
import com.sidharth.swaasth.domain.model.Speciality
import com.sidharth.swaasth.ui.theme.Grey200
import com.sidharth.swaasth.ui.theme.White

@Composable
fun SpecialitiesList() {
    val specialities = AppConstants.demoSpecialities

    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(horizontal = 14.dp)
    ) {
        Row(
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            Text(
                text = "Specialities",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "See all",
                fontWeight = FontWeight.Medium
            )
        }

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            items(specialities) { item ->
                SpecialityCard(item)
            }
        }
    }
}

@Composable
fun SpecialityCard(
    speciality: Speciality
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        AsyncImage(
            model = speciality.image,
            contentDescription = null,
            clipToBounds = false,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .background(White)
                .size(80.dp, 80.dp)
                .border(1.dp, Grey200, RoundedCornerShape(12.dp))
        )

        Text(
            text = speciality.name.name.replace("_", " ").lowercase().trim(),
            maxLines = 2,
            textAlign = TextAlign.Center,
            fontSize = 12.sp,
            modifier = Modifier
                .widthIn(max = 100.dp)
                .wrapContentHeight()
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SpecialityCardPreview() {
    SpecialityCard(AppConstants.demoSpecialities[0])
}

@Preview(showBackground = true)
@Composable
private fun SpecialitiesListPreview() {
    SpecialitiesList()
}