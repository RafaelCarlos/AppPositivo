package com.positivo.rafaellcarloss.apppositivo.Entidades;

/**
 * Created by rafaellcarloss on 06/10/15.
 */

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Collection;

@DatabaseTable(tableName = "usuario")
public class Usuario {

    @DatabaseField(generatedId = true)
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

    @ForeignCollectionField(columnName = "tipo_usuario_id")
    private Collection<TipoUsuario> tipoUsuario;

    @DatabaseField(foreign = true)
    private Carteira carteira;

    @DatabaseField(foreign = true)
    private Cartoes cartoes;

    @DatabaseField(foreign = true)
    private CelularRecarga celularRecarga;

    @DatabaseField(foreign = true)
    private Configuracao configuracao;

    @DatabaseField(foreign = true)
    private RecargaGratis recargaGratis;

    @DatabaseField(foreign = true)
    private Recomendados recomendados;


    public Usuario() {
    }

    public Usuario(int id, String nome, String sobreNome, String email, String senha, String idFacebook, Boolean ativo, Collection<TipoUsuario> tipoUsuario) {
        this.id = id;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.email = email;
        this.senha = senha;
        this.idFacebook = idFacebook;
        this.ativo = ativo;
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario(int id, String nome, String sobreNome, String email, String senha, String idFacebook, Boolean ativo, Collection<TipoUsuario> tipoUsuario, Carteira carteira, Cartoes cartoes, CelularRecarga celularRecarga, Configuracao configuracao, RecargaGratis recargaGratis, Recomendados recomendados) {
        this.id = id;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.email = email;
        this.senha = senha;
        this.idFacebook = idFacebook;
        this.ativo = ativo;
        this.tipoUsuario = tipoUsuario;
        this.carteira = carteira;
        this.cartoes = cartoes;
        this.celularRecarga = celularRecarga;
        this.configuracao = configuracao;
        this.recargaGratis = recargaGratis;
        this.recomendados = recomendados;
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

    public Collection<TipoUsuario> getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(Collection<TipoUsuario> tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Carteira getCarteira() {
        return carteira;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }

    public Cartoes getCartoes() {
        return cartoes;
    }

    public void setCartoes(Cartoes cartoes) {
        this.cartoes = cartoes;
    }

    public CelularRecarga getCelularRecarga() {
        return celularRecarga;
    }

    public void setCelularRecarga(CelularRecarga celularRecarga) {
        this.celularRecarga = celularRecarga;
    }

    public Configuracao getConfiguracao() {
        return configuracao;
    }

    public void setConfiguracao(Configuracao configuracao) {
        this.configuracao = configuracao;
    }

    public RecargaGratis getRecargaGratis() {
        return recargaGratis;
    }

    public void setRecargaGratis(RecargaGratis recargaGratis) {
        this.recargaGratis = recargaGratis;
    }

    public Recomendados getRecomendados() {
        return recomendados;
    }

    public void setRecomendados(Recomendados recomendados) {
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
