package com.example.buisnesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFEBEBEB) // Symfony light grey background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ProfileCard()
        }

        ContactInfo(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 50.dp, start = 80.dp)
        )
    }
}

@Composable
fun ProfileCard() {
    Image(
        painter = painterResource(id = R.drawable.symfony_logo),
        contentDescription = "Symfony Logo",
        modifier = Modifier.size(120.dp) // Adjust width/height as needed
    )

    Spacer(modifier = Modifier.height(24.dp))

    Text(
        text = "Saifeddine Tounsi",
        fontSize = 32.sp,
        fontWeight = FontWeight.Normal,
        color = Color.Black
    )

    Spacer(modifier = Modifier.height(8.dp))

    Text(
        text = "Symfony developper",
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        color = Color.Black
    )
}

@Composable
fun ContactInfo(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "📞", fontSize = 22.sp, color = Color.Black)
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = "+216 93 221 620", fontSize = 16.sp, color = Color.Black)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "in",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                color = Color.Black
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = "linkedin.com/in/saif-tounsi-818a49338", fontSize = 16.sp, color = Color.Black)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "✉", fontSize = 22.sp, color = Color.Black)
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = "saiftounsi.facebook@gmail.com", fontSize = 16.sp, color = Color.Black)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFFEBEBEB)
        ) {
            BusinessCard()
        }
    }
}