package com.positivo.rafaellcarloss.apppositivo.Dao;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;
import com.positivo.rafaellcarloss.apppositivo.Entidades.Usuario;

import java.sql.SQLException;

/**
 * Created by rafaellcarloss on 06/11/15.
 */
public class UsuarioDao extends BaseDaoImpl<Usuario, Integer> {
    protected UsuarioDao(ConnectionSource connectionSource) throws SQLException {
        super(Usuario.class);
        setConnectionSource(connectionSource);
        initialize();
    }


}
