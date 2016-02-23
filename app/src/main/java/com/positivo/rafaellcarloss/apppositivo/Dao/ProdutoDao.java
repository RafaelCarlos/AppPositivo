package com.positivo.rafaellcarloss.apppositivo.Dao;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;
import com.positivo.rafaellcarloss.apppositivo.Entidades.Cartoes;

import java.sql.SQLException;

/**
 * Created by rafaellcarloss on 06/11/15.
 */
public class ProdutoDao extends BaseDaoImpl<Cartoes, Integer> {
    protected ProdutoDao(ConnectionSource connectionSource) throws SQLException {
        super(Cartoes.class);
        setConnectionSource(connectionSource);
        initialize();
    }
}
