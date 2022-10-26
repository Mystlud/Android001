package com.example.baybay

import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class HaiHaiActivity : ComponentActivity(){
    @Composable
    fun view(){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.love_you_forever),
                contentDescription = "Gambar",
                alignment = Alignment.Center,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(30.dp, 30.dp)
            )
            Text(
                text = "HaiHai Kroos desu yo",
                fontSize = 10.sp,
                modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 4.dp),
                color = Color.Black,
                textAlign = TextAlign.Center
            )
            Text(
                text = "Doctor",
                fontSize = 10.sp,
                modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 4.dp),
                color = Color.Black,
                textAlign = TextAlign.Center
            )
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //val warnahijau = 0x07f547

        setContent(){
            Column() {
                Row() {
                    Surface(
                        //modifier = Modifier.aspectRatio(),
                        color = Color.Red
                    ){
                        view()
                    }
                    Surface(
                        //modifier = Modifier.fillMaxWidth(0.3f),
                        color = Color.Green
                    ){
                        view()
                    }
                    Surface(
                        //modifier = Modifier.fillMaxWidth(0.3f),
                        color = Color.Yellow
                    ){
                        view()
                    }
                }

                Row() {
                    Surface(
                        //modifier = Modifier.fillMaxWidth(),
                        color = Color.Blue
                    ){
                        view()
                    }
                    Surface(
                        //modifier = Modifier.fillMaxWidth(),
                        color = Color.Magenta
                    ){
                        view()
                    }
                    Surface(
                        //modifier = Modifier.fillMaxWidth(),
                        color = Color.LightGray
                    ){
                        view()
                    }

                }
            }
        }

/*        setContent(){
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.love_you_forever),
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

        }*/
    }
}