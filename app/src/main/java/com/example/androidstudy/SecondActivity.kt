package com.example.androidstudy

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidstudy.ui.theme.AndroidStudyTheme

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent{
            AndroidStudyTheme {
                AndroidStudy()
                
            }
        }
    }
}

@Composable
fun AndroidStudy() {
    Text(text = "Hi there!")
}

@Preview
@Composable
fun AndroidStudyPreview(){
    AndroidStudyTheme {
        AndroidStudy()
    }
}