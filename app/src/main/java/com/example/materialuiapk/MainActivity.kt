package com.example.materialuiapk

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.materialuiapk.ui.theme.MaterialUIapkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialUIapkTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Home()
                }
            }
        }
    }
}
@Composable
fun Home(){
    Scaffold (
        topBar = {
            TopAppBar(
                title = { Text("Tech Blogs") },
                navigationIcon = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(Icons.Filled.Menu, contentDescription = null)
                    }

                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.Notifications, contentDescription = "Localized description")
                    }
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.Search, contentDescription = "Localized description")
                    }
                }
            )
        },

        floatingActionButton = { FloatingActionButton(onClick = { }, backgroundColor = MaterialTheme.colors.primary) {
            Icon(Icons.Filled.Call, contentDescription = "Chat Icon")
        }},

        content = {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                Card(modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(), shape = MaterialTheme.shapes.medium, elevation = 10.dp) {
                    Column(modifier = Modifier
                        .padding(10.dp)) {
                        Image(painter = painterResource(R.drawable.coding), contentDescription = null)

                        Spacer(modifier = Modifier.height(10.dp))
//
//
                        Text(text = "Best Apps to learn coding without laptop", fontSize = 22.sp, fontWeight = FontWeight.W600)
                        Spacer(modifier = Modifier.height(10.dp))

                        Text(text = "Centre sets stiffer 40% air pollution reduction target for cities by 2026. air pollution may increase hospitalisation risk for autistic children: Study.")
//
                        Spacer(modifier = Modifier.height(10.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ){
                            Icon(Icons.Filled.Share, contentDescription = null)
                            Button(onClick = { /*TODO*/ }) {
                                Text(text = "Read More")
                            }
                        }
                    }
                }
                Card(modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(), shape = MaterialTheme.shapes.medium, elevation = 10.dp) {
                    Column(modifier = Modifier
                        .padding(10.dp)) {
                        Image(painter = painterResource(R.drawable.arduino), contentDescription = null)

                        Spacer(modifier = Modifier.height(10.dp))
//
//
                        Text(text = "What is Arduino and what are its specifications.", fontSize = 22.sp, fontWeight = FontWeight.W600)
                        Spacer(modifier = Modifier.height(10.dp))

                        Text(text = "An Arduino is a development board. It is an open-source hardware and software platform. The term “open source platform” refers to the fact that Arduino is designed ")
//
                        Spacer(modifier = Modifier.height(10.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ){
                            Icon(Icons.Filled.Share, contentDescription = null)
                            Button(onClick = { /*TODO*/ }) {
                                Text(text = "Read More")
                            }
                        }
                    }
                }
                Card(modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(), shape = MaterialTheme.shapes.medium, elevation = 10.dp) {
                    Column(modifier = Modifier
                        .padding(10.dp)) {
                        Image(painter = painterResource(R.drawable.google), contentDescription = null)

                        Spacer(modifier = Modifier.height(10.dp))
//
//
                        Text(text = "Google’s Free Machine Learning Course Is Waiting For You", fontSize = 22.sp, fontWeight = FontWeight.W600)
                        Spacer(modifier = Modifier.height(10.dp))

                        Text(text = "Google’s free machine learning course that anyone can take at their own place. This course is officially launched by Google for all those who want to start a career in machine learning.")
//
                        Spacer(modifier = Modifier.height(10.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ){
                            Icon(Icons.Filled.Share, contentDescription = null)
                            Button(onClick = { /*TODO*/ }) {
                                Text(text = "Read More")
                            }
                        }
                    }
                }
                Card(modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(), shape = MaterialTheme.shapes.medium, elevation = 10.dp) {
                    Column(modifier = Modifier
                        .padding(10.dp)) {
                        Image(painter = painterResource(R.drawable.google1), contentDescription = null)

                        Spacer(modifier = Modifier.height(10.dp))
//
//
                        Text(text = "Google Offering Internship For Engineering Students", fontSize = 22.sp, fontWeight = FontWeight.W600)
                        Spacer(modifier = Modifier.height(10.dp))

                        Text(text = "It is an internship that is given by Google every year. The full form of the Student Training in Engineering Program This is an on-site internship programme in which if the candidate gets selected,")
//
                        Spacer(modifier = Modifier.height(10.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ){
                            Icon(Icons.Filled.Share, contentDescription = null)
                            Button(onClick = { /*TODO*/ }) {
                                Text(text = "Read More")
                            }
                        }
                    }
                }




            }
        },

        )
}


//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    MaterialUIapkTheme {
//        Greeting("Android")
//    }
//}