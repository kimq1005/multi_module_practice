package com.example.presentation.lostArkCharacter

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel

class LostArkCharacterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel: LostArkCharacterViewModel = hiltViewModel()
            CharacterMainScreen(viewModel)

        }
    }
}

@Composable
fun CharacterMainScreen(viewModel: LostArkCharacterViewModel) {
    Column(modifier = Modifier.fillMaxSize()) {
        val activity = LocalContext.current as Activity
        Text(text = "안녕하세요 호호호")
        LaunchedEffect(activity){
            viewModel.getCharacter()
        }
    }
}