package mx.uacj.demo.interfaz_videojuego

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import mx.uacj.demo.interfaz_videojuego.ui.pantallas.PantallaInterfaz
import mx.uacj.demo.interfaz_videojuego.ui.theme.Interfaz_videojuegoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Interfaz_videojuegoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { padding_interno ->
                    PantallaNavega(
                        modificador = Modifier.padding(padding_interno)
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Interfaz_videojuegoTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { padding_interno ->
            PantallaInterfaz(
                modificador = Modifier.padding(padding_interno)
            )
        }
    }
}