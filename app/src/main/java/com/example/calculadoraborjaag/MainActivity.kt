package com.example.calculadoraborjaag

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var resultado: TextView
    private var entrada: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultado = findViewById(R.id.resultado)

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

        findViewById<Button>(R.id.botonCe).setOnClickListener {
            entrada = ""
            resultado.text = entrada
        }

        findViewById<Button>(R.id.botonIgual).setOnClickListener {
            val result = try {
                calcular(entrada)
            } catch (e: Exception) {
                -1
            }
            resultado.text = result.toString()
        }
    }

    private fun calcular(input: String): Int {
        return if (!input.contains("+")) {
            input.toInt()
        } else {
            val numeros = input.split("+", limit = 2)
            calcular(numeros[0]) + calcular(numeros[1])
        }
    }
}