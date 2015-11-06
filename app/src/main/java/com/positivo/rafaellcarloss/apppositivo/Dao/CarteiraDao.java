package com.positivo.rafaellcarloss.apppositivo.Dao;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;
import com.positivo.rafaellcarloss.apppositivo.Entidades.Carteira;

import java.sql.SQLException;

/**
 * Created by rafaellcarloss on 06/11/15.
 */
public class CarteiraDao extends BaseDaoImpl<Carteira, Integer> {
    protected CarteiraDao(ConnectionSource connectionSource) throws SQLException {
        super(Carteira.class);
        setConnectionSource(connectionSource);
        initialize();
    }

}
