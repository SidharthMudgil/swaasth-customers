package com.sidharth.swaasth.ui.presentation.queue.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sidharth.swaasth.common.constant.DemoConstants
import com.sidharth.swaasth.domain.model.Patient

@Composable
fun PatientList(patients: List<Patient>) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.heightIn(max = 1000.dp)
    ) {
        itemsIndexed(patients) { idx, patient ->
            PatientCard(idx + 1, patient)
        }
    }
}

@Preview
@Composable
private fun PatientListPreview() {
    PatientList(DemoConstants.demoPatients)
}