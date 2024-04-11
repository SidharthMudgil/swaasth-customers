package com.sidharth.swaasth.ui.presentation.appointment.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sidharth.swaasth.common.constant.DemoConstants
import com.sidharth.swaasth.domain.model.Doctor
import com.sidharth.swaasth.ui.theme.Blue80
import com.sidharth.swaasth.ui.theme.Green
import com.sidharth.swaasth.ui.theme.Red
import com.sidharth.swaasth.ui.theme.White

@Composable
fun ExperienceCard(
    doctor: Doctor
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(Blue80, RoundedCornerShape(16.dp))
            .padding(12.dp)
    ) {
        Box(
            modifier = Modifier.weight(1f)
        ) {
            ExperienceItem(
                value = doctor.patientsCount,
                label = "Patients",
                color = Blue80
            )
        }

        Box(
            modifier = Modifier.weight(1f)
        ) {
            ExperienceItem(
                value = doctor.experience,
                label = "Exp. years",
                color = Green
            )
        }

        Box(
            modifier = Modifier.weight(1f)
        ) {
            ExperienceItem(
                value = doctor.reviews.size,
                label = "Reviews",
                color = Red
            )
        }
    }
}

@Composable
fun ExperienceItem(
    value: Int,
    label: String,
    color: Color
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(White, RoundedCornerShape(12.dp))
            .padding(12.dp)
    ) {
        Text(
            text = "$value+",
            fontSize = 24.sp,
            fontWeight = FontWeight.ExtraBold,
            color = color
        )

        Text(
            text = label,
            fontSize = 16.sp,
            fontWeight = FontWeight.ExtraBold,
            color = color,
            maxLines = 1
        )
    }
}

@Preview
@Composable
private fun ExperienceItemPreview() {
    ExperienceItem(
        value = 350,
        label = "Patients",
        color = Green
    )
}

@Preview
@Composable
private fun ExperienceCardPreview() {
    ExperienceCard(DemoConstants.demoDoctors[0])
}