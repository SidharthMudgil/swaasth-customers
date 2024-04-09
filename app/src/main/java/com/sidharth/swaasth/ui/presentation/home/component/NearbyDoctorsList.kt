package com.sidharth.swaasth.ui.presentation.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.sidharth.swaasth.common.constant.DemoConstants
import com.sidharth.swaasth.domain.model.Doctor
import com.sidharth.swaasth.ui.theme.Green
import com.sidharth.swaasth.ui.theme.Grey100
import com.sidharth.swaasth.ui.theme.Grey200
import com.sidharth.swaasth.ui.theme.Grey800
import com.sidharth.swaasth.ui.theme.White

@Composable
fun NearbyDoctorsList() {
    val doctors = DemoConstants.demoDoctors

    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
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
                text = "Doctors Near You",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "See all",
                fontWeight = FontWeight.Medium
            )
        }

        LazyColumn(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.heightIn(max = 1000.dp)
        ) {
            items(doctors) { doctor ->
                DoctorCard(doctor)
            }
        }
    }
}

@Composable
fun DoctorCard(
    doctor: Doctor
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .border(1.dp, Grey100, RoundedCornerShape(12.dp))
            .padding(8.dp),
    ) {
        AsyncImage(
            model = doctor.image,
            contentDescription = null,
            clipToBounds = false,
            contentScale = ContentScale.Crop,

            modifier = Modifier
                .background(White)
                .size(80.dp, 100.dp)
                .clip(RoundedCornerShape(12.dp))
        )

        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Text(
                text = doctor.name,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )

            Text(
                text = "${
                    doctor.speciality.name.substringBefore("_").trim().lowercase()
                }, ${doctor.workplace}",
                color = Grey200,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.sizeIn(100.dp)
            )

            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    imageVector = Icons.Rounded.Star,
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(Green),
                    modifier = Modifier.size(18.dp)
                )

                Text(text = String.format("%.1f", doctor.rating))
                Spacer(modifier = Modifier.weight(1f))

                FilledTonalButton(
                    onClick = {

                    },
                    colors = ButtonDefaults.filledTonalButtonColors(
                        containerColor = Grey100,
                        contentColor = Grey800
                    ),
                    contentPadding = PaddingValues(12.dp, 0.dp),
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.wrapContentHeight()
                ) {
                    Text(text = "Appointment")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DoctorCardPreview() {
    DoctorCard(DemoConstants.demoDoctors[0])
}

@Preview(showBackground = true)
@Composable
private fun NearbyDoctorsListPreview() {
    NearbyDoctorsList()
}