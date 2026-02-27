package me.cesarcaselles.quizandroidandrescala

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.cesarcaselles.quizandroidandrescala.ui.theme.QuizAndroidAndresCalaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrimerPantalla()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PrimerPantalla() {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 16.dp, bottom = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Encabezado",
            modifier = Modifier
                .background(Color.Cyan)
                .padding(16.dp)
        )
        Row(modifier = Modifier
            .background(Color.Green),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "Item 1",
                modifier = Modifier
                    .padding(20.dp)
                    .background(Color.Yellow)
            )
            Text(
                text = "Item 2",
                modifier = Modifier
                    .padding(20.dp)
                    .background(Color.LightGray)

            )
            Text(
                text = "Item 3",
                modifier = Modifier
                    .padding(20.dp)
                    .background(Color.Magenta)
            )
        }
        Row(verticalAlignment = Alignment.Bottom){
            Text(
                text = "Pie de Pagina",
                modifier = Modifier
                    .background(Color.Red)
                    .padding(16.dp)
            )
        }

    }
}