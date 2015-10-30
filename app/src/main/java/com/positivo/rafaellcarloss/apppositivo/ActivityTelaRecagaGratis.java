package com.positivo.rafaellcarloss.apppositivo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.positivo.rafaellcarloss.apppositivo.Adapters.RecargaGratisAdapter;
import com.positivo.rafaellcarloss.apppositivo.Domain.RecargaGratis;

import java.util.ArrayList;

public class ActivityTelaRecagaGratis extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private Toolbar mToolbar;
    private ListView mListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_tela_recaga_gratis);


        mToolbar = (Toolbar) findViewById(R.id.tb_activity_tela_recarga_gratis);
        mListView = (ListView) findViewById(R.id.lv_activity_tela_recarga_gratis);

        mToolbar.setTitle("Convide Seus Amigos");


        mToolbar.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(mToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(false);

        ArrayList<RecargaGratis> vrListaRecargaGratis = new ArrayList<RecargaGratis>();

        vrListaRecargaGratis.add(new RecargaGratis(R.mipmap.ic_compartilhar, "Facebook"));
        vrListaRecargaGratis.add(new RecargaGratis(R.mipmap.ic_compartilhar, "WhatsApp"));
        vrListaRecargaGratis.add(new RecargaGratis(R.mipmap.ic_compartilhar, "E-mail"));

        RecargaGratisAdapter vrRecargaGratisAdapter = new RecargaGratisAdapter(this, vrListaRecargaGratis);

        mListView.setAdapter(vrRecargaGratisAdapter);

        mListView.setDivider(null);
        mListView.setOnItemClickListener(this);

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

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        if (position == 0) {
            Toast.makeText(this, "Posicao" + position, Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Posicao" + position, Toast.LENGTH_SHORT).show();
        }
    }
}
