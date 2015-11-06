package com.positivo.rafaellcarloss.apppositivo.Dao;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;
import com.positivo.rafaellcarloss.apppositivo.Entidades.Configuracao;

import java.sql.SQLException;

/**
 * Created by rafaellcarloss on 06/11/15.
 */
public class ConfiguracaoDao extends BaseDaoImpl<Configuracao, Integer> {
    protected ConfiguracaoDao(ConnectionSource connectionSource) throws SQLException {
        super(Configuracao.class);
        setConnectionSource(connectionSource);
        initialize();
    }
}
