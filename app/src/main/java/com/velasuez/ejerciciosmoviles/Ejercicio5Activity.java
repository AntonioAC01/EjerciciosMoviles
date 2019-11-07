package com.velasuez.ejerciciosmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Ejercicio5Activity extends AppCompatActivity {
    TextInputEditText txtlibros, txtcuadernos, txtlapiceros;
    Button btnCalcular5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio5);


        txtlibros = (TextInputEditText) findViewById(R.id.txtlibros);
        txtcuadernos = (TextInputEditText) findViewById(R.id.txtcuadernos);
        txtlapiceros = (TextInputEditText) findViewById(R.id.txtlapiceros);
        btnCalcular5 = (Button) findViewById(R.id.btnCalcular5);


        btnCalcular5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txtlibros.getText().toString().equals("") || txtcuadernos.getText().toString().equals("") || txtlapiceros.getText().toString().equals("")) {
                    Toast.makeText(Ejercicio5Activity.this, "Falta ingresar datos", Toast.LENGTH_SHORT).show();
                } else {
                    calcularMontoTotal();
                }
            }
        });
    }

    private void calcularMontoTotal() {

        Double libro = 100.00;
        Double cuaderno = 10.50;
        Double lapiceros = 5.35;

        int cantidaddelibros = Integer.parseInt(txtlibros.getText().toString());
        int cantidaddecuadernos = Integer.parseInt(txtcuadernos.getText().toString());
        int cantidaddelapiceros = Integer.parseInt(txtlibros.getText().toString());
        double totalmonto = ((cantidaddecuadernos * cuaderno) + (cantidaddelapiceros * lapiceros) + (cantidaddelibros * libro));

        Toast.makeText(this, "El total monto es: " + totalmonto, Toast.LENGTH_SHORT).show();
    }
}
