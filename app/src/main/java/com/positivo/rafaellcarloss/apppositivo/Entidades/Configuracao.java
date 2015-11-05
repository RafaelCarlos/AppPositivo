package com.positivo.rafaellcarloss.apppositivo.Entidades;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Collection;

/**
 * Created by rafaellcarloss on 05/11/15.
 */

@DatabaseTable(tableName = "configuracao")
public class Configuracao {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "notificacao")
    private Boolean notificacao;

    @DatabaseField(columnName = "email_promocional")
    private Boolean emailPromocional;

    @DatabaseField(columnName = "baixo_saldo")
    private Boolean baixoSaldo;

    @ForeignCollectionField(columnName = "usuario_id")
    private Collection<Usuario> usuario;


    public Configuracao() {
    }

    public Configuracao(int id, Boolean notificacao, Boolean emailPromocional, Boolean baixoSaldo, Collection<Usuario> usuario) {
        this.id = id;
        this.notificacao = notificacao;
        this.emailPromocional = emailPromocional;
        this.baixoSaldo = baixoSaldo;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getNotificacao() {
        return notificacao;
    }

    public void setNotificacao(Boolean notificacao) {
        this.notificacao = notificacao;
    }

    public Boolean getEmailPromocional() {
        return emailPromocional;
    }

    public void setEmailPromocional(Boolean emailPromocional) {
        this.emailPromocional = emailPromocional;
    }

    public Boolean getBaixoSaldo() {
        return baixoSaldo;
    }

    public void setBaixoSaldo(Boolean baixoSaldo) {
        this.baixoSaldo = baixoSaldo;
    }

    public Collection<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(Collection<Usuario> usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Configuracao{" +
                "id=" + id +
                ", notificacao=" + notificacao +
                ", emailPromocional=" + emailPromocional +
                ", baixoSaldo=" + baixoSaldo +
                ", usuario=" + usuario +
                '}';
    }
}
