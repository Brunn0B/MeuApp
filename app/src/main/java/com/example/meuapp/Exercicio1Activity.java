package com.example.meuapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Exercicio1Activity extends AppCompatActivity {

    private EditText editTextNome, editTextIdade;
    private Button buttonVerificar;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1);

        editTextNome = findViewById(R.id.editTextNome);
        editTextIdade = findViewById(R.id.editTextIdade);
        buttonVerificar = findViewById(R.id.buttonVerificar);
        textViewResultado = findViewById(R.id.textViewResultado);

        buttonVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = editTextNome.getText().toString();
                String idadeTexto = editTextIdade.getText().toString();

                if (nome.isEmpty()) {
                    textViewResultado.setText("Por favor, insira seu nome.");
                    return;
                }

                if (idadeTexto.isEmpty()) {
                    textViewResultado.setText("Por favor, insira uma idade válida.");
                    return;
                }

                try {
                    int idade = Integer.parseInt(idadeTexto);

                    String resultado;
                    if (idade >= 18) {
                        resultado = nome + " é maior de idade.";
                    } else {
                        resultado = nome + " é menor de idade.";
                    }

                    textViewResultado.setText(resultado);
                } catch (NumberFormatException e) {
                    textViewResultado.setText("Idade inválida. Digite um número.");
                }
            }
        });
    }
}