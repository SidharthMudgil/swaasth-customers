package com.sidharth.swaasth.ui.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sidharth.swaasth.ui.theme.SwaasthTheme

@Composable
fun SwaasthApp(finishActivity: () -> Unit) {
    SwaasthTheme {
        Scaffold(
            bottomBar = { BottomNavigationBar() }
        ) {
            Text(
                text = "asd",
                modifier = Modifier.padding(it)
            )
        }
    }
}

@Composable
fun BottomNavigationBar() {
    NavigationBar {

    }
}