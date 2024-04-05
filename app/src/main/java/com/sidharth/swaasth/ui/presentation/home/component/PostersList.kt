package com.sidharth.swaasth.ui.presentation.home.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.tbuonomo.viewpagerdotsindicator.compose.DotsIndicator
import com.tbuonomo.viewpagerdotsindicator.compose.model.DotGraphic
import com.tbuonomo.viewpagerdotsindicator.compose.type.ShiftIndicatorType
import com.tbuonomo.viewpagerdotsindicator.compose.type.SpringIndicatorType

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PostersList() {
    val posters = listOf(
        "https://as1.ftcdn.net/v2/jpg/01/96/63/34/1000_F_196633449_esdLHOjO3QxrxVF8WWTRdDc501w1Xtm1.jpg",
        "https://img.freepik.com/free-vector/tiny-doctors-patients-near-hospital-flat-vector-illustration-therapist-face-mask-saying-goodbye-cured-people-near-medical-building-ambulance-emergency-clinic-concept_74855-25338.jpg",
        "https://static.vecteezy.com/system/resources/previews/004/493/193/original/hospital-building-for-healthcare-background-illustration-with-ambulance-car-doctor-patient-nurses-and-medical-clinic-exterior-vector.jpg"
    )


    val pageCount by remember { mutableIntStateOf(3) }
    val pagerState = rememberPagerState { 3 }

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        HorizontalPager(
            state = pagerState
        ) {
            AsyncImage(
                model = it,
                contentDescription = null
            )
        }

        DotsIndicator(
            dotCount = pageCount,
            type = SpringIndicatorType(
                dotsGraphic = DotGraphic(
                    16.dp,
                    borderWidth = 2.dp,
                    borderColor = MaterialTheme.colorScheme.primary,
                    color = Color.Transparent
                ),
                selectorDotGraphic = DotGraphic(
                    14.dp,
                    color = MaterialTheme.colorScheme.primary
                )
            ),
            pagerState = pagerState
        )
    }
}


@Preview
@Composable
private fun FeaturesListPreview() {
    PostersList()
}

