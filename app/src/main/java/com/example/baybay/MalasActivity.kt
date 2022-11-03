package com.example.baybay

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.baybay.data.ListMotivasiMalas
import com.example.baybay.model.MotivasiMalas

/*class MalasActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MalasApp()
        }
    }
}

@Composable
fun MalasApp(listMotivasiMalas: List<MotivasiMalas>){
    Column(){
        listMotivasiMalas.forEach(MotivasiMalas ->
            MalasCard(MotivasiMalas)
        )
    }
}

@Composable
fun MalasCard(motivasiMalas: MotivasiMalas){
    Card(elevation = 8.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Column() {
            Image(painter = painterResource(id = R.drawable.image1),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(text = stringResource(id = R.string.affirmation1),
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.h6
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MalasCardPreview(){
    MalasCard(listM)
}*/

class MalasActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MalasApp(listMotivasiMalas = ListMotivasiMalas().loadMotivasiMalas())
        }
    }
}

@Composable
fun MalasApp(listMotivasiMalas: List<MotivasiMalas>) {

    LazyColumn(){
        items(listMotivasiMalas){ motivation ->
            MalasCard(motivation)

        }
    }
    /*Column() {
        listMotivasiMalas.forEach { motivation ->
            MalasCard(motivation)
        }
    }*/
}

@Composable
fun MalasCard(motivasiMalas: MotivasiMalas) {
    Card(
        elevation = 8.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Column() {
            Image(
                painter = painterResource(id = motivasiMalas.imageResources),
                contentDescription = stringResource(id = R.string.affirmation1),
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(id = motivasiMalas.textResources),
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.h6
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MalasCardPreview() {
    MalasApp(listMotivasiMalas = ListMotivasiMalas().loadMotivasiMalas())
}