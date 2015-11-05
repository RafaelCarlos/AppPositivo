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
                '}';
    }
}
