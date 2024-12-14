package com.example.greetingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.greetingapp.ui.theme.GreetingAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreetingAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "Hello Android!")
        Text(text = "Name : Gowtham")
        Text(text = "Gender : Male")
        Text(text = "Age : 20")
        Text(text = "College : GITAM UNIVERSITY")
        Text(text = "Branch : CSE-Cybersecurity")
        Text(text = "Contact : 9020108373")
        Text(text = "Place : Bengaluru")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingAppTheme {
        Greeting()
    }
}
