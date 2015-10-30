package com.positivo.rafaellcarloss.apppositivo;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TelaInicial extends AppCompatActivity implements View.OnClickListener {

    Button btLogarFacebook;
    Toolbar mToolbar;
    private Handler h = new Handler();

    private ProgressDialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);


        btLogarFacebook = (Button) findViewById(R.id.btLogarFacebook);
        mToolbar = (Toolbar) findViewById(R.id.tb_tela_inicial);
        mToolbar.setTitle("Positivo Recarga");
        mToolbar.setSubtitle("Faça sua recarga hoje");
        mToolbar.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(mToolbar);

          /*
          Habilita a opção de voltar. Muito recomendando quando se usa vários Fragments.
          getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(false);*/


        btLogarFacebook.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tela_inicial, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        TextView titulo = new TextView(this);
        titulo.setText("Aguarde");
        titulo.setTextColor(Color.RED);

        titulo.setBackgroundColor(Color.GREEN);

        TextView mensagem = new TextView(this);
        mensagem.setText("Logando..");
        mensagem.setTextColor(Color.RED);


        dialog = ProgressDialog.show(this, titulo.getText(), mensagem.getText(), false, true);
//        pause(3000);
        exibi();
        startActivity(new Intent(this, MainActivity.class));

    }

    private void exibi() {
        new Thread() {

            @Override
            public void run() {
                try {

                    Thread.sleep(3000);
                } catch (Exception e) {
                    Log.i("Erro Thread", e.toString());
                }
                finaliza();
            }
        }.start();
    }

    private void finaliza() {
        h.post(new Runnable() {


            @Override

            public void run() {

                // TODO Auto-generated method stub

                dialog.dismiss();

            }

        });

    }


//
//    private void pause(int time) {
//        try {
//            Thread.sleep(time);
//
//        } catch (Exception e) {
//            Log.i("Erro Thread", e.toString());
//        }
//    }

}
