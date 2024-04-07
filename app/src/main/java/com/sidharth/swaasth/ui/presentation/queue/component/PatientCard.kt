package com.sidharth.swaasth.ui.presentation.queue.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sidharth.swaasth.common.constant.DemoConstants
import com.sidharth.swaasth.domain.model.Patient
import com.sidharth.swaasth.ui.theme.Blue80
import com.sidharth.swaasth.ui.theme.White

@Composable
fun PatientCard(
    position: Int,
    patient: Patient
) {
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 3.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = if (patient.status.lowercase() == "in clinic") White else Blue80,
            contentColor = if (patient.status.lowercase() == "in clinic") Blue80 else White,
        ),
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp, 12.dp)
        ) {
            Text(
                text = "$position",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = patient.name,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = patient.status,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}

@Preview
@Composable
private fun InClinicPatientCardPreview() {
    PatientCard(1, DemoConstants.demoPatients[0].copy(status = "In Clinic"))
}

@Preview
@Composable
private fun OutClinicPatientCardPreview() {
    PatientCard(1, DemoConstants.demoPatients[0].copy(status = "ETA 9min"))
}