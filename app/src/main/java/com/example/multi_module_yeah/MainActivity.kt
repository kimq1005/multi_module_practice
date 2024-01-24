package com.example.multi_module_yeah

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.multi_module_yeah.ui.theme.Multi_module_yeahTheme
import com.example.presentation.TestScreen
import com.example.presentation.lostArkCharacter.CharacterMainScreen
import com.example.presentation.lostArkCharacter.LostArkCharacterViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel :LostArkCharacterViewModel = hiltViewModel()
            CharacterMainScreen(viewModel )
            //yeah
//            TestScreen()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val url = BuildConfig.BaseUrl
    Text(
        text = "Hello ! $url",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Multi_module_yeahTheme {
        Greeting("Android")
    }
}