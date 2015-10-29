package com.positivo.rafaellcarloss.apppositivo.Domain;

/**
 * Created by rafaellcarloss on 29/10/15.
 */
public class RecargaGratis {

    private int foto;
    private String nome;

    public RecargaGratis() {
    }

    public RecargaGratis(int foto, String nome) {
        this.foto = foto;
        this.nome = nome;
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
}

