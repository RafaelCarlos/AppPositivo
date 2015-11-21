package com.positivo.rafaellcarloss.apppositivo.Domain;

import java.util.List;

/**
 * Created by rafaellcarloss on 19/11/15.
 */
public class Contatos {

    private String id;
    private String nome;
    private List<Contatos> telefones;

    public Contatos() {
    }

    public Contatos(String id, String nome, List<Contatos> telefones) {
        this.id = id;
        this.nome = nome;
        this.telefones = telefones;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contatos> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Contatos> telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return "Contatos{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", telefones=" + telefones +
                '}';
    }
}
