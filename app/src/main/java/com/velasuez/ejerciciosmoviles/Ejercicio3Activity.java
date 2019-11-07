package com.velasuez.ejerciciosmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Ejercicio3Activity extends AppCompatActivity {

    TextInputEditText txtvalorlado1, txtvalorlado2;
    Button btnCalcular3;
    RadioButton rbperimetro, rbarea, rbdiagonal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        txtvalorlado1 = (TextInputEditText) findViewById(R.id.txtvalorlado1);
        txtvalorlado2 = (TextInputEditText) findViewById(R.id.txtvalorlado2);
        rbperimetro = (RadioButton) findViewById(R.id.rbperimetro);
        rbarea = (RadioButton) findViewById(R.id.rbarea);
        rbdiagonal = (RadioButton) findViewById(R.id.rbdiagonal);
        btnCalcular3 = (Button) findViewById(R.id.btnCalcular3);

        btnCalcular3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtvalorlado1.getText().toString().equals("") || txtvalorlado2.getText().toString().equals("")) {
                    Toast.makeText(Ejercicio3Activity.this, "Falta ingresar datos", Toast.LENGTH_SHORT).show();
                } else {
                    calcularRectangulo();
                }
            }
        });

    }

    private void calcularRectangulo() {
        String  resultado="";
        String  valorlado1 =""+ txtvalorlado1.getText();
        String  valorlado2 =""+ txtvalorlado2.getText();

        int lado1 = Integer.parseInt(valorlado1);
        int lado2 = Integer.parseInt(valorlado2);

        if(rbperimetro.isChecked()==true){
            int perimetro = 2*(lado1+lado2);
              resultado = String.valueOf(perimetro);
              Toast.makeText(this, "El perimetro es: "+resultado, Toast.LENGTH_SHORT).show();
        }else if(rbarea.isChecked()==true){
            int area =  lado1*lado2;
             resultado = String.valueOf(area);
            Toast.makeText(this, "El el area es: "+resultado, Toast.LENGTH_SHORT).show();
        }else if(rbdiagonal.isChecked()==true){
            Double diagonal = Math.sqrt(Math.pow(lado1,2)+Math.pow(lado2,2));
             resultado = String.valueOf(diagonal);
            Toast.makeText(this, "la diagonal es: "+resultado, Toast.LENGTH_SHORT).show();
        }

    }
}
