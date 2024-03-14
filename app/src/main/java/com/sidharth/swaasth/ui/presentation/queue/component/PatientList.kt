package com.sidharth.swaasth.ui.presentation.queue

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PatientList(
    inClinic: Boolean,
    patients: List<String>
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        itemsIndexed(patients) { idx, item ->
            PatientCard(
                id = idx,
                name = item,
                status = if (inClinic) "in clinic" else "ETA 9min"
            )
        }
    }
}

@Composable
fun PatientCard(
    id: Int,
    name: String,
    status: String
) {
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp, 8.dp)
        ) {
            Text(text = "$id")
            Text(text = name)
            Text(text = status)
        }
    }
}

@Preview
@Composable
private fun InClinicPatientListPreview() {
    PatientList(inClinic = false, patients = listOf("Rajeev", "Alok", "Rajveer", "Aditya"))
}

@Preview
@Composable
private fun OutClinicPatientListPreview() {
    PatientList(inClinic = true, patients = listOf("Sameer", "Karan", "Aditya", "Suraj", "Balu"))
}

@Preview
@Composable
private fun PatientCardPreview() {
    PatientCard(
        id = 1,
        name = "Sidharth Mudgil",
        status = "in clinic"
    )
}