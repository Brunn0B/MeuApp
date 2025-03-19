package com.example.meuapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class Exercicio4Activity extends AppCompatActivity {

    private EditText editTextNome;
    private Button buttonGerarCheckboxes;
    private LinearLayout linearLayoutCheckboxes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio4);

        editTextNome = findViewById(R.id.editTextNome);
        buttonGerarCheckboxes = findViewById(R.id.buttonGerarCheckboxes);
        linearLayoutCheckboxes = findViewById(R.id.linearLayoutCheckboxes);

        buttonGerarCheckboxes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = editTextNome.getText().toString();
                linearLayoutCheckboxes.removeAllViews();

                for (char c : nome.toCharArray()) {
                    CheckBox checkBox = new CheckBox(Exercicio4Activity.this);
                    checkBox.setText(String.valueOf(c));
                    linearLayoutCheckboxes.addView(checkBox);
                }
            }
        });
    }
}