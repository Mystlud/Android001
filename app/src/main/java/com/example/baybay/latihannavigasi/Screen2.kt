package com.example.baybay.latihannavigasi

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Screen2(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Button(
            onClick = {
                      navController.popBackStack();
                      //navController.navigate(NavRoute.screen_1.name)
                      },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xff00000a0),
                contentColor = Color.White
            )
        ) {
            Text(text = "HEHEHEHE")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun Screen2Preview(){
    Screen2()
}