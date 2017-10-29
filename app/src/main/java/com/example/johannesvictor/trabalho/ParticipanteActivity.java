package com.example.johannesvictor.trabalho;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class ParticipanteActivity extends AppCompatActivity {

    EditText Nome;
    EditText Email;
    Button Salvar;
    Button Voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participante);

        Nome = (EditText) findViewById(R.id.nomeParticipante);
        Email = (EditText) findViewById(R.id.emailParticipante);
        Salvar = (Button) findViewById(R.id.cadastrarParticipante);
        Voltar = (Button) findViewById(R.id.btnVoltar);

        Salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nome = Nome.getText().toString();
                if(nome.length() > 0){
                    Intent i = new Intent(ParticipanteActivity.this, PrincipalActivity.class);
                    i.putExtra("Nome", nome);
                    startActivity(i);
                }
            }
        });

        Voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(ParticipanteActivity.this, PrincipalActivity.class);
                startActivity(it);
            }
        });
    }
}
