package com.example.perfil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.perfil.ui.theme.PerfilTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Preview
@Composable
fun App() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray),
        contentPadding = PaddingValues(70.dp)
    ) {
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp)
            ) {
                Image(
                    modifier = Modifier
                        .size(185.dp) // Tamaño cuadrado
                        .border(4.dp, Color.White, CircleShape)
                        .clip(CircleShape)
                        .align(Alignment.Center),
                    painter = painterResource(id = R.drawable.jimena),
                    contentDescription = "Jimena",
                    contentScale = ContentScale.Crop
                )
            }
        }


        item {
            Spacer(modifier = Modifier.height(16.dp))
            ProfileInfo()
        }

        item {
            Spacer(modifier = Modifier.height(24.dp))
            ProfileDetails()
        }

        item {
            Spacer(modifier = Modifier.height(24.dp))
            SocialMediaIcons()
        }
    }
}

@Composable
fun ProfileInfo() {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Jimena Quiroz",
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Hello, I’m a programming student fascinated by the world of technology" +
                    " I love exploring new programming languages and frameworks," +
                    "and I’m excited about the endless possibilities in tech!.",
            color = Color.White,
            fontSize = 14.sp,
            lineHeight = 18.sp,
            textAlign = androidx.compose.ui.text.style.TextAlign.Center
        )
    }
}

@Composable
fun ProfileDetails() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        ProfileDetailItem(R.drawable.sombrero, "Education", "Student Programmer")
        Spacer(modifier = Modifier.height(16.dp))
        ProfileDetailItem(R.drawable.nota, "Music", "Latin Music")
        Spacer(modifier = Modifier.height(16.dp))
        ProfileDetailItem(R.drawable.gym, "Sport", "Gym")
        Spacer(modifier = Modifier.height(16.dp))
        ProfileDetailItem(R.drawable.restaurante, "Favorite food", "Peruvian food")
    }
}

@Composable
fun ProfileDetailItem(imageResId: Int, title: String, subtitle: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = imageResId),
            contentDescription = null,
            modifier = Modifier.size(40.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = title, color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(text = subtitle, color = Color.White, fontSize = 14.sp)
        }
    }
}


@Composable
fun SocialMediaIcons() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {



        Image(
            painter = painterResource(id = R.drawable.facebook),
            contentDescription = "Facebook",
            modifier = Modifier.size(40.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.linkedin),
            contentDescription = "LinkedIn",
            modifier = Modifier.size(40.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.instagram),
            contentDescription = "Instagram",
            modifier = Modifier.size(40.dp)
        )

    }
}
