package com.positivo.rafaellcarloss.apppositivo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class TelaAdicionaNumero extends AppCompatActivity {

    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_adiciona_numero);


        mToolbar = (Toolbar) findViewById(R.id.tb_tela_add_numero);
//        btAddNumero = (Button) findViewById(R.id.bt_add_novo_numero_tela_recarga);

        mToolbar.setTitle("Adicionar Número");


        mToolbar.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(mToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(false);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            finish();
        }

        return true;
    }
}
