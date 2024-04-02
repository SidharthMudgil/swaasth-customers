package com.sidharth.swaasth.ui.presentation.history

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage

@Composable
fun AppointmentCard(
    upcoming: Boolean = false
) {
    AsyncImage(
        model = "",
        contentDescription = null
    )

    Column{
        Row {
            Column {
                Text(text = "")
                Text(text = "")
                Text(text = "")
            }

            if (!upcoming) {
                Row {
                    Text(text = "")
                    Text(text = "")
                }
            }
        }
        Divider()
        Row {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "")
            }

            Text(text = "")

            Button(onClick = { /*TODO*/ }) {
                Text(text = "")
            }
        }
    }
}

@Preview
@Composable
private fun UpcomingAppointmentCardPreview() {
    AppointmentCard(upcoming = true)
}

@Preview
@Composable
private fun PreviousAppointmentCardPreview() {
    AppointmentCard(upcoming = false)
}