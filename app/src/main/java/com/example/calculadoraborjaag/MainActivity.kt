package com.example.calculadoraborjaag

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * MainActivity es la actividad principal de la calculadora.
 * Maneja la interfaz de usuario y la lógica para obtener la entrada del usuario
 * y calcular el resultado utilizando la clase Calculator.
 */

class MainActivity : AppCompatActivity() {

    private lateinit var resultado: TextView // Vista donde se muestra el resultado de la operación
    private var entrada: String = "" // Almacena la entrada del usuario
    private val calculator = Calculator() // Clase Calculator para realizar cálculos

    /**
     * Se llama cuando la actividad es creada.
     * Configura la vista y los botones para manejar las interacciones del usuario.
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultado = findViewById(R.id.resultado) // Inicializa el TextView que mostrará el resultado

        // Botones numéricos, operadores etc...
        val boton0 = findViewById<Button>(R.id.boton0)
        boton0.setOnClickListener {
            entrada += "0"
            resultado.text = entrada
        }

        val boton1 = findViewById<Button>(R.id.boton1)
        boton1.setOnClickListener {
            entrada += "1"
            resultado.text = entrada
        }

        val boton2 = findViewById<Button>(R.id.boton2)
        boton2.setOnClickListener {
            entrada += "2"
            resultado.text = entrada
        }

        val boton3 = findViewById<Button>(R.id.boton3)
        boton3.setOnClickListener {
            entrada += "3"
            resultado.text = entrada
        }

        val boton4 = findViewById<Button>(R.id.boton4)
        boton4.setOnClickListener {
            entrada += "4"
            resultado.text = entrada
        }

        val boton5 = findViewById<Button>(R.id.boton5)
        boton5.setOnClickListener {
            entrada += "5"
            resultado.text = entrada
        }

        val boton6 = findViewById<Button>(R.id.boton6)
        boton6.setOnClickListener {
            entrada += "6"
            resultado.text = entrada
        }

        val boton7 = findViewById<Button>(R.id.boton7)
        boton7.setOnClickListener {
            entrada += "7"
            resultado.text = entrada
        }

        val boton8 = findViewById<Button>(R.id.boton8)
        boton8.setOnClickListener {
            entrada += "8"
            resultado.text = entrada
        }

        val boton9 = findViewById<Button>(R.id.boton9)
        boton9.setOnClickListener {
            entrada += "9"
            resultado.text = entrada
        }

        findViewById<Button>(R.id.botonSumar).setOnClickListener {
            entrada += "+"
            resultado.text = entrada
        }

        findViewById<Button>(R.id.botonRestar).setOnClickListener {
            entrada += "-"
            resultado.text = entrada
        }

        findViewById<Button>(R.id.botonMultiplicar).setOnClickListener {
            entrada += "*"
            resultado.text = entrada
        }

        findViewById<Button>(R.id.botonDividir).setOnClickListener {
            entrada += "/"
            resultado.text = entrada
        }

        findViewById<Button>(R.id.botonCe).setOnClickListener {
            entrada = ""
            resultado.text = entrada
        }

        findViewById<Button>(R.id.botonIgual).setOnClickListener {
            // Intenta calcular el resultado a partir de la entrada del usuario
            // Si ocurre una excepción, devuelve -1 para indicar un error
            val result = try {
                calculator.calcular(entrada)
            } catch (e: Exception) {
                -1
            }
            resultado.text = result.toString()
        }
    }

}