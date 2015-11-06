package com.positivo.rafaellcarloss.apppositivo.Dao;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;
import com.positivo.rafaellcarloss.apppositivo.Entidades.CelularRecarga;

import java.sql.SQLException;

/**
 * Created by rafaellcarloss on 06/11/15.
 */
public class CelularRecargaDao extends BaseDaoImpl<CelularRecarga, Integer> {
    protected CelularRecargaDao(ConnectionSource connectionSource) throws SQLException {
        super(CelularRecarga.class);
        setConnectionSource(connectionSource);
        initialize();
    }
}
