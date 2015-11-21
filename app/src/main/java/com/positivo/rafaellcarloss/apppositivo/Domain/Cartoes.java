package com.positivo.rafaellcarloss.apppositivo.Domain;

/**
 * Created by rafaellcarloss on 18/11/15.
 */
public class Cartoes {

    private int foto;
    private String nome;
    private String numeroFinal;

    public Cartoes() {
    }

    public Cartoes(int foto, String nome, String numeroFinal) {
        this.foto = foto;
        this.nome = nome;
        this.numeroFinal = numeroFinal;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroFinal() {
        return numeroFinal;
    }

    public void setNumeroFinal(String numeroFinal) {
        this.numeroFinal = numeroFinal;
    }

    @Override
    public String toString() {
        return "Cartoes{" +
                "foto=" + foto +
                ", nome='" + nome + '\'' +
                ", numeroFinal='" + numeroFinal + '\'' +
                '}';
    }
}
