package com.example.johannesvictor.trabalho;

/**
 * Created by Johannes Victor on 26/10/2017.
 */

class Livro {

    String Titulo;
    String Editora;
    String Ano;

    public Livro(String titulo, String editora, String ano)  {
        this.Titulo = titulo;
        Editora = editora;
        Ano = ano;
    }

    public String getTitulo() { return Titulo; }

    public void setTitulo(String titulo) { this.Titulo = titulo; }

    public String getEditora() { return Editora; }

    public void setEditora(String editora) { Editora = editora; }

    public String getAno() { return Ano; }

    public void setAno(String ano) {
        Ano = ano;
    }

    @Override
    public String toString(){
        return this.Titulo;
    }

}
