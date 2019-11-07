package com.velasuez.ejerciciosmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Ejercicio8Activity extends AppCompatActivity {
    TextInputEditText txtcantidadsoles8;
    CheckBox chdolares, cheuros, chmarcos;
    Button btnCalcular8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio8);
        txtcantidadsoles8 = (TextInputEditText) findViewById(R.id.txtcantidadsoles8);

        chdolares = (CheckBox) findViewById(R.id.chdolares);
        cheuros = (CheckBox) findViewById(R.id.cheuros);
        chmarcos = (CheckBox) findViewById(R.id.chmarcos);
        btnCalcular8 = (Button) findViewById(R.id.btnCalcular8);

        btnCalcular8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtcantidadsoles8.getText().toString().equals("")) {
                    Toast.makeText(Ejercicio8Activity.this, "Falta ingresar datos", Toast.LENGTH_SHORT).show();
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

        double cantidad = Double.parseDouble(txtcantidadsoles8.getText().toString());


        if (chdolares.isChecked() == true) {
            double dolar = cantidad * preciodolar;
            resultado = String.valueOf(dolar);
            Toast.makeText(this, "Cantidad Dolares es: " + resultado, Toast.LENGTH_SHORT).show();
        } else if (cheuros.isChecked() == true) {
            double euro =  cantidad*precioeuro;
            resultado = String.valueOf(euro);
            Toast.makeText(this, "Cantidad Euros es: " + resultado, Toast.LENGTH_SHORT).show();
        } else if (chmarcos.isChecked() == true) {
            double marcos = cantidad*preciomarcos;
            resultado = String.valueOf(marcos);
            Toast.makeText(this, "Cantidad de Marcos es: " + resultado, Toast.LENGTH_SHORT).show();
        }
    }
}
