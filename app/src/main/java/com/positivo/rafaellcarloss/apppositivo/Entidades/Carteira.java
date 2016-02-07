package com.positivo.rafaellcarloss.apppositivo.Entidades;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;

/**
 * Created by rafaellcarloss on 05/11/15.
 */
@DatabaseTable(tableName = "carteira")
public class Carteira implements Serializable {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "saldo")
    private BigDecimal saldo;

    @ForeignCollectionField(columnName = "usuario_id")
    private Collection<Usuario> usuario;

    public Carteira() {
    }

    public Carteira(int id, BigDecimal saldo, Collection<Usuario> usuario) {
        this.id = id;
        this.saldo = saldo;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Collection<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(Collection<Usuario> usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Carteira{" +
                "id=" + id +
                ", saldo=" + saldo +
                ", usuario=" + usuario +
                '}';
    }
}
