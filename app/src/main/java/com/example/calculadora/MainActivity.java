package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.BreakIterator;
import java.text.StringCharacterIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText numero1 = findViewById(R.id.numero1);
        EditText numero2 = findViewById(R.id.numero2);



        Button sumar = findViewById(R.id.buttonSumar);
        Button restar = findViewById(R.id.buttonRestar);
        Button multiplicar = findViewById(R.id.buttonMultiplicar);
        Button dividir = findViewById(R.id.buttonDividir);

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    String num1 = numero1.getText().toString().trim();
                    String num2 = numero2.getText().toString().trim();

                    if (num1.isEmpty() || num2.isEmpty()) {
                        Toast.makeText(getBaseContext(), "Faltan números por ingresar", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    int n1 = Integer.parseInt(num1);
                    int n2 = Integer.parseInt(num2);

                    int suma = n1 + n2;

                    Toast.makeText(getBaseContext(), "Resultado: " + suma, Toast.LENGTH_SHORT).show();
                }
            });

        // Button restar = findViewById(R.id.buttonRestar);

        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = numero1.getText().toString().trim();
                String num2 = numero2.getText().toString().trim();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getBaseContext(), "Faltan números por ingresar", Toast.LENGTH_SHORT).show();
                    return;
                }

                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);

                int resta = n1 - n2;

                Toast.makeText(getBaseContext(), "Resultado: " + resta, Toast.LENGTH_SHORT).show();
            }
        });

        //   Button multiplicar = findViewById(R.id.buttonMultiplicar);
        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = numero1.getText().toString().trim();
                String num2 = numero2.getText().toString().trim();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getBaseContext(), "Faltan números por ingresar", Toast.LENGTH_SHORT).show();
                    return;
                }

                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);

                int multiplicacion = n1 * n2;

                Toast.makeText(getBaseContext(), "Resultado: " + multiplicacion, Toast.LENGTH_SHORT).show();
            }
        });

        //   Button dividir = findViewById(R.id.buttonDividir);
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = numero1.getText().toString().trim();
                String num2 = numero2.getText().toString().trim();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getBaseContext(), "Faltan números por ingresar", Toast.LENGTH_SHORT).show();
                    return;
                }

                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);

                int division = n1 / n2;

                Toast.makeText(getBaseContext(), "Resultado: " + division, Toast.LENGTH_SHORT).show();
            }
        });
    }

}



