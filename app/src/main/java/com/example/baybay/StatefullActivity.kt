package com.example.baybay

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

class StatefullActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent(){
            EchoText()

        }

    }
}

@Preview
@Composable
fun EchoText(){

    var displayedText = remember {
        mutableStateOf("")

    } 

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {

        /*if (displayedText.isNotEmpty()){
            Text(
                text = "Hai Hai "+displayedText
            )
        }*/

        Spacer(modifier = Modifier.height(24.dp))
        
        /*OutlinedTextField(
            value = displayedText.value,
            onValueChange = {
                displayedText.value = it
            },
            label = Text(text = "Nama")
        )*/
    }
}