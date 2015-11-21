package com.positivo.rafaellcarloss.apppositivo.Domain;

/**
 * Created by rafaellcarloss on 19/11/15.
 */
public class Telefone {

    String telefone;

    public Telefone() {
    }

    public Telefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "telefone='" + telefone + '\'' +
                '}';
    }
}
