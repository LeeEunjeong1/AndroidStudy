package com.example.composestudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composestudy.ui.theme.ComposeStudyTheme

class Calculator : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            MyApp {
                Text(text = "Hello Again")
            }
        }
    }
}
@Composable
fun MyApp(content: @Composable () -> Unit){
    ComposeStudyTheme() {
        Surface(color = MaterialTheme.colors.background){
            content()
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2(){
    MyApp {
        Text(text = "Hello Again")
    }
}