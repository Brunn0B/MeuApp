package com.example.meuapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Botão para abrir a Exercicio1Activity
        Button buttonExercicio1 = findViewById(R.id.buttonExercicio1);
        buttonExercicio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Exercicio1Activity.class));
            }
        });

        // Botão para abrir a Exercicio2Activity
        Button buttonExercicio2 = findViewById(R.id.buttonExercicio2);
        buttonExercicio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Exercicio2Activity.class));
            }
        });

        // Botão para abrir a Exercicio3Activity
        Button buttonExercicio3 = findViewById(R.id.buttonExercicio3);
        buttonExercicio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Exercicio3Activity.class));
            }
        });

        // Botão para abrir a Exercicio4Activity
        Button buttonExercicio4 = findViewById(R.id.buttonExercicio4);
        buttonExercicio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Exercicio4Activity.class));
            }
        });

        // Botão para abrir a Exercicio5Activity
        Button buttonExercicio5 = findViewById(R.id.buttonExercicio5);
        buttonExercicio5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Exercicio5Activity.class));
            }
        });
    }
}