package com.positivo.rafaellcarloss.apppositivo.Entidades;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by rafaellcarloss on 14/12/15.
 */
@DatabaseTable(tableName = "operadora")
public class Operadora implements Serializable {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField
    private String nomeOperadora;

    @DatabaseField
    private String codigoOperadora;

    @ForeignCollectionField
    private Collection<Produto> produtos;


    public Operadora() {
    }

    public Operadora(int id, String nomeOperadora, String codigoOperadora) {
        this.id = id;
        this.nomeOperadora = nomeOperadora;
        this.codigoOperadora = codigoOperadora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeOperadora() {
        return nomeOperadora;
    }

    public void setNomeOperadora(String nomeOperadora) {
        this.nomeOperadora = nomeOperadora;
    }

    public String getCodigoOperadora() {
        return codigoOperadora;
    }

    public void setCodigoOperadora(String codigoOperadora) {
        this.codigoOperadora = codigoOperadora;
    }

    public Collection<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Collection<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Operadora{" +
                "id=" + id +
                ", nomeOperadora='" + nomeOperadora + '\'' +
                ", codigoOperadora='" + codigoOperadora + '\'' +
                ", produtos=" + produtos +
                '}';
    }
}
