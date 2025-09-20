package mx.uacj.demo.interfaz_videojuego.ui.pantallas

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@SuppressLint("Range")
@Composable
fun SegundaPantalla(modificador: Modifier = Modifier){


    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modificador
            .fillMaxSize()
            .background(Color.Black)){

        Text(
            text="H. E. L. P. E. R",
            color= Color.Green,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,

            modifier = modificador
                .padding(5.dp)
                .fillMaxWidth(fraction = 0.9f)


        )

        Column (
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modificador
                .fillMaxWidth(fraction = 0.9f)
                .fillMaxHeight(fraction = 0.3f)
                .border(width = 1.dp, color = Color.Green)
                .padding(10.dp)){


            Text(

                textAlign = TextAlign.Center,
                color = Color.Yellow,
                text= "Error: Daño en la estructura - 65%",
                modifier = modificador.padding(5.dp, 15.dp),
                fontWeight = FontWeight.W800

            )
            Text(
                text="Advertencia: El Show no debe activarse hasta que Luna esté reparado",
                color= Color.Yellow,
                textAlign = TextAlign.Center,
                modifier = modificador.padding(5.dp)
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modificador
                .fillMaxWidth(fraction = 1f).padding(5.dp, 15.dp)

        ) {

            Text(
                text = "Reiniciar el Show",
                color = Color.Green,
                modifier = modificador
                    .padding(5.dp)
                    .fillMaxWidth(fraction = 0.9f)
                    .border(width = 1.dp, color = Color.Green),

                fontSize = 18.sp,
                fontFamily = FontFamily.Monospace

            )
            Text(
                text = "Abrir la Puerta de Personal",
                color = Color.White,
                modifier = modificador
                    .padding(5.dp)
                    .fillMaxWidth(fraction = 0.9f),

                fontSize = 18.sp,
                fontFamily = FontFamily.Monospace
            )

            Text(
                text = "Salir",
                color = Color.White,
                modifier = modificador
                    .padding(5.dp)
                    .fillMaxWidth(fraction = 0.9f),
                fontSize = 18.sp,
                fontFamily = FontFamily.Monospace
            )



        }

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modificador
                .fillMaxWidth(fraction = 0.9f)
                .border(width = 1.dp, color = Color.Green)
                .padding(10.dp)
        ) {
            Text(
                text = "[W/S] Cursor",
                color = Color.Green,
                fontSize = 14.sp,
                fontFamily = FontFamily.Monospace,
                modifier = modificador
                    .padding(5.dp)
                    .fillMaxWidth(fraction = 0.9f),

                )
            Text(
                text = "[ESPACIO] Seleccionar",
                color = Color.Green,
                fontSize = 14.sp,
                fontFamily = FontFamily.Monospace,
                modifier = modificador
                    .padding(5.dp)
                    .fillMaxWidth(fraction = 0.9f),

                )
        }




    }

}

@Preview(showBackground = true)
@Composable
fun PrevistaDelJuego2(){
    SegundaPantalla()
}