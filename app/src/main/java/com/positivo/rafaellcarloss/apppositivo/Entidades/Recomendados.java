package com.positivo.rafaellcarloss.apppositivo.Entidades;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * Created by rafaellcarloss on 05/11/15.
 */
@DatabaseTable(tableName = "recomendados")
public class Recomendados implements Serializable{

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "nome")
    private String nome;

    @DatabaseField(columnName = "numero_telefone")
    private String numeroTelefone;

    @DatabaseField(columnName = "codigo_recomendado")
    private String codigoRecomendado;

    @DatabaseField(foreign = true, columnName = "usuario_id")
    private Usuario usuario;


    public Recomendados() {
    }

    public Recomendados(int id, String nome, String numeroTelefone, String codigoRecomendado) {
        this.id = id;
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.codigoRecomendado = codigoRecomendado;
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

    public String getCodigoRecomendado() {
        return codigoRecomendado;
    }

    public void setCodigoRecomendado(String codigoRecomendado) {
        this.codigoRecomendado = codigoRecomendado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Recomendados{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", numeroTelefone='" + numeroTelefone + '\'' +
                ", codigoRecomendado='" + codigoRecomendado + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
