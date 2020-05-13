package com.udemy.estudointerfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Selecao extends AppCompatActivity {

    private CheckBox verde, amarelo, vermelho;
    TextView checked;
    Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecao);

        enviar = findViewById(R.id.enviar_cores);
        checked = findViewById(R.id.corSelecionada);
        verde = findViewById(R.id.checkBoxVerde);
        amarelo = findViewById(R.id.checkBoxAmarelo);
        vermelho = findViewById(R.id.checkBoxVermelho);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviar();

            }
        });

    }

    public void enviar(){
        if(verde.isChecked()){
            checked.setText("verde selecionado");
        }else if (amarelo.isChecked()){
            checked.setText(("amarelo selecionado"));
        }else{
            checked.setText("vermelho selecionado");
        }

    }
}
