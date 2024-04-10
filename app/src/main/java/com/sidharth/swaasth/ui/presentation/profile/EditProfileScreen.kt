package com.sidharth.swaasth.ui.presentation.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.sidharth.swaasth.ui.component.InputField
import com.sidharth.swaasth.ui.theme.Grey200

@Composable
fun EditProfileScreen() {
    Scaffold {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .padding(it)
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(16.dp)
        ) {
            Text(
                text = "Edit Profile",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.padding(top = 8.dp))
            AsyncImage(
                model = "https://cdn.pixabay.com/photo/2016/08/08/09/17/avatar-1577909_1280.png",
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(.3f)
                    .aspectRatio(1f)
                    .clip(CircleShape)
                    .background(Grey200)
            )

            Spacer(modifier = Modifier.padding(top = 8.dp))
            InputField(
                hint = "Full name",
                outlined = true,
                onValueChange = {

                }
            )

            InputField(
                hint = "Phone number",
                outlined = true,
                onValueChange = {

                }
            )

            InputField(
                hint = "Email id",
                outlined = true,
                onValueChange = {

                }
            )

            InputField(
                hint = "Age",
                outlined = true,
                onValueChange = {

                }
            )

            Spacer(modifier = Modifier.weight(1f))
            Button(
                onClick = {

                },
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Save",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(12.dp, 8.dp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun EditProfileScreenPreview() {
    EditProfileScreen()
}