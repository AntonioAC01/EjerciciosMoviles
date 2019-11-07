package com.velasuez.ejerciciosmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Ejercicio10Activity extends AppCompatActivity {
    TextInputEditText txtcantidaddoncion;
    Button btnCalcular10;
    CheckBox chPediatria, chmedicin, chginecologia, chtraumatologia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio10);


        txtcantidaddoncion = (TextInputEditText) findViewById(R.id.txtcantidaddonacion10);

        chPediatria = (CheckBox) findViewById(R.id.chPediatria);
        chmedicin = (CheckBox) findViewById(R.id.chMedicina);
        chginecologia = (CheckBox) findViewById(R.id.chGinecologia);
        chtraumatologia = (CheckBox) findViewById(R.id.chTraumatologia);
        btnCalcular10 = (Button) findViewById(R.id.btnCalcular10);

        btnCalcular10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtcantidaddoncion.getText().toString().equals("")) {
                    Toast.makeText(Ejercicio10Activity.this, "Falta ingresar datos", Toast.LENGTH_SHORT).show();
                } else {
                    calcularCantidadDonacion();
                }
            }
        });
    }

    private void calcularCantidadDonacion() {

        double pedriatria = 0.20;
        double medicinageneral = 0.45;
        double geinecologia = 0.30;


        double areamedicina = (Double.parseDouble(txtcantidaddoncion.getText().toString())) * medicinageneral;
        double areaginecologia = (Double.parseDouble(txtcantidaddoncion.getText().toString())) * geinecologia;
        double medicinalgeneral = areamedicina + areaginecologia;
        double areaPedriatria = ((Double.parseDouble(txtcantidaddoncion.getText().toString())) / medicinalgeneral) * pedriatria;
        double areaTraumatologia = ((Double.parseDouble(txtcantidaddoncion.getText().toString())) - (areaPedriatria + areamedicina + areaginecologia));

        if (chPediatria.isChecked() == true) {
            Toast.makeText(this, "Cantidad Pediatria es: " + areaPedriatria, Toast.LENGTH_SHORT).show();
        } else if (chmedicin.isChecked() == true) {
            Toast.makeText(this, "Cantidad Medicina es: " + areamedicina, Toast.LENGTH_SHORT).show();
        } else if (chginecologia.isChecked() == true) {
            Toast.makeText(this, "Cantidad Ginecologia es: " + areaginecologia, Toast.LENGTH_SHORT).show();
        } else if (chtraumatologia.isChecked() == true) {
            Toast.makeText(this, "Cantidad Traumatologia es: " + areaTraumatologia, Toast.LENGTH_SHORT).show();
        }
    }
}
