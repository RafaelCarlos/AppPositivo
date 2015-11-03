package com.positivo.rafaellcarloss.apppositivo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityTelaCadastroEmail extends AppCompatActivity {

    private Button btCadastrar;
    private Toolbar mToolbar;
    private EditText etNome, etEmail, etSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_tela_cadastro_email);

        mToolbar = (Toolbar) findViewById(R.id.tb_activity_tela_cadastro_email);
        btCadastrar = (Button) findViewById(R.id.bt_cadastrar_tela_cadastro_email);
        etNome = (EditText) findViewById(R.id.et_nome_tela_cadastro_email);
        etEmail = (EditText) findViewById(R.id.et_email_tela_cadastro_email);
        etSenha = (EditText) findViewById(R.id.et_senha_tela_cadastro_email);


        mToolbar.setTitle("Login");
        mToolbar.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(mToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(false);


        final TextView titulo = new TextView(this);
        final TextView mensagem = new TextView(this);

        titulo.setText("Sucesso");
        titulo.setTextColor(Color.BLACK);
        mensagem.setText("Dados cadastrados com sucesso");
        titulo.setTextColor(Color.BLACK);

        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mensagem(titulo, mensagem);
                etNome.setText("");
                etEmail.setText("");
                etSenha.setText("");
            }
        });


    }


    public void mensagem(TextView titulo, TextView texto) {
        AlertDialog.Builder Mensagem = new AlertDialog.Builder(this);
        Mensagem.setTitle(titulo.getText());
        Mensagem.setMessage(texto.getText());
        Mensagem.setNegativeButton("OK", null);
        Mensagem.show();
    }    @Override
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
