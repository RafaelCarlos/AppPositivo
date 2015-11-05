package com.positivo.rafaellcarloss.apppositivo.Entidades;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

import java.util.Collection;

/**
 * Created by rafaellcarloss on 05/11/15.
 */
public class CelularRecarga {


    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "nome_contato")
    private String nomeContato;

    @ForeignCollectionField(columnName = "usuario_id")
    private Collection<Usuario> usuario;

    public CelularRecarga() {
    }

    public CelularRecarga(int id, String nomeContato, Collection<Usuario> usuario) {
        this.id = id;
        this.nomeContato = nomeContato;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public Collection<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(Collection<Usuario> usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "CelularRecarga{" +
                "id=" + id +
                ", nomeContato='" + nomeContato + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
