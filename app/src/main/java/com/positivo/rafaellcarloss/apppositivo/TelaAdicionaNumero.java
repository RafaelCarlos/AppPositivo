package com.positivo.rafaellcarloss.apppositivo;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaAdicionaNumero extends AppCompatActivity {

    Toolbar mToolbar;
    private EditText etDDD, etTelefone, etNome;
    private Button btContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_adiciona_numero);


        mToolbar = (Toolbar) findViewById(R.id.tb_tela_add_numero);
        btContinuar = (Button) findViewById(R.id.bt_continuar_tela_add_numero);
        etDDD = (EditText) findViewById(R.id.et_ddd_tela_add_numero);
        etTelefone = (EditText) findViewById(R.id.et_numero_tela_add_numero);
        etNome = (EditText) findViewById(R.id.et_nome_contato_tela_add_numero);

//        btAddNumero = (Button) findViewById(R.id.bt_add_novo_numero_tela_recarga);

        mToolbar.setTitle("Adicionar Número");


        mToolbar.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(mToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(false);


        btContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etDDD.getText().length() <= 0) {
                    etDDD.requestFocus();
                    etDDD.setError(Html.fromHtml("<font color='#FFFFFF'>Campo obrigatório</font>"));
                    etDDD.setHint("DDD");
                    etDDD.setHintTextColor(getResources().getColor(R.color.colorPrimary));
                } else if (etTelefone.getText().length() <= 0) {
                    etTelefone.requestFocus();
                    etTelefone.setError(Html.fromHtml("<font color='#FFFFFF'>Campo obrigatório</font>"));
                    etTelefone.setHint("TELEFONE");
                    etTelefone.setHintTextColor(getResources().getColor(R.color.colorPrimary));
                } else {

                    mensagem("Sucesso", "Número adicionado com sucesso!");
                    etDDD.setText("");
                    etDDD.setHintTextColor(Color.BLACK);
                    etTelefone.setText("");
                    etTelefone.setHintTextColor(Color.BLACK);
                    etNome.setText("");
                    etNome.setHintTextColor(Color.BLACK);

                    startActivity(new Intent(TelaAdicionaNumero.this, RecargaActivity.class));
                }
            }
        });

    }

    public void mensagem(String titulo, String texto) {
        AlertDialog.Builder mensagem = new AlertDialog.Builder(this, R.style.MyAlertDialog);
        mensagem.setTitle(titulo);
        mensagem.setMessage(texto);
        mensagem.setNegativeButton("OK", null);
        mensagem.show();
    }

    public void lerContato() {

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
