package com.positivo.rafaellcarloss.apppositivo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.positivo.rafaellcarloss.apppositivo.Adapters.CarteiraAdaptadorFragment;
import com.positivo.rafaellcarloss.apppositivo.Adapters.MenuAdaptador;
import com.positivo.rafaellcarloss.apppositivo.Domain.Carteira;

import java.util.ArrayList;

public class ActivityTelaCarteira extends AppCompatActivity implements AdapterView.OnItemClickListener {

    Toolbar mToolbar;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_tela_carteira);


        mToolbar = (Toolbar) findViewById(R.id.tb_activity_tela_carteira);

        mToolbar.setTitle("Saldo Carteira");


        mToolbar.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(mToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(false);


        mListView = (ListView) findViewById(R.id.lv_activity_tela_carteira);

        ArrayList<Carteira> vrCarteira = new ArrayList<Carteira>();
        vrCarteira.add(new Carteira(R.mipmap.ic_mais, "Adicionar Dinheiro", "Boleto Bancário"));
        vrCarteira.add(new Carteira(R.mipmap.ic_cifrao, "Ganhe Dinheiro", "Compartilhe com seus amigos e ganhe!"));

        CarteiraAdaptadorFragment vrAdaptador = new CarteiraAdaptadorFragment(this, vrCarteira);

        mListView.setAdapter(vrAdaptador);

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
            startActivity(new Intent(this, TelaRecarga.class));
        } else {
            Toast.makeText(this, "Posicao" + position, Toast.LENGTH_SHORT).show();
        }
    }
}
