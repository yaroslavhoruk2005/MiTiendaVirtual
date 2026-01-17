package com.example.mitiendavirtual

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import com.example.mitiendavirtual.data.Producto
import com.example.mitiendavirtual.ui.navigation.GestorNavegacion

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                val productos = listOf(
                    Producto(
                        1,
                        "Camiseta Real de Madrid completa",
                        199.99,
                        "Camiseta del iconico club mas grande de la historia de la temporada actual incluyendo parche y dorsal a gusto \n MESSI queda totalmente PROHIBIDO",
                        R.drawable.camisetareal
                    ),
                    Producto(
                        2,
                        "Camiseta Retro Real de Madrid",
                        149.99,
                        "La iconica camiseta de la temporada 99/00 esta de vuelta comprala que la nostalgia vende :)",
                        R.drawable.camisetaretro
                    ),
                                // Aqui ya me he cansado asi que a copiar todo del store del madrid
                    Producto(
                        3,
                        "Sudadera Cremallera Hombre Classic Marron",
                        74.99,
                        "Una sudadera con cremallera de la colección Classic pensada para tu día a día: tejido suave, tonos neutros y un diseño limpio con el escudo del Real Madrid integrado de forma discreta en el pecho. Combina elegancia y comodidad para que puedas llevar tus colores con estilo en todos tus momentos de ocio.",
                        R.drawable.sudaderamarron
                    ),
                    Producto(
                        4,
                        "Chaqueta Chándal Hombre adidas Entrenamiento 25/26 Morada",
                        84.99,
                        "Con unos colores inspirados en la segunda equipación del Real Madrid, esta chaqueta de fútbol adidas es idéntica a la que visten los jugadores para representar a su equipo cuando están fuera del terreno de juego. Se ha confeccionado en un tejido ligero con tecnología transpirable AEROREADY que mantiene la piel seca, evitando las distracciones y garantizando la máxima comodidad. El escudo del club cosido en el pecho refleja tu lealtad incondicional.",
                        R.drawable.sudaderaentrnamiento
                    ),
                    Producto(
                        5,
                        "Pantalón Chándal Hombre adidas Entrenamiento 25/26 Negro",
                        67.67,
                        "Con los colores de la segunda equipación del Real Madrid, este pantalón adidas es el que visten los jugadores para representar a su equipo cuando están fuera del terreno de juego. La tecnología transpirable AEROREADY y la cintura con cordón ajustable garantizan una total comodidad. El escudo del club bordado en la pernera refleja tu lealtad incondicional.",
                        R.drawable.pantalonnreal
                    )
                )

                GestorNavegacion(productos = productos)
            }
        }
    }
}
