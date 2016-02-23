package com.positivo.rafaellcarloss.apppositivo.Entidades;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by rafaellcarloss on 14/12/15.
 */
@DatabaseTable(tableName = "produto")
public class Produto implements Serializable {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "nome_produto")
    private String nomeProduto;

    @DatabaseField(dataType = DataType.BIG_DECIMAL, columnName = "valor_produto")
    private BigDecimal valorProduto;

    @DatabaseField(columnName = "validade")
    private int validade;

    @DatabaseField(columnName = "codigo_produto")
    private String codigoProduto;

    @DatabaseField(foreign = true, columnName = "operadora_id")
    private Operadora operadora;

    public Produto() {
    }

    public Produto(int id, String nomeProduto, BigDecimal valorProduto, int validade, String codigoProduto) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.validade = validade;
        this.codigoProduto = codigoProduto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public BigDecimal getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(BigDecimal valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public Operadora getOperadora() {
        return operadora;
    }

    public void setOperadora(Operadora operadora) {
        this.operadora = operadora;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", valorProduto=" + valorProduto +
                ", validade=" + validade +
                ", codigoProduto='" + codigoProduto + '\'' +
                ", operadora=" + operadora +
                '}';
    }
}
