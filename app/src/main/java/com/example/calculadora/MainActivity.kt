package com.example.calculadora

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numero1 = findViewById<EditText>(R.id.numero1)
        val numero2 = findViewById<EditText>(R.id.numero2)
        val sumar = findViewById<Button>(R.id.buttonSumar)
        val restar = findViewById<Button>(R.id.buttonRestar)
        val multiplicar = findViewById<Button>(R.id.buttonMultiplicar)
        val dividir = findViewById<Button>(R.id.buttonDividir)
        sumar.setOnClickListener(View.OnClickListener {
            val num1 = numero1.text.toString().trim { it <= ' ' }
            val num2 = numero2.text.toString().trim { it <= ' ' }
            if (num1.isEmpty() || num2.isEmpty()) {
                Toast.makeText(baseContext, "Faltan números por ingresar", Toast.LENGTH_SHORT)
                    .show()
                return@OnClickListener
            }
            val n1 = num1.toInt()
            val n2 = num2.toInt()
            val suma = n1 + n2
            Toast.makeText(baseContext, "Resultado: $suma", Toast.LENGTH_SHORT).show()
        })

        // Button restar = findViewById(R.id.buttonRestar);
        restar.setOnClickListener(View.OnClickListener {
            val num1 = numero1.text.toString().trim { it <= ' ' }
            val num2 = numero2.text.toString().trim { it <= ' ' }
            if (num1.isEmpty() || num2.isEmpty()) {
                Toast.makeText(baseContext, "Faltan números por ingresar", Toast.LENGTH_SHORT)
                    .show()
                return@OnClickListener
            }
            val n1 = num1.toInt()
            val n2 = num2.toInt()
            val resta = n1 - n2
            Toast.makeText(baseContext, "Resultado: $resta", Toast.LENGTH_SHORT).show()
        })

        //   Button multiplicar = findViewById(R.id.buttonMultiplicar);
        multiplicar.setOnClickListener(View.OnClickListener {
            val num1 = numero1.text.toString().trim { it <= ' ' }
            val num2 = numero2.text.toString().trim { it <= ' ' }
            if (num1.isEmpty() || num2.isEmpty()) {
                Toast.makeText(baseContext, "Faltan números por ingresar", Toast.LENGTH_SHORT)
                    .show()
                return@OnClickListener
            }
            val n1 = num1.toInt()
            val n2 = num2.toInt()
            val multiplicacion = n1 * n2
            Toast.makeText(baseContext, "Resultado: $multiplicacion", Toast.LENGTH_SHORT).show()
        })

        //   Button dividir = findViewById(R.id.buttonDividir);
        dividir.setOnClickListener(View.OnClickListener {
            val num1 = numero1.text.toString().trim { it <= ' ' }
            val num2 = numero2.text.toString().trim { it <= ' ' }
            if (num1.isEmpty() || num2.isEmpty()) {
                Toast.makeText(baseContext, "Faltan números por ingresar", Toast.LENGTH_SHORT)
                    .show()
                return@OnClickListener
            }
            val n1 = num1.toInt().toDouble()
            val n2 = num2.toInt().toDouble()
            val division = n1 / n2
            Toast.makeText(baseContext, "Resultado: $division", Toast.LENGTH_SHORT).show()
        })
    }
}