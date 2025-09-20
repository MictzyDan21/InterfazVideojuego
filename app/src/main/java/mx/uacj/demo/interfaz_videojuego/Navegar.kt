package mx.uacj.demo.interfaz_videojuego

import android.widget.Button
import androidx.compose.foundation.background
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import mx.uacj.demo.interfaz_videojuego.ui.pantallas.PantallaInterfaz
import mx.uacj.demo.interfaz_videojuego.ui.pantallas.SegundaPantalla
import mx.uacj.demo.interfaz_videojuego.ui.pantallas.TerceraPantalla


enum class Pantallas{
    pantalla_1,
    pantalla_2,
    pantalla_3
}

@Composable
fun PantallaNavega(modificador: Modifier = Modifier){
    var mostrar_pantalla: Pantallas by remember {
        mutableStateOf(Pantallas.pantalla_1) }

    when(mostrar_pantalla){
        Pantallas.pantalla_1 -> PantallaInterfaz()
        Pantallas.pantalla_2 -> SegundaPantalla()
        Pantallas.pantalla_3 -> TerceraPantalla()

    }

   Button(onClick = {
       when(mostrar_pantalla) {
           Pantallas.pantalla_1 ->{
               mostrar_pantalla = Pantallas.pantalla_2
           }
           Pantallas.pantalla_2 ->{
               mostrar_pantalla = Pantallas.pantalla_3

           }
           Pantallas.pantalla_3 ->{
               mostrar_pantalla = Pantallas.pantalla_1
           }
   }
   }, modifier = modificador) {
       Text("Cambiar de pantalla")



   }
}