package com.example.azterketa_di

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.azterketa_di.ui.theme.Azterketa_DITheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Azterketa_DITheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val paddinga=40.dp
    val kaixo="Hello Android!"
    Column(
        modifier = Modifier
            .background(Color.Cyan)
            .padding(paddinga)
            .fillMaxSize()
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row (
            modifier = Modifier
                .background(Color.Gray)
                .padding(paddinga)
                .fillMaxWidth()
        ){
            Column (
                horizontalAlignment = Alignment.Start

            ){
                Text(kaixo, Modifier.background(Color.Red))
            }
            Column (

                horizontalAlignment = Alignment.End
            ){
                Text(kaixo, Modifier.background(Color.Red))
                Text(kaixo, Modifier.background(Color.Red))
                Text(kaixo, Modifier.background(Color.Red))
            }
        }
        Row (
            modifier = Modifier
                .background(Color.White)
                .padding(paddinga)
        ){
            Text(kaixo)
        }
        Row (
            modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
            ,
            horizontalArrangement = Arrangement.SpaceEvenly

        ){
            Column(
                modifier= Modifier

                    .background(Color.Blue)
                ,
            ) {
                BotoiZenbakiduna("1")
                BotoiZenbakiduna("2")
                BotoiZenbakiduna("3")
            }
            Column(
                modifier= Modifier
                    .background(Color.Magenta)
                    .padding(horizontal = paddinga)
            ) {
                BotoiZenbakiduna("4")
                BotoiZenbakiduna("5")
                BotoiZenbakiduna("6")
            }
            Column(
                modifier= Modifier
                    .background(Color.Black)
            ) {
                BotoiZenbakiduna("7")
                BotoiZenbakiduna("8")
                BotoiZenbakiduna("9")
            }
        }
//        Row (
//            modifier = Modifier
//                .background(Color.Yellow)
//                .padding(paddinga)
//                .fillMaxSize()
//            ,
//            horizontalArrangement = Arrangement.Center,
//            verticalAlignment = Alignment.CenterVertically
//        ){
//            Column (
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.Center,
//            ){
//                Text("Resultado")
//                Text("666")
//            }
//
//        }
        Column (
            modifier = Modifier
                .background(Color.Yellow)
               .padding(paddinga)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ){
            Text("Resultado")
            Text("666")
        }
    }
}

// Zenbaki bat duen, funtzionalitaterik gabeko botoia, 60 display pixeleko tamainakoa.
@Composable
fun BotoiZenbakiduna(zk: String){
    Button(onClick ={}, Modifier.size(60.dp)) {Text(zk)}
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Azterketa_DITheme {
        Greeting("Android")
    }
}