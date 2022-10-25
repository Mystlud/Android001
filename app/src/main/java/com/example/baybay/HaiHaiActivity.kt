package com.example.baybay

import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class HaiHaiActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val warnahijau = 0x07f547
        setContent(){
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxSize(),
               horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(id = R.drawable.blabla),
                    contentDescription ="Gambar")

                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Cyan
                ){
                    Text(
                        text = "Hai Hai Kroos desu yo",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp,16.dp,16.dp,4.dp),
                        color = Color(warnahijau),
                        textAlign = TextAlign.Center
                    )
                }

                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Red
                ) {
                    Text(
                        text = "Doctor",
                        modifier = Modifier.padding(16.dp,0.dp,16.dp,4.dp),
                        textAlign = TextAlign.Center
                    )
                }
            }

        }
    }
}