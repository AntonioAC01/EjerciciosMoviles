package com.velasuez.ejerciciosmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Ejercicio12Activity extends AppCompatActivity {


    TextInputEditText txtcantidadvarones12, txtcantidadmujeres12;
    Button btnCalcular12;
    CheckBox chtotal, chporcentajevaroes, chporcentajemujeres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio12);


        txtcantidadvarones12 = (TextInputEditText) findViewById(R.id.txtcantidadvaroes12);
        txtcantidadmujeres12 = (TextInputEditText) findViewById(R.id.txtcantidadmujeres12);


        chtotal = (CheckBox) findViewById(R.id.chTotal);
        chporcentajevaroes = (CheckBox) findViewById(R.id.chPorcentajeva);
        chporcentajemujeres = (CheckBox) findViewById(R.id.chPorcentajemujere);
        btnCalcular12 = (Button) findViewById(R.id.btnCalcular12);

        btnCalcular12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtcantidadvarones12.getText().toString().equals("") || txtcantidadmujeres12.getText().toString().equals("")) {
                    Toast.makeText(Ejercicio12Activity.this, "Falta ingresar datos", Toast.LENGTH_SHORT).show();
                } else {
                    calcularPorcentajes();
                }
            }
        });
    }

    private void calcularPorcentajes() {
        double total = Double.parseDouble (txtcantidadvarones12.getText().toString()) + Double.parseDouble (txtcantidadmujeres12.getText().toString());
        int cantidadvaroes = Integer.parseInt(txtcantidadvarones12.getText().toString());
        int cantidadmujeres = Integer.parseInt(txtcantidadmujeres12.getText().toString());



        if (chtotal.isChecked() == true) {
            Toast.makeText(this, "El total es: " + total, Toast.LENGTH_SHORT).show();
        } else if (chporcentajevaroes.isChecked() == true) {

            double porcentajedevaroes = ((cantidadvaroes * 100) /Double.valueOf(total));

            Toast.makeText(this, "El Porcentaje de varones es: " + porcentajedevaroes, Toast.LENGTH_SHORT).show();
        } else if (chporcentajemujeres.isChecked() == true) {
            double PorcentajeMujeres =  ((cantidadmujeres*100)/Double.valueOf(total));

            Toast.makeText(this, "El Porcentaje de Mujeres es: " + PorcentajeMujeres, Toast.LENGTH_SHORT).show();
        }



    }
}
