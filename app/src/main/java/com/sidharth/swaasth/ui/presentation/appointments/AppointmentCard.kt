package com.sidharth.swaasth.ui.presentation.appointments

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
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
import coil.compose.AsyncImage
import com.sidharth.swaasth.common.constant.DemoConstants
import com.sidharth.swaasth.common.datatype.Date
import com.sidharth.swaasth.domain.model.Appointment
import com.sidharth.swaasth.ui.theme.Blue80
import com.sidharth.swaasth.ui.theme.Green
import com.sidharth.swaasth.ui.theme.Grey100
import com.sidharth.swaasth.ui.theme.Grey200
import com.sidharth.swaasth.ui.theme.White

@Composable
fun AppointmentCard(
    appointment: Appointment,
    upcoming: Boolean = false
) {
    val date = Date(appointment.timestamp)

    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .border(1.dp, Grey100, RoundedCornerShape(12.dp))
            .padding(8.dp),
    ) {
        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            AsyncImage(
                model = appointment.doctor.image,
                contentDescription = null,
                clipToBounds = false,
                contentScale = ContentScale.Crop,

                modifier = Modifier
                    .background(White)
                    .size(80.dp, if (upcoming) 80.dp else 100.dp)
                    .clip(RoundedCornerShape(12.dp))
            )

            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = appointment.doctor.name,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )

                Text(
                    text = "${
                        appointment.doctor.speciality.name.substringBefore("_").trim().lowercase()
                    }, ${appointment.doctor.workplace}",
                    color = Grey200,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.sizeIn(100.dp)
                )

                Text(
                    text = "${date.formattedDate()}, ${appointment.timeslot}",
                    fontWeight = FontWeight.Bold,
                    color = Grey200,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.sizeIn(100.dp)
                )

                if (!upcoming) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(
                            text = "Add reviews",
                            color = Blue80,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier.padding(end = 8.dp)
                        )

                        Image(
                            imageVector = Icons.Rounded.Star,
                            contentDescription = null,
                            colorFilter = ColorFilter.tint(Green),
                            modifier = Modifier.size(18.dp)
                        )

                        Text(text = String.format("%.1f", appointment.doctor.rating))
                    }
                }
            }
        }

        if (upcoming) {
            Divider()
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth(),
            ) {
                Button(
                    shape = RoundedCornerShape(12.dp),
                    onClick = {},
                    modifier = Modifier.weight(1f)
                ) {
                    Text(text = "Cancel")
                }

                Text(
                    text = "Or",
                    fontWeight = FontWeight.ExtraBold,
                    color = Grey200
                )

                Button(
                    shape = RoundedCornerShape(12.dp),
                    onClick = {},
                    modifier = Modifier.weight(1f)
                ) {
                    Text(text = "Exit Queue")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun UpcomingAppointmentCardPreview() {
    AppointmentCard(
        appointment = DemoConstants.appointments[0],
        upcoming = true
    )
}

@Preview(showBackground = true)
@Composable
private fun PastAppointmentCardPreview() {
    AppointmentCard(
        appointment = DemoConstants.appointments[0],
        upcoming = false
    )
}