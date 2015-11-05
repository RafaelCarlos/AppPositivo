package com.positivo.rafaellcarloss.apppositivo.Entidades;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Collection;

/**
 * Created by rafaellcarloss on 05/11/15.
 */
@DatabaseTable(tableName = "recarga_gratis")
public class RecargaGratis {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "codigo")
    private String codigo;

    @ForeignCollectionField(columnName = "usuario_id")
    private Collection<Usuario> usuario;

    public RecargaGratis() {
    }

    public RecargaGratis(int id, String codigo, Collection<Usuario> usuario) {
        this.id = id;
        this.codigo = codigo;
        this.usuario = usuario;
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

    public Collection<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(Collection<Usuario> usuario) {
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
