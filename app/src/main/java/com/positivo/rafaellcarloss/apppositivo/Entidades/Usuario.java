package com.positivo.rafaellcarloss.apppositivo.Entidades;

/**
 * Created by rafaellcarloss on 06/10/15.
 */

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;
import java.util.Collection;

@DatabaseTable(tableName = "usuario")
public class Usuario implements Serializable {

    @DatabaseField(generatedId = false)
    private int id;

    @DatabaseField(columnName = "nome")
    private String nome;

    @DatabaseField(columnName = "sobre_nome")
    private String sobreNome;

    @DatabaseField(columnName = "email")
    private String email;

    @DatabaseField(columnName = "senha")
    private String senha;

    @DatabaseField(columnName = "id_facebook")
    private String idFacebook;

    @DatabaseField(columnName = "ativo")
    private Boolean ativo;

    @DatabaseField(dataType = DataType.STRING, columnName = "tipo_usuario")
    private TipoUsuario tipoUsuario;

    @ForeignCollectionField
    private Collection<Carteira> carteira;

    @ForeignCollectionField
    private Collection<Cartoes> cartoes;

    @ForeignCollectionField
    private Collection<CelularRecarga> celularRecarga;

    @ForeignCollectionField
    private Collection<Configuracao> configuracao;

    @ForeignCollectionField
    private Collection<RecargaGratis> recargaGratis;

    @ForeignCollectionField
    private Collection<Recomendados> recomendados;


    public Usuario() {
    }


    public Usuario(int id, String nome, String sobreNome, String email, String senha, String idFacebook, Boolean ativo, TipoUsuario tipoUsuario) {
        this.id = id;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.email = email;
        this.senha = senha;
        this.idFacebook = idFacebook;
        this.ativo = ativo;
        this.tipoUsuario = tipoUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getIdFacebook() {
        return idFacebook;
    }

    public void setIdFacebook(String idFacebook) {
        this.idFacebook = idFacebook;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Collection<Carteira> getCarteira() {
        return carteira;
    }

    public void setCarteira(Collection<Carteira> carteira) {
        this.carteira = carteira;
    }

    public Collection<Cartoes> getCartoes() {
        return cartoes;
    }

    public void setCartoes(Collection<Cartoes> cartoes) {
        this.cartoes = cartoes;
    }

    public Collection<CelularRecarga> getCelularRecarga() {
        return celularRecarga;
    }

    public void setCelularRecarga(Collection<CelularRecarga> celularRecarga) {
        this.celularRecarga = celularRecarga;
    }

    public Collection<Configuracao> getConfiguracao() {
        return configuracao;
    }

    public void setConfiguracao(Collection<Configuracao> configuracao) {
        this.configuracao = configuracao;
    }

    public Collection<RecargaGratis> getRecargaGratis() {
        return recargaGratis;
    }

    public void setRecargaGratis(Collection<RecargaGratis> recargaGratis) {
        this.recargaGratis = recargaGratis;
    }

    public Collection<Recomendados> getRecomendados() {
        return recomendados;
    }

    public void setRecomendados(Collection<Recomendados> recomendados) {
        this.recomendados = recomendados;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", idFacebook='" + idFacebook + '\'' +
                ", ativo=" + ativo +
                ", tipoUsuario=" + tipoUsuario +
                ", carteira=" + carteira +
                ", cartoes=" + cartoes +
                ", celularRecarga=" + celularRecarga +
                ", configuracao=" + configuracao +
                ", recargaGratis=" + recargaGratis +
                ", recomendados=" + recomendados +
                '}';
    }
}
