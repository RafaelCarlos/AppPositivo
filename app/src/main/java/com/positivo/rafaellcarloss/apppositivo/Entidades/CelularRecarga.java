package com.positivo.rafaellcarloss.apppositivo.Entidades;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by rafaellcarloss on 05/11/15.
 */
public class CelularRecarga implements Serializable {


    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "nome_contato", canBeNull = true)
    private String nomeContato;

    @DatabaseField(dataType = DataType.BIG_DECIMAL)
    private BigDecimal valor;

    @DatabaseField(columnName = "numero_celular", canBeNull = false)
    private String numeroCelular;

    @DatabaseField(dataType = DataType.DATE, columnName = "data_recarga")
    private Date dataRecarga;

    @DatabaseField(foreign = true)
    private Usuario usuario;

    public CelularRecarga() {
    }

    public CelularRecarga(int id, String nomeContato, BigDecimal valor, String numeroCelular, Date dataRecarga) {
        this.id = id;
        this.nomeContato = nomeContato;
        this.valor = valor;
        this.numeroCelular = numeroCelular;
        this.dataRecarga = dataRecarga;
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

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public Date getDataRecarga() {
        return dataRecarga;
    }

    public void setDataRecarga(Date dataRecarga) {
        this.dataRecarga = dataRecarga;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "CelularRecarga{" +
                "id=" + id +
                ", nomeContato='" + nomeContato + '\'' +
                ", valor=" + valor +
                ", numeroCelular='" + numeroCelular + '\'' +
                ", dataRecarga=" + dataRecarga +
                ", usuario=" + usuario +
                '}';
    }
}
