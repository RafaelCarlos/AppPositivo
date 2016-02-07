package com.positivo.rafaellcarloss.apppositivo.Entidades;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Collection;

/**
 * Created by rafaellcarloss on 05/11/15.
 */
@DatabaseTable(tableName = "recomendados")
public class Recomendados {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "nome")
    private String nome;

    @DatabaseField(columnName = "numero_telefone")
    private String numeroTelefone;

    @ForeignCollectionField(columnName = "usuario_id")
    private Collection<Usuario> usuario;


    public Recomendados() {
    }

    public Recomendados(int id, String nome, String numeroTelefone, Collection<Usuario> usuario) {
        this.id = id;
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public Collection<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(Collection<Usuario> usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Recomendados{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", numeroTelefone='" + numeroTelefone + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
