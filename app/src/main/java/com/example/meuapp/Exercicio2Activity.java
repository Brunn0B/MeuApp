package com.example.meuapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Exercicio2Activity extends AppCompatActivity {

    private EditText editTextValor1, editTextValor2;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio2);

        editTextValor1 = findViewById(R.id.editTextValor1);
        editTextValor2 = findViewById(R.id.editTextValor2);
        textViewResultado = findViewById(R.id.textViewResultado);

        Button buttonSomar = findViewById(R.id.buttonSomar);
        Button buttonSubtrair = findViewById(R.id.buttonSubtrair);
        Button buttonMultiplicar = findViewById(R.id.buttonMultiplicar);
        Button buttonDividir = findViewById(R.id.buttonDividir);

        buttonSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular('+');
            }
        });

        buttonSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular('-');
            }
        });

        buttonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular('*');
            }
        });

        buttonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular('/');
            }
        });
    }

    private void calcular(char operacao) {
        String valor1Texto = editTextValor1.getText().toString();
        String valor2Texto = editTextValor2.getText().toString();

        if (valor1Texto.isEmpty() || valor2Texto.isEmpty()) {
            textViewResultado.setText("Por favor, insira ambos os valores.");
            return;
        }

        try {
            double valor1 = Double.parseDouble(valor1Texto);
            double valor2 = Double.parseDouble(valor2Texto);
            double resultado = 0;

            switch (operacao) {
                case '+':
                    resultado = valor1 + valor2;
                    break;
                case '-':
                    resultado = valor1 - valor2;
                    break;
                case '*':
                    resultado = valor1 * valor2;
                    break;
                case '/':
                    if (valor2 != 0) {
                        resultado = valor1 / valor2;
                    } else {
                        textViewResultado.setText("Erro: Divisão por zero.");
                        return;
                    }
                    break;
            }

            textViewResultado.setText("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            textViewResultado.setText("Valores inválidos. Digite números.");
        }
    }
}