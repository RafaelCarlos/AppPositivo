package com.positivo.rafaellcarloss.apppositivo.Entidades;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

import java.util.Collection;

/**
 * Created by rafaellcarloss on 05/11/15.
 */
public class Cartoes {

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

    @ForeignCollectionField(columnName = "usuario_id")
    private Collection<Usuario> Usuario;
}
