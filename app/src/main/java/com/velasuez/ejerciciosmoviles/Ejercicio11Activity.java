package com.velasuez.ejerciciosmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Ejercicio11Activity extends AppCompatActivity {

    TextInputEditText txtcantidadvarones, txtcantidadmujeres;
    Button btnCalcular11;
    RadioButton rbtotal, rbporcentajevaroes, rbporcentajemujeres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio11);

        txtcantidadvarones = (TextInputEditText) findViewById(R.id.txtcantidadvaroes);
        txtcantidadmujeres = (TextInputEditText) findViewById(R.id.txtcantidadmujeres);

        rbtotal = (RadioButton) findViewById(R.id.rbTotal);
        rbporcentajevaroes = (RadioButton) findViewById(R.id.rbPorcentajeva);
        rbporcentajemujeres = (RadioButton) findViewById(R.id.rbPorcentajemujere);
        btnCalcular11 = (Button) findViewById(R.id.btnCalcular11);

        btnCalcular11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtcantidadvarones.getText().toString().equals("") || txtcantidadmujeres.getText().toString().equals("")) {
                    Toast.makeText(Ejercicio11Activity.this, "Falta ingresar datos", Toast.LENGTH_SHORT).show();
                } else {
                    calcularPorcentajes();
                }
            }
        });

    }

    private void calcularPorcentajes() {
        double total = Double.parseDouble (txtcantidadvarones.getText().toString()) + Double.parseDouble (txtcantidadmujeres.getText().toString());
        int cantidadvaroes = Integer.parseInt(txtcantidadvarones.getText().toString());
        int cantidadmujeres = Integer.parseInt(txtcantidadmujeres.getText().toString());



        if (rbtotal.isChecked() == true) {
            Toast.makeText(this, "El total es: " + total, Toast.LENGTH_SHORT).show();
        } else if (rbporcentajevaroes.isChecked() == true) {

            double porcentajedevaroes = ((cantidadvaroes * 100) /Double.valueOf(total));

            Toast.makeText(this, "El Porcentaje de varones es: " + porcentajedevaroes, Toast.LENGTH_SHORT).show();
        } else if (rbporcentajemujeres.isChecked() == true) {
            double PorcentajeMujeres =  ((cantidadmujeres*100)/Double.valueOf(total));

            Toast.makeText(this, "El Porcentaje de Mujeres es: " + PorcentajeMujeres, Toast.LENGTH_SHORT).show();
        }
    }
}
