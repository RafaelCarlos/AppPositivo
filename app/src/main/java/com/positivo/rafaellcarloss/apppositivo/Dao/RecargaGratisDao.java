package com.positivo.rafaellcarloss.apppositivo.Dao;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;
import com.positivo.rafaellcarloss.apppositivo.Entidades.RecargaGratis;

import java.sql.SQLException;

/**
 * Created by rafaellcarloss on 06/11/15.
 */
public class RecargaGratisDao extends BaseDaoImpl<RecargaGratis, Integer> {
    protected RecargaGratisDao(ConnectionSource connectionSource) throws SQLException {
        super(RecargaGratis.class);
        setConnectionSource(connectionSource);
        initialize();
    }

}
