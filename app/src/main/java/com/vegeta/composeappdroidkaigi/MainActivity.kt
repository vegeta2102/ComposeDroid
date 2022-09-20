package com.vegeta.composeappdroidkaigi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(name = Message("vegeta", "hehe"))
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun MessageCard(name: Message) {
    Row() {
        Image(
            painter = painterResource(id = R.drawable.my_avatar),
            contentDescription = "My avatar",
            modifier = Modifier
                .width(80.dp)
                .height(80.dp)
        )
        Column() {
            Text(text = "Hello ${name.author}")
            Text(text = "Hello ${name.body}")
        }
    }

}

@Preview
@Composable
fun PreviewMessageCard() {
    Text(text = "Hello Test")
}

