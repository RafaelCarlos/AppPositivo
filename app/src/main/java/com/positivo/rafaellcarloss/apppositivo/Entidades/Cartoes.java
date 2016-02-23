package com.positivo.rafaellcarloss.apppositivo.Entidades;

import com.j256.ormlite.field.DatabaseField;

import java.io.Serializable;

/**
 * Created by rafaellcarloss on 05/11/15.
 */
public class Cartoes implements Serializable {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "numero_cartao")
    private String numeroCartao;

    @DatabaseField(columnName = "nome_titular")
    private String nomeTitular;

    @DatabaseField(columnName = "codigo_seguranca")
    private String codigoSeguranca;

    @DatabaseField(columnName = "validade")
    private String validade;

    @DatabaseField(columnName = "cpf")
    private String cpf;

    @DatabaseField(foreign = true)
    private Usuario usuario;

    public Cartoes() {
    }

    public Cartoes(String numeroCartao, String nomeTitular, String codigoSeguranca, String validade, String cpf) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.codigoSeguranca = codigoSeguranca;
        this.validade = validade;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Cartoes{" +
                "id=" + id +
                ", numeroCartao='" + numeroCartao + '\'' +
                ", nomeTitular='" + nomeTitular + '\'' +
                ", codigoSeguranca='" + codigoSeguranca + '\'' +
                ", validade='" + validade + '\'' +
                ", cpf='" + cpf + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
