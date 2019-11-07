package com.velasuez.ejerciciosmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Ejercicio1Activity extends AppCompatActivity {


    TextInputEditText txtLado;
    Button btnCalcular1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        txtLado = (TextInputEditText) findViewById(R.id.txtlado);
        btnCalcular1 = (Button) findViewById(R.id.btnCalcular1);


        btnCalcular1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtLado.getText().toString().equals("")) {
                    Toast.makeText(Ejercicio1Activity.this, "Falta ingresar el lado", Toast.LENGTH_SHORT).show();
                } else {
                    calcularLadoDelCuadrado();
                }
            }
        });
    }


    public void calcularLadoDelCuadrado() {

        double area;
        double a =Double.valueOf(txtLado.getText().toString());
        area = a * a;

        Toast.makeText(this, "El Resultado es: " + area, Toast.LENGTH_SHORT).show();
    }
}
