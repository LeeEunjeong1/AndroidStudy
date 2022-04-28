package com.example.androidstudy

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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

/*@Composable
fun AndroidStudy() {
    Scaffold { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)){
            Text(text = "Hi There!")
            Text(text = "Go Go Go !!")
        }
    }
}*/

@Composable
fun AndroidStudy() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "AndroidStudyWithEJ")
                },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Filled.Favorite,contentDescription = null)

                    }
                }
            )
        }
    ) { innerPadding ->
        BodyContent(Modifier.padding(innerPadding))
    }
}

@Composable
fun BodyContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "Hi there!")
        Text(text = "Thanks for going through the Layouts codelab")
    }
}

@Preview
@Composable
fun AndroidStudyPreview(){
    AndroidStudyTheme {
        AndroidStudy()
    }
}