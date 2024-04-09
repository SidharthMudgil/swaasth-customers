package com.sidharth.swaasth.ui.presentation.appointments.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sidharth.swaasth.common.constant.DemoConstants
import com.sidharth.swaasth.domain.model.Appointment

@Composable
fun AppointmentsList(
    appointments: List<Appointment>,
    upcoming: Boolean
) {
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(max = 1000.dp)
    ) {
        items(appointments) { appointment ->
            AppointmentCard(
                appointment, upcoming
            )
        }
    }
}

@Preview
@Composable
private fun PastAppointmentListPreview() {
    AppointmentsList(
        appointments = DemoConstants.appointments,
        upcoming = false
    )
}

@Preview
@Composable
private fun UpcomingAppointmentListPreview() {
    AppointmentsList(
        appointments = DemoConstants.appointments,
        upcoming = true
    )
}