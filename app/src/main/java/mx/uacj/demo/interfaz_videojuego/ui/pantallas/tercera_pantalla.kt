package mx.uacj.demo.interfaz_videojuego.ui.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TerceraPantalla(modificador: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modificador
            .background(Color.Black)
            .fillMaxSize()) {
        Text(
            text = "Informes de Trabajo",
            color = Color.Green,
            textAlign = TextAlign.Right,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = modificador
                .fillMaxWidth(fraction = 0.9f)
                .padding(0.dp, 5.dp)


        )
        Text(
            text = "Selecciona un Reporte de Trabajo",
            color = Color.Green,
            textAlign = TextAlign.Left,
            modifier = modificador
                .fillMaxWidth()
                .border(width = 1.dp, color = Color.Green)
                .padding(10.dp)

        )
        Row(
            modifier = modificador
                .border(width = 1.dp, color = Color.Green)
                .fillMaxWidth()
        )

        {
            Column(
                modifier = modificador
                    .border(width = 1.dp, color = Color.Green)
                    .padding(3.dp)
                    .fillMaxWidth(fraction = 0.4f)
            ) {
                Text(
                    text = "Ultimos Días de Trabajo",
                    fontFamily = FontFamily.Monospace,
                    modifier = modificador
                        .background(Color.White)
                        .padding(0.dp, 5.dp),

                    color = Color.Black,
                    textAlign = TextAlign.Left,
                    fontSize = 14.sp


                )
                Text(
                    text = "Informe De Administración",
                    fontFamily = FontFamily.Monospace,
                    modifier = modificador
                        .padding(0.dp, 5.dp),
                    color = Color.Green,
                    fontSize = 14.sp


                )

                Text(
                    text = "El sonido de la ventilación",
                    fontFamily = FontFamily.Monospace,
                    modifier = modificador
                        .padding(0.dp, 5.dp),
                    color = Color.Green,
                    fontSize = 14.sp


                )

                Text(
                    text = "Pérdida de Dinero",
                    fontFamily = FontFamily.Monospace,
                    modifier = modificador
                        .padding(0.dp, 5.dp),
                    color = Color.Green,
                    fontSize = 14.sp

                )

                Text(
                    text = "Chat Grupal #1",
                    fontFamily = FontFamily.Monospace,
                    modifier = modificador
                        .padding(0.dp, 5.dp),
                    color = Color.Green,
                    fontSize = 14.sp

                )
                Text(
                    text = "Chat Grupal #2",
                    fontFamily = FontFamily.Monospace,
                    modifier = modificador
                        .padding(0.dp, 5.dp),
                    color = Color.Green,
                    fontSize = 14.sp

                )
            }

            Column(
                modifier = modificador
                    .padding(0.dp, 5.dp)
            ) {
                Text(
                    text = "M-1: 24 DE ENERO 1972",
                    color = Color.Green,
                    fontFamily = FontFamily.Serif,
                    fontSize = 14.sp,
                    modifier = modificador
                        .padding(8.dp)
                )
                Text(
                    text = "Mandé mi noticia de renuncia a la compañía," +
                            "y no puedo estar más aliviado. " +
                            "No me agrada ese endoesqueleto, M-1. La " +
                            "forma en la que se mueve, en la que el señor " +
                            "Edwin lo trata... estaré mejor lejos de aquí",
                    color = Color.Green,
                    fontFamily = FontFamily.Serif,
                    fontSize = 12.sp,
                    modifier = modificador
                        .padding(8.dp)
                )
            }


        }

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modificador
                .fillMaxWidth(fraction = 1f)
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
fun PrevistaDelJuego3(){
    TerceraPantalla()
}