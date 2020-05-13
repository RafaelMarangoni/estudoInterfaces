package com.udemy.estudointerfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText dados_nome;
    private TextView resultado;
    private Button enviar, transicao;

    Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dados_nome = findViewById(R.id.input_nome);
        resultado = findViewById(R.id.textView);
        enviar = findViewById(R.id.button);
        transicao = findViewById(R.id.proxima_tela);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String dados =  dados_nome.getText().toString();
               resultado.setText(dados);
            }
        });

        transicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, Selecao.class);
                startActivity(intent);
            }
        });
    }
}
