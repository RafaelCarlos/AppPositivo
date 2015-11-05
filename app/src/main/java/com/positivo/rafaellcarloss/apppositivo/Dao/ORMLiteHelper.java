package com.positivo.rafaellcarloss.apppositivo.Dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;

/**
 * Created by rafaellcarloss on 05/11/15.
 */
public class ORMLiteHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "dbRecargaApp.db";

    private static final int DATABASE_VERSION = 1;

    private static ORMLiteHelper mInstance = null;

    public ORMLiteHelper(Context context, String databaseName, SQLiteDatabase.CursorFactory factory, int databaseVersion) {
        super(context, databaseName, factory, databaseVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

    }
}
