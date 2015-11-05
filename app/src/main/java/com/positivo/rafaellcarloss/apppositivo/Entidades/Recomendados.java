package com.positivo.rafaellcarloss.apppositivo.Entidades;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Collection;

/**
 * Created by rafaellcarloss on 05/11/15.
 */
@DatabaseTable(tableName = "recomendados")
public class Recomendados {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "nome")
    private String nome;

    @DatabaseField(columnName = "numero_telefone")
    private String numeroTelefone;

    @ForeignCollectionField(columnName = "usuario_id")
    private Collection<Usuario> Usuario;
}
