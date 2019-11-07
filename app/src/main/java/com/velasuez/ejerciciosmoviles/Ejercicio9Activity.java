package com.velasuez.ejerciciosmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Ejercicio9Activity extends AppCompatActivity {
    TextInputEditText txtdoncion;
    Button btnCalcular9;
    RadioButton rbPediatria, rbmedicin, rbginecologia, rbtraumatologia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio9);

        txtdoncion = (TextInputEditText) findViewById(R.id.txtdonacion);

        rbPediatria = (RadioButton) findViewById(R.id.rbPediatria);
        rbmedicin = (RadioButton) findViewById(R.id.rbMedicina);
        rbginecologia = (RadioButton) findViewById(R.id.rbGinecología);
        rbtraumatologia = (RadioButton) findViewById(R.id.rbTraumatologia);
        btnCalcular9 = (Button) findViewById(R.id.btnCalcular9);

        btnCalcular9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtdoncion.getText().toString().equals("")) {
                    Toast.makeText(Ejercicio9Activity.this, "Falta ingresar datos", Toast.LENGTH_SHORT).show();
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


        double areamedicina = (Double.parseDouble(txtdoncion.getText().toString())) * medicinageneral;
        double areaginecologia = (Double.parseDouble(txtdoncion.getText().toString())) * geinecologia;
        double medicinalgeneral = areamedicina + areaginecologia;
        double areaPedriatria = ((Double.parseDouble(txtdoncion.getText().toString())) / medicinalgeneral) * pedriatria;
        double areaTraumatologia = ((Double.parseDouble(txtdoncion.getText().toString())) - (areaPedriatria + areamedicina + areaginecologia));

        if (rbPediatria.isChecked() == true) {
            Toast.makeText(this, "Cantidad Pediatria es: " + areaPedriatria, Toast.LENGTH_SHORT).show();
        } else if (rbmedicin.isChecked() == true) {
            Toast.makeText(this, "Cantidad Medicina es: " + areamedicina, Toast.LENGTH_SHORT).show();
        } else if (rbginecologia.isChecked() == true) {
            Toast.makeText(this, "Cantidad Ginecologia es: " + areaginecologia, Toast.LENGTH_SHORT).show();
        } else if (rbtraumatologia.isChecked() == true) {
            Toast.makeText(this, "Cantidad Traumatologia es: " + areaTraumatologia, Toast.LENGTH_SHORT).show();
        }
    }
}
