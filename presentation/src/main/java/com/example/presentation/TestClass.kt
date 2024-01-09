package com.example.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
@Composable
fun TestScreen() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "이건 Presentation 모듈이야 ",
            textAlign = TextAlign.Center,
            fontSize = 17.sp,
            modifier = Modifier.fillMaxWidth()
        )
    }
}