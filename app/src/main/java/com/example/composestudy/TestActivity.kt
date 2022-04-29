package com.example.composestudy

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composestudy.ui.theme.ComposeStudyTheme

class TestActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeStudyTheme{
                MyApp()
            }
        }
    }
}
@Composable
fun MyApp(){
    Surface(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(all = 30.dp),
        color = Color(0xFF4666d0)
    ) {
        Column() {
            Hello( "Android")
            ShowAge(26666666)
        }

    }
}

@Composable
fun Hello(name:String){
    Text(text = "Hello $name!")
}
@Preview
@Composable
fun ShowAge(age: Int = 25){
    Text(text = age.toString())
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    MyApp()
}

