package com.velasuez.ejerciciosmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btnEjercicio1,btnEjercicio2,btnEjercicio3,btnEjercicio4,btnEjercicio5,btnEjercicio6,btnEjercicio7,btnEjercicio8
            ,btnEjercicio9,btnEjercicio10,btnEjercicio11,btnEjercicio12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEjercicio1=(Button)findViewById(R.id.btnEjercicio1);
        btnEjercicio2=(Button)findViewById(R.id.btnEjercicio2);
        btnEjercicio3=(Button)findViewById(R.id.btnEjercicio3);
        btnEjercicio4=(Button)findViewById(R.id.btnEjercicio4);
        btnEjercicio5=(Button)findViewById(R.id.btnEjercicio5);
        btnEjercicio6=(Button)findViewById(R.id.btnEjercicio6);
        btnEjercicio7=(Button)findViewById(R.id.btnEjercicio7);
        btnEjercicio8=(Button)findViewById(R.id.btnEjercicio8);
        btnEjercicio9=(Button)findViewById(R.id.btnEjercicio9);
        btnEjercicio10=(Button)findViewById(R.id.btnEjercicio10);
        btnEjercicio11=(Button)findViewById(R.id.btnEjercicio11);
        btnEjercicio12=(Button)findViewById(R.id.btnEjercicio12);

        inicializarButtons();
    }

    public void inicializarButtons(){
        btnEjercicio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), Ejercicio1Activity.class);
                startActivity(intent);
            }
        });

        btnEjercicio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), Ejercicio2Activity.class);
                startActivity(intent);
            }
        });
        btnEjercicio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), Ejercicio3Activity.class);
                startActivity(intent);
            }
        });
        btnEjercicio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), Ejercicio4Activity.class);
                startActivity(intent);
            }
        });
        btnEjercicio5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), Ejercicio5Activity.class);
                startActivity(intent);
            }
        });
        btnEjercicio6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), Ejercicio6Activity.class);
                startActivity(intent);
            }
        });
        btnEjercicio7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), Ejercicio7Activity.class);
                startActivity(intent);
            }
        });
        btnEjercicio8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), Ejercicio8Activity.class);
                startActivity(intent);
            }
        });
        btnEjercicio9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), Ejercicio9Activity.class);
                startActivity(intent);
            }
        });
        btnEjercicio10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), Ejercicio10Activity.class);
                startActivity(intent);
            }
        });
        btnEjercicio11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), Ejercicio11Activity.class);
                startActivity(intent);
            }
        });
        btnEjercicio12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), Ejercicio12Activity.class);
                startActivity(intent);
            }
        });
    }


}
