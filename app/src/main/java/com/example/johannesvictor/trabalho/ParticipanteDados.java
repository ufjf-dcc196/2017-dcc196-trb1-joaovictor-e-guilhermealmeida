package com.example.johannesvictor.trabalho;

import java.util.ArrayList;
import com.example.johannesvictor.trabalho.Participante;

/**
 * Created by Johannes Victor on 28/10/2017.
 */

public class ParticipanteDados {

    private static ArrayList<Participante> dadosParticipantes = new ArrayList<>();
    private static ParticipanteDados instance;

    private ParticipanteDados() {

    }

    public static ParticipanteDados getInstance() {

        if(instance == null) {
            instance = new ParticipanteDados();
            dadosParticipantes.add(new Participante(dadosParticipantes.size(), "Guilherme", "guigaaya@gemei.com"));
            dadosParticipantes.add(new Participante(dadosParticipantes.size(), "Cindy", "cindylauper@gemei.com"));
            dadosParticipantes.add(new Participante(dadosParticipantes.size(), "Jao", "jaofam@gemei.com"));

        }
        return instance;
    }

    public void add(Participante p) { dadosParticipantes.add(p); }

    public Participante get(int i){
        return dadosParticipantes.get(i);
    }

    public ArrayList<Participante> getDadosParticipantes() { return dadosParticipantes; }

    public void setDadosParticipantes(ArrayList<Participante> dadosParticipantes) {
        ParticipanteDados.dadosParticipantes = dadosParticipantes;
    }

    public void setInstance(ParticipanteDados instance) {
        ParticipanteDados.instance = instance;
    }
}
