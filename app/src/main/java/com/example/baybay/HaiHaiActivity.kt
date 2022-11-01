package com.example.baybay

import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class HaiHaiActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            view()
        }
    }
}

@Preview
@Composable
fun view(){

    val orenji = 0xfffa4205
    val yellowabit = 0xfffac105

    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.fillMaxHeight(0.5f)){
            Surface(modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                color = Color.Red) {
                content()
            }
            Surface(modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                color = Color.Green) {
                content()
            }
            Surface(modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                color = Color.Yellow) {
                content()
            }
        }
        Row(modifier = Modifier.fillMaxHeight()){
            Surface(modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                color = Color(orenji)) {
                content()
            }
            Surface(modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                color = Color.Magenta) {
                content()
            }
            Surface(modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                color = Color(yellowabit)) {
                content()
            }
        }
    }
}

@Composable
fun content(){

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .width(100.dp)
            .height(100.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.love_you_forever),
            contentDescription = stringResource(R.string.gambar),
            alignment = Alignment.Center,
            modifier = Modifier
                .clip(CircleShape)
                .size(100.dp, 100.dp)
        )

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Text(
            text = stringResource(R.string.nama1),
            fontSize = 15.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
        Text(
            text = "Jabatan",
            fontSize = 10.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
    }
}
