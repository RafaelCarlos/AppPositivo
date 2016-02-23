package com.positivo.rafaellcarloss.apppositivo.Entidades;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by rafaellcarloss on 05/11/15.
 */
@DatabaseTable(tableName = "recarga_gratis")
public class RecargaGratis implements Serializable{

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "codigo")
    private String codigo;

    @DatabaseField(foreign = true)
    private Usuario usuario;

    public RecargaGratis() {
    }

    public RecargaGratis(int id, String codigo) {
        this.id = id;
        this.codigo = codigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "RecargaGratis{" +
                "id=" + id +
                ", codigo='" + codigo + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
