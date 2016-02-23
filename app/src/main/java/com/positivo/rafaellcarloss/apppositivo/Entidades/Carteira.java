package com.positivo.rafaellcarloss.apppositivo.Entidades;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by rafaellcarloss on 05/11/15.
 */
@DatabaseTable(tableName = "carteira")
public class Carteira implements Serializable {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "saldo")
    private BigDecimal saldo;

    @DatabaseField(foreign = true)
    private Usuario usuario;

    public Carteira() {
    }

    public Carteira(int id, BigDecimal saldo) {
        this.id = id;
        this.saldo = saldo;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
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
