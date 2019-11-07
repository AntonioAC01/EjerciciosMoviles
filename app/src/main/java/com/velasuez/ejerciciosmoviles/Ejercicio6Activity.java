package com.velasuez.ejerciciosmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Ejercicio6Activity extends AppCompatActivity {
    TextInputEditText txtnombretrabajador, txthorastrabajadas, txtprecioporhora;
    Button btnCalcular6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio6);

        txtnombretrabajador = (TextInputEditText) findViewById(R.id.txtnombretrabajador);
        txthorastrabajadas = (TextInputEditText) findViewById(R.id.txthorastrabajadas);
        txtprecioporhora = (TextInputEditText) findViewById(R.id.txtprecioporhora);
        btnCalcular6 = (Button) findViewById(R.id.btnCalcular6);


        btnCalcular6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txtnombretrabajador.getText().toString().equals("") || txthorastrabajadas.getText().toString().equals("") || txtprecioporhora.getText().toString().equals("")) {
                    Toast.makeText(Ejercicio6Activity.this, "Falta ingresar datos", Toast.LENGTH_SHORT).show();
                } else {
                    calcularSarioNeto();
                }
            }
        });
    }

    private void calcularSarioNeto() {
        Double impuesto = 0.10;
        String nombre="",horastrabajadas="";

        nombre = txtnombretrabajador.getText().toString();
        horastrabajadas= txthorastrabajadas.getText().toString();
        double precioporhora= Double.parseDouble(txtprecioporhora.getText().toString());

        int HorasTrabajass= Integer.parseInt(horastrabajadas);
        double salriobruto=(precioporhora*HorasTrabajass);
        double salarioneto= (salriobruto-(impuesto*salriobruto));


        Toast.makeText(this, "Su sueldo del Trabajador: "+nombre +"es: "+salarioneto, Toast.LENGTH_SHORT).show();
    }
}
