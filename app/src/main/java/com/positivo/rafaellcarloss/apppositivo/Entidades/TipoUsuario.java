package com.positivo.rafaellcarloss.apppositivo.Entidades;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by rafaellcarloss on 05/11/15.
 */

@DatabaseTable(tableName = "tipo_usuario")
public class TipoUsuario {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "nome_tipo")
    private String nome_tipo;

    @DatabaseField(foreign = true)
    private Usuario usuario;

    public TipoUsuario() {
    }

    public TipoUsuario(int id, String nome_tipo, Usuario usuario) {
        this.id = id;
        this.nome_tipo = nome_tipo;
        this.usuario = usuario;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_tipo() {
        return nome_tipo;
    }

    public void setNome_tipo(String nome_tipo) {
        this.nome_tipo = nome_tipo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "TipoUsuario{" +
                "id=" + id +
                ", nome_tipo='" + nome_tipo + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
