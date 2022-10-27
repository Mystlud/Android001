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
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class HaiHaiActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

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
    }
}

@Preview
@Composable
fun view(){
    val warnahijau = 0xff07f547
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

        /*Spacer(
            modifier = Modifier.
        )*/
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
            color = Color(warnahijau),
            textAlign = TextAlign.Center
        )
    }
}