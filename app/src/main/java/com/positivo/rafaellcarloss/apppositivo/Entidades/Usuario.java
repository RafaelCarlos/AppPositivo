package com.positivo.rafaellcarloss.apppositivo.Entidades;

/**
 * Created by rafaellcarloss on 06/10/15.
 */

import com.j256.ormlite.android.*;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "usuario")
public class Usuario {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "nome")
    private String nome;

    private String sobreNome;

    private String email;

    private String senha;

    private String idFacebook;

    private Boolean ativo;


}
