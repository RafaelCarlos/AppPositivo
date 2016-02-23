package com.positivo.rafaellcarloss.apppositivo.Dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.positivo.rafaellcarloss.apppositivo.Entidades.Carteira;
import com.positivo.rafaellcarloss.apppositivo.Entidades.Cartoes;
import com.positivo.rafaellcarloss.apppositivo.Entidades.CelularRecarga;
import com.positivo.rafaellcarloss.apppositivo.Entidades.Configuracao;
import com.positivo.rafaellcarloss.apppositivo.Entidades.Operadora;
import com.positivo.rafaellcarloss.apppositivo.Entidades.Produto;
import com.positivo.rafaellcarloss.apppositivo.Entidades.RecargaGratis;
import com.positivo.rafaellcarloss.apppositivo.Entidades.Recomendados;
import com.positivo.rafaellcarloss.apppositivo.Entidades.Usuario;

import java.io.Serializable;
import java.sql.SQLException;

/**
 * Created by rafaellcarloss on 05/11/15.
 */
public class ORMLiteHelper extends OrmLiteSqliteOpenHelper implements Serializable{

    private static final String DATABASE_NAME = "dbRecargaApp.db";

    private static final int DATABASE_VERSION = 1;

    private static ORMLiteHelper mInstance = null;

    public ORMLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {

        try {
            TableUtils.createTable(connectionSource, Carteira.class);
            TableUtils.createTable(connectionSource, Cartoes.class);
            TableUtils.createTable(connectionSource, CelularRecarga.class);
            TableUtils.createTable(connectionSource, Configuracao.class);
            TableUtils.createTable(connectionSource, Operadora.class);
            TableUtils.createTable(connectionSource, Produto.class);
            TableUtils.createTable(connectionSource, RecargaGratis.class);
            TableUtils.createTable(connectionSource, Recomendados.class);
            TableUtils.createTable(connectionSource, Usuario.class);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

        try {
            TableUtils.dropTable(connectionSource, Carteira.class, true);
            TableUtils.dropTable(connectionSource, Cartoes.class, true);
            TableUtils.dropTable(connectionSource, CelularRecarga.class, true);
            TableUtils.dropTable(connectionSource, Configuracao.class, true);
            TableUtils.dropTable(connectionSource, Operadora.class, true);
            TableUtils.dropTable(connectionSource, Produto.class, true);
            TableUtils.dropTable(connectionSource, RecargaGratis.class, true);
            TableUtils.dropTable(connectionSource, Recomendados.class, true);
            TableUtils.dropTable(connectionSource, Usuario.class, true);

            onCreate(database, connectionSource);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void close() {
        super.close();
    }
}
