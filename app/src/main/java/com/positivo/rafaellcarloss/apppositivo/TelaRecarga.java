package com.positivo.rafaellcarloss.apppositivo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class TelaRecarga extends ActionBarActivity {

    private Toolbar mToolbar;
    private Button btAddNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_recarga);

        mToolbar = (Toolbar) findViewById(R.id.tb_main_recarga);
        btAddNumero = (Button) findViewById(R.id.bt_add_novo_numero_tela_recarga);

        mToolbar.setTitle("Recarregar Celular");


        mToolbar.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(mToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(false);

        btAddNumero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TelaRecarga.this, TelaAdicionaNumero.class));
            }
        });


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
