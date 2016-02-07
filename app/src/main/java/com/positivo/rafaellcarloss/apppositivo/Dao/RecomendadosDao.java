package com.positivo.rafaellcarloss.apppositivo.Dao;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;
import com.positivo.rafaellcarloss.apppositivo.Entidades.Recomendados;

import java.sql.SQLException;

/**
 * Created by rafaellcarloss on 06/11/15.
 */
public class RecomendadosDao extends BaseDaoImpl<Recomendados, Integer> {
    protected RecomendadosDao(ConnectionSource connectionSource) throws SQLException {
        super(Recomendados.class);
        setConnectionSource(connectionSource);
        initialize();
    }
}
