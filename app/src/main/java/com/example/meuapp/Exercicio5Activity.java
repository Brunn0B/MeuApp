package com.example.meuapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Exercicio5Activity extends AppCompatActivity {

    private CheckBox checkBoxNotificacoes, checkBoxModoEscuro, checkBoxLembrarLogin;
    private Button buttonSalvarPreferencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio5);

        checkBoxNotificacoes = findViewById(R.id.checkBoxNotificacoes);
        checkBoxModoEscuro = findViewById(R.id.checkBoxModoEscuro);
        checkBoxLembrarLogin = findViewById(R.id.checkBoxLembrarLogin);
        buttonSalvarPreferencias = findViewById(R.id.buttonSalvarPreferencias);

        buttonSalvarPreferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder preferencias = new StringBuilder("Preferências: ");
                if (checkBoxNotificacoes.isChecked()) preferencias.append("Notificações, ");
                if (checkBoxModoEscuro.isChecked()) preferencias.append("Modo Escuro, ");
                if (checkBoxLembrarLogin.isChecked()) preferencias.append("Lembrar Login, ");

                if (preferencias.toString().equals("Preferências: ")) {
                    Toast.makeText(Exercicio5Activity.this, "Nenhuma preferência foi escolhida", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Exercicio5Activity.this, preferencias.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}