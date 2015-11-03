package com.positivo.rafaellcarloss.apppositivo;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ActivityTelaLoginEmail extends AppCompatActivity {

    private Toolbar mToolbar;
    private TextView tvCadastrar, tvEsqueciSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_tela_login_email);

        mToolbar = (Toolbar) findViewById(R.id.tb_activity_tela_login_email);

        tvCadastrar = (TextView) findViewById(R.id.tv_cadastrar_tela_login_email);
        tvEsqueciSenha = (TextView) findViewById(R.id.tv_esqueci_minha_senha);

        mToolbar.setTitle("Login");
        mToolbar.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(mToolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(false);


        SpannableString spanString = new SpannableString(tvCadastrar.getText().toString());
        spanString.setSpan(new UnderlineSpan(), 0, spanString.length(), 0);
        spanString.setSpan(new StyleSpan(Typeface.ITALIC), 0, spanString.length(), 0);
        tvCadastrar.setText(spanString);

        SpannableString spanString2 = new SpannableString(tvEsqueciSenha.getText().toString());
        spanString2.setSpan(new UnderlineSpan(), 0, spanString2.length(), 0);
        spanString2.setSpan(new StyleSpan(Typeface.ITALIC), 0, spanString2.length(), 0);
        tvEsqueciSenha.setText(spanString2);

        tvEsqueciSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog d = new AlertDialog.Builder(ActivityTelaLoginEmail.this)
                        .setPositiveButton(android.R.string.ok, null)

                        .setMessage(Html.fromHtml("<a href=\"http://www.positivoautomacao.com.br\">Esqueci minha senha</a>"))
                        .create();
                d.show();
// Make the textview clickable. Must be called after show()
                ((TextView) d.findViewById(android.R.id.message)).setMovementMethod(LinkMovementMethod.getInstance());

            }
        });


        tvCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityTelaLoginEmail.this, ActivityTelaCadastroEmail.class));
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
