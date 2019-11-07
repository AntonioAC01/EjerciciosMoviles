package com.velasuez.ejerciciosmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Ejercicio2Activity extends AppCompatActivity {
    TextInputEditText txtbase, txtaltura;
    Button btnCalcular2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        txtbase = (TextInputEditText) findViewById(R.id.txtbase);
        txtaltura = (TextInputEditText) findViewById(R.id.txtaltura);
        btnCalcular2 = (Button) findViewById(R.id.btnCalcular2);

        btnCalcular2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtbase.getText().toString().equals("") || txtaltura.getText().toString().equals("")) {
                    Toast.makeText(Ejercicio2Activity.this, "Falta ingresar datos", Toast.LENGTH_SHORT).show();
                } else {
                    calcularAreaDelTriangulo();
                }
            }
        });
    }

    private void calcularAreaDelTriangulo() {


        double base, altura;

        base = Double.valueOf(txtbase.getText().toString());
        altura = Double.valueOf(txtaltura.getText().toString());
        double resultadoAreaTriangulo = ((base * altura) / 2);


        Toast.makeText(this, "El Resultado es: " + resultadoAreaTriangulo, Toast.LENGTH_SHORT).show();

    }
}
