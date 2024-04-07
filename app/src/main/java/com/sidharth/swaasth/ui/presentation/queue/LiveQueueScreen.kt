package com.sidharth.swaasth.ui.presentation.queue

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sidharth.swaasth.common.constant.DemoConstants
import com.sidharth.swaasth.domain.model.Patient
import com.sidharth.swaasth.ui.component.DoctorCard
import com.sidharth.swaasth.ui.presentation.queue.component.PatientList
import com.sidharth.swaasth.ui.presentation.queue.component.StatusCard

@Composable
fun LiveQueueScreen() {
    val inClinicPatients = mutableListOf<Patient>()
    val outClinicPatients = mutableListOf<Patient>()

    DemoConstants.demoPatients.forEach {
        if (it.status.lowercase() == "in clinic") {
            inClinicPatients.add(it)
        } else {
            outClinicPatients.add(it)
        }
    }

    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(16.dp)
    ) {
        item {
            DoctorCard(DemoConstants.demoDoctors[0])
            Spacer(modifier = Modifier.padding(top = 16.dp))
        }
        item {
            StatusCard()
            Spacer(modifier = Modifier.padding(top = 16.dp))
        }
        item {
            Text(
                text = "In Clinic Patient",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }
        item {
            PatientList(patients = inClinicPatients)
            Spacer(modifier = Modifier.padding(top = 16.dp))
        }
        item {
            Text(
                text = "Out Clinic Patient",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 8.dp, top = 16.dp)
            )
        }
        item {
            PatientList(patients = outClinicPatients)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun LiveQueueScreenPreview() {
    LiveQueueScreen()
}