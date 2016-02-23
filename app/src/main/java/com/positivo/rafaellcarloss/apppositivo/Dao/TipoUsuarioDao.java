package com.positivo.rafaellcarloss.apppositivo.Dao;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;

/**
 * Created by rafaellcarloss on 06/11/15.
 */
public class TipoUsuarioDao extends BaseDaoImpl<TipoUsuario, Integer> {
    protected TipoUsuarioDao(ConnectionSource connectionSource) throws SQLException {
        super(TipoUsuario.class);
        setConnectionSource(connectionSource);
        initialize();
    }
}
