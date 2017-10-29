package com.example.johannesvictor.trabalho;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class LivroActivity extends AppCompatActivity {

    EditText Titulo;
    EditText Ano;
    EditText Editora;
    Button Salvar;
    Button Voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livro);

        Titulo = (EditText) findViewById(R.id.titulo);
        Ano =(EditText) findViewById(R.id.Ano);
        Editora = (EditText) findViewById(R.id.editora);
        Salvar = (Button) findViewById(R.id.salvarlivro);
        Voltar = (Button) findViewById(R.id.voltarlivro);

        Voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it;
                it = new Intent(LivroActivity.this, PrincipalActivity.class);
                startActivity(it);
            }
        });

        Salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String titulo = Titulo.getText().toString();
                String editora = Editora.getText().toString();
                String ano = Ano.getText().toString();
                if(titulo.length() > 0){
                    Intent i = new Intent(LivroActivity.this, LivrosListaActivity.class);
                    i.putExtra("titulo", titulo);
                    i.putExtra("editora", editora);
                    i.putExtra("ano", ano);
                    startActivity(i);
                }
            }
        });
    }
}
