package com.example.contable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.contable.ui.theme.ContableTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContableTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CargarDiseño()
                }
            }
        }
    }
}

@Composable
fun CargarDiseño() {

    Box (modifier = Modifier.background(Color.Green)){
        MostrarTextos()
    }
}
@Preview(showBackground = true)
@Composable
fun BirthDayCardPreview(){
    ContableTheme {
        //BirthdayGreetingWithImage(stringResource(R.string.happy_birthday_sam), stringResource(R.string.from_rafael_torres))
        CargarDiseño()
    }
}
@Composable
fun MostrarTextos(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier.fillMaxSize().background(Color.Blue).padding(50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.saludo_txt),
            fontSize = 36.sp,
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}
