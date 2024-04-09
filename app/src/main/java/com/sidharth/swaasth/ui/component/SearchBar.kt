package com.sidharth.swaasth.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sidharth.swaasth.ui.theme.Black
import com.sidharth.swaasth.ui.theme.Grey100
import com.sidharth.swaasth.ui.theme.White

@Composable
fun SearchBar(
    hint: String,
    elevation: Dp = 0.dp,
    onValueChange: () -> Unit,
) {
    var query by remember { mutableStateOf("") }

    Surface(
        shadowElevation = elevation,
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .wrapContentHeight()
    ) {
        BasicTextField(
            value = query,
            onValueChange = {
                query = it
                onValueChange()
            },
            maxLines = 1,
            singleLine = true,
            textStyle = TextStyle(
                color = Black,
                fontSize = 18.sp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .clip(RoundedCornerShape(12.dp))
                .background(White)
                .padding(12.dp),
            decorationBox = {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Icon(imageVector = Icons.Rounded.Search, contentDescription = null)
                    Box(modifier = Modifier.weight(1f)) {
                        if (query.isEmpty()) {
                            Text(
                                text = hint,
                                color = Grey100,
                                modifier = Modifier.background(Color.Transparent)
                            )
                        }
                        it()
                    }
                }
            }
        )
    }
}

@Preview
@Composable
private fun SearchBarPreview() {
    SearchBar(hint = "Search Doctor") {
        
    }
}