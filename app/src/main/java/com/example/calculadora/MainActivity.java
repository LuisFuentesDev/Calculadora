package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText numero1 = findViewById(R.id.numero1);
        EditText numero2 = findViewById(R.id.numero2);



        Button sumar = findViewById(R.id.buttonSumar);

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = numero1.getText().toString();
                String n2 = numero2.getText().toString();

                Toast.makeText(getBaseContext(), "Sumaste " + n1 + " " + n2, Toast.LENGTH_LONG).show();
            }
        });

        Button restar = findViewById(R.id.buttonRestar);

        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = numero1.getText().toString();
                String n2 = numero2.getText().toString();

                Toast.makeText(getBaseContext(), "Restaste " + n1 + " " + n2, Toast.LENGTH_LONG).show();
            }
        });

        Button multiplicar = findViewById(R.id.buttonMultiplicar);
        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = numero1.getText().toString();
                String n2 = numero2.getText().toString();

                Toast.makeText(getBaseContext(), "Multiplicaste " + n1 + " " + n2, Toast.LENGTH_LONG).show();
            }
        });

        Button dividir = findViewById(R.id.buttonDividir);
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = numero1.getText().toString();
                String n2 = numero2.getText().toString();

                Toast.makeText(getBaseContext(), "Dividiste " + n1 + " " + n2, Toast.LENGTH_LONG).show();
            }
        });
    }

}



