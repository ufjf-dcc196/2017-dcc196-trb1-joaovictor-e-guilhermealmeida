package com.example.johannesvictor.trabalho;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class LivrosListaActivity extends AppCompatActivity {

    Button Adicionar;
    Button Voltar;
    ListView Livros;
    ArrayList<Livro> livrosLista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livros_lista);

        Adicionar = (Button) findViewById(R.id.adicionaLivro);
        Voltar = (Button) findViewById(R.id.voltarlivro);

        Livro livro = new Livro("Harry Potter", "CAusando", "1998");
        inserirArray(livro);
        String titulo;
        String editora;
        String ano;
        Intent intent = getIntent();
        if(intent.hasExtra("titulo") && intent.hasExtra("editora") && intent.hasExtra("ano"))
        {
            titulo = intent.getStringExtra("titulo");
            editora = intent.getStringExtra("editora");
            ano = intent.getStringExtra("ano");
            Livro li = new Livro(titulo, editora, ano);
            inserirArray(li);
        }

        Livros = (ListView) findViewById(R.id.listalivros);
        ArrayAdapter<Livro> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_2, android.R.id.text2, retornaLista() );
        Livros.setAdapter(arrayAdapter);



        Adicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(LivrosListaActivity.this,LivroActivity.class);
                startActivity(it);
            }
        });


    }
    public void inserirArray(Livro livro)
    {
        livrosLista.add(livro);
    }
    public ArrayList<Livro> retornaLista()
    {
        return livrosLista;
    }
}
