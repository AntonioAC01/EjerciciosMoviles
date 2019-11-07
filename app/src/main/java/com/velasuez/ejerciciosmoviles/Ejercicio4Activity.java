package com.velasuez.ejerciciosmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Ejercicio4Activity extends AppCompatActivity {
    TextInputEditText txtvalorlado14, txtvalorlado24;
    Button btnCalcular4;
    CheckBox chperimetro, charea, chdiagonal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);

        txtvalorlado14 = (TextInputEditText) findViewById(R.id.txtvalorlado14);
        txtvalorlado24 = (TextInputEditText) findViewById(R.id.txtvalorlado24);
        chperimetro = (CheckBox) findViewById(R.id.chperimetro);
        charea = (CheckBox) findViewById(R.id.charea);
        chdiagonal = (CheckBox) findViewById(R.id.chdiagonal);
        btnCalcular4 = (Button) findViewById(R.id.btnCalcular4);

        btnCalcular4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txtvalorlado14.getText().toString().equals("") || txtvalorlado24.getText().toString().equals("")) {
                    Toast.makeText(Ejercicio4Activity.this, "Falta ingresar datos", Toast.LENGTH_SHORT).show();
                } else {
                    calcularRectangulo4();
                }
            }
        });
    }

    private void calcularRectangulo4() {
        String  resultado="";
        String  valorlado1 =""+ txtvalorlado14.getText();
        String  valorlado2 =""+ txtvalorlado24.getText();

        int lado1 = Integer.parseInt(valorlado1);
        int lado2 = Integer.parseInt(valorlado2);

        if(chperimetro.isChecked()==true){
            int perimetro = 2*(lado1+lado2);
            resultado = String.valueOf(perimetro);
            Toast.makeText(this, "El perimetro es: "+resultado, Toast.LENGTH_SHORT).show();
        }else if(charea.isChecked()==true){
            int area =  lado1*lado2;
            resultado = String.valueOf(area);
            Toast.makeText(this, "El el area es: "+resultado, Toast.LENGTH_SHORT).show();
        }else if(chdiagonal.isChecked()==true){
            Double diagonal = Math.sqrt(Math.pow(lado1,2)+Math.pow(lado2,2));
            resultado = String.valueOf(diagonal);
            Toast.makeText(this, "la diagonal es: "+resultado, Toast.LENGTH_SHORT).show();
        }





    }
}
