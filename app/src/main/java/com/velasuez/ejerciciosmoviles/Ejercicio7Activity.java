package com.velasuez.ejerciciosmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Ejercicio7Activity extends AppCompatActivity {
    TextInputEditText txtcantidadsoles;
    Button btnCalcular7;
    RadioButton rbdolares, rbeuros, rbmarcos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio7);

        txtcantidadsoles = (TextInputEditText) findViewById(R.id.txtcantidadsoles);

        rbdolares = (RadioButton) findViewById(R.id.rbdolares);
        rbeuros = (RadioButton) findViewById(R.id.rbeuros);
        rbmarcos = (RadioButton) findViewById(R.id.rbmarcos);
        btnCalcular7 = (Button) findViewById(R.id.btnCalcular7);

        btnCalcular7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtcantidadsoles.getText().toString().equals("")) {
                    Toast.makeText(Ejercicio7Activity.this, "Falta ingresar datos", Toast.LENGTH_SHORT).show();
                } else {
                    calcularMonedas();
                }
            }
        });
    }

    private void calcularMonedas() {

        String resultado = "";

        double preciodolar = 3.50;
        double precioeuro = 0.90;
        final double preciomarcos = 0.98;

        double cantidad = Double.parseDouble(txtcantidadsoles.getText().toString());


        if (rbdolares.isChecked() == true) {
            double dolar = cantidad * preciodolar;
            resultado = String.valueOf(dolar);
            Toast.makeText(this, "Cantidad Dolares es: " + resultado, Toast.LENGTH_SHORT).show();
        } else if (rbeuros.isChecked() == true) {
            double euro =  cantidad*precioeuro;
             resultado = String.valueOf(euro);
            Toast.makeText(this, "Cantidad Euros es: " + resultado, Toast.LENGTH_SHORT).show();
        } else if (rbmarcos.isChecked() == true) {
            double marcos = cantidad*preciomarcos;
            resultado = String.valueOf(marcos);
            Toast.makeText(this, "Cantidad de Marcos es: " + resultado, Toast.LENGTH_SHORT).show();
        }

    }
}
