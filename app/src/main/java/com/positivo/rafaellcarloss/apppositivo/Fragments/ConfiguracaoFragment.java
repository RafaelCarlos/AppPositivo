package com.positivo.rafaellcarloss.apppositivo.Fragments;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.positivo.rafaellcarloss.apppositivo.R;

/**
 * Created by rafaellcarloss on 03/11/15.
 */
public class ConfiguracaoFragment extends Fragment {

    private Button btDesativarUsuario;

    public ConfiguracaoFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_configuracao, container, false);

        btDesativarUsuario = (Button) view.findViewById(R.id.bt_desativar_usuario_tela_configuracao);

        btDesativarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mensagem();
            }
        });


        return view;

    }

    private void mensagem() {

        AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity() , R.style.MaterialDrawerTheme_TranslucentStatus);

        dialog.setTitle("Atençao");
        dialog.setMessage("Deseja realmente desativar seu usuario?")
                .setCancelable(false)
                .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(), "Usuario desativado!", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Nao", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .show();


    }


}
