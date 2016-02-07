package com.positivo.rafaellcarloss.apppositivo.Domain;

/**
 * Created by rafaellcarloss on 28/10/15.
 */
public class Carteira {

    private int foto;
    private String titulo;
    private String descricao;

    public Carteira() {
    }
    public Carteira(int foto, String titulo, String descricao) {
        this.foto = foto;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
