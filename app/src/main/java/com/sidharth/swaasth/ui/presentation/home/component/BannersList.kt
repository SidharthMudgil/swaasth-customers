package com.sidharth.swaasth.ui.presentation.home.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.sidharth.swaasth.ui.theme.Blue20
import com.sidharth.swaasth.ui.theme.Blue80
import com.tbuonomo.viewpagerdotsindicator.compose.DotsIndicator
import com.tbuonomo.viewpagerdotsindicator.compose.model.DotGraphic
import com.tbuonomo.viewpagerdotsindicator.compose.type.SpringIndicatorType

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun BannersList() {
    val posters = listOf(
        "https://as1.ftcdn.net/v2/jpg/01/96/63/34/1000_F_196633449_esdLHOjO3QxrxVF8WWTRdDc501w1Xtm1.jpg",
        "https://img.freepik.com/free-vector/tiny-doctors-patients-near-hospital-flat-vector-illustration-therapist-face-mask-saying-goodbye-cured-people-near-medical-building-ambulance-emergency-clinic-concept_74855-25338.jpg",
        "https://static.vecteezy.com/system/resources/previews/004/493/193/original/hospital-building-for-healthcare-background-illustration-with-ambulance-car-doctor-patient-nurses-and-medical-clinic-exterior-vector.jpg"
    )

    val pageCount by remember { mutableIntStateOf(3) }
    val pagerState = rememberPagerState { 3 }

    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp),
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            AsyncImage(
                model = posters[it],
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(horizontal = 16.dp)
                    .clip(RoundedCornerShape(12.dp))
            )
        }

        DotsIndicator(
            dotCount = pageCount,
            dotSpacing = 4.dp,
            type = SpringIndicatorType(
                dotsGraphic = DotGraphic(
                    size = 8.dp,
                    borderWidth = 1.dp,
                    borderColor = Blue20,
                    color = Blue20
                ),
                selectorDotGraphic = DotGraphic(
                    size = 8.dp,
                    color = Blue80
                )
            ),
            pagerState = pagerState
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun BannersListPreview() {
    BannersList()
}

