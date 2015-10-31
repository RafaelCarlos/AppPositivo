package com.positivo.rafaellcarloss.apppositivo;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.Menu;
import android.view.MenuItem;
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

        SpannableString spanString = new SpannableString(tvCadastrar.getText().toString());
        spanString.setSpan(new UnderlineSpan(), 0, spanString.length(), 0);
        spanString.setSpan(new StyleSpan(Typeface.ITALIC), 0, spanString.length(), 0);
        tvCadastrar.setText(spanString);

        SpannableString spanString2 = new SpannableString(tvEsqueciSenha.getText().toString());
        spanString2.setSpan(new UnderlineSpan(), 0, spanString2.length(), 0);
        spanString2.setSpan(new StyleSpan(Typeface.ITALIC), 0, spanString2.length(), 0);
        tvEsqueciSenha.setText(spanString2);


    }
}
