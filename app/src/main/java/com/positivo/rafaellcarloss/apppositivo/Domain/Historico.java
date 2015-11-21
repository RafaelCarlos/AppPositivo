package com.positivo.rafaellcarloss.apppositivo.Domain;

/**
 * Created by rafaellcarloss on 18/11/15.
 */
public class Historico {

    private String recarga;
    private String valorRecarga;
    private String nomeContato;
    private String valor;
    private String data;

    public Historico() {
    }

    public Historico(String recarga, String valorRecarga, String nomeContato, String valor, String data) {
        this.recarga = recarga;
        this.valorRecarga = valorRecarga;
        this.nomeContato = nomeContato;
        this.valor = valor;
        this.data = data;
    }

    public String getRecarga() {
        return recarga;
    }

    public void setRecarga(String recarga) {
        this.recarga = recarga;
    }

    public String getValorRecarga() {
        return valorRecarga;
    }

    public void setValorRecarga(String valorRecarga) {
        this.valorRecarga = valorRecarga;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Historico{" +
                "recarga='" + recarga + '\'' +
                ", valorRecarga='" + valorRecarga + '\'' +
                ", nomeContato='" + nomeContato + '\'' +
                ", valor='" + valor + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
