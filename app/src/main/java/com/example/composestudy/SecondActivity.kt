package com.example.composestudy

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.composestudy.ui.theme.AndroidStudyTheme

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
    ) {
       // BodyContent(Modifier.padding(innerPadding))
       // SimpleList()
        ImageList()

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

@Composable
fun SimpleList(){
    val scrollState = rememberScrollState()
    Column(Modifier.verticalScroll(scrollState)){
        repeat(100){
            Text("Item #$it")
        }
    }
}

@Composable
fun ImageList(){
    val scrollState = rememberLazyListState()

    LazyColumn(state = scrollState){
        items(100){
            ImageListItem(it)
        }
    }
}

@Composable
fun ImageListItem(index: Int){
    Row(verticalAlignment = Alignment.CenterVertically){
        Image(
            painter = rememberImagePainter(
                data = "https://developer.android.com/images/brand/Android_Robot.png"
            ),
            contentDescription = "Android Logo",
            modifier = Modifier.size(50.dp)
        )
        Spacer(Modifier.width(10.dp))
        Text("Iten #$index",style = MaterialTheme.typography.subtitle1)
    }
}
