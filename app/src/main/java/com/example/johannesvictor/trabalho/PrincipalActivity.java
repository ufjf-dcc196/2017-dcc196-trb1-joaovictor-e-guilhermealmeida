package com.example.johannesvictor.trabalho;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.johannesvictor.trabalho.Participante;
import com.example.johannesvictor.trabalho.ParticipanteDados;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class PrincipalActivity extends AppCompatActivity {

    ListView Participantes;
    Button btnParticipantes;
    Button btnReserva;
    Button btnLivro;
    ArrayList<String> participantesLista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnParticipantes = (Button) findViewById(R.id.participante);
        btnReserva = (Button) findViewById(R.id.reserva);
        btnLivro = (Button) findViewById(R.id.livros);
        Participantes = (ListView) findViewById(R.id.listaParticipantes);

        inserirArray("Guilherme");
        inserirArray("Cindy");
        inserirArray("João");

        //Pega o edtText do participante puxa através do intent e adiciona na string listaParticipante
        String nome;
        Intent intent = getIntent();
        if(intent.hasExtra("Nome"))
        {
            nome = intent.getStringExtra("Nome");
            inserirArray(nome);
        }


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.activity_list_item, android.R.id.text1, retornaLista());
        Participantes.setAdapter(arrayAdapter);

        //-------------------------------------
        Participantes.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(PrincipalActivity.this, "long clicked", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        Participantes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(PrincipalActivity.this, "short clicked", Toast.LENGTH_SHORT).show();
            }
        });
        //-----------------

        btnParticipantes.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
               Intent it = new Intent(PrincipalActivity.this, ParticipanteActivity.class);
               startActivity(it);
           }
        });

        btnLivro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(PrincipalActivity.this, LivroActivity.class);
                startActivity(it);
            }
        });

        btnReserva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(PrincipalActivity.this, ReservaActivity.class);
                startActivity(it);
            }
        });

    }
    public void inserirArray(String valor) { participantesLista.add(valor); }
    public ArrayList<String> retornaLista() { return participantesLista; }

}
