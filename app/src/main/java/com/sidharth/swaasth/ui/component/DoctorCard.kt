package com.sidharth.swaasth.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.LocalHospital
import androidx.compose.material.icons.rounded.PinDrop
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.sidharth.swaasth.common.constant.DemoConstants
import com.sidharth.swaasth.domain.model.Doctor
import com.sidharth.swaasth.ui.theme.Blue80
import com.sidharth.swaasth.ui.theme.White

@Composable
fun DoctorCard(doctor: Doctor) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AsyncImage(
            model = doctor.image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp, 150.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(White)
        )

        Text(
            text = doctor.name,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1,
            modifier = Modifier
                .widthIn(max = 300.dp)
                .padding(top = 8.dp)
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                imageVector = Icons.Rounded.LocalHospital,
                contentDescription = null,
                modifier = Modifier.size(22.dp),
                tint = Blue80,
            )

            Text(
                text = doctor.speciality,
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
                modifier = Modifier.widthIn(max = 300.dp)
            )
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                imageVector = Icons.Rounded.PinDrop,
                contentDescription = null,
                modifier = Modifier.size(22.dp),
                tint = Blue80,
            )

            Text(
                text = doctor.workplace,
                fontSize = 18.sp,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DoctorCardPreview() {
    DoctorCard(DemoConstants.demoDoctors[0])
}
