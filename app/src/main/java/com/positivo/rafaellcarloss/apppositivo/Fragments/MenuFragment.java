package com.positivo.rafaellcarloss.apppositivo.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.positivo.rafaellcarloss.apppositivo.Adapters.MenuAdaptador;
import com.positivo.rafaellcarloss.apppositivo.Domain.Menu;
import com.positivo.rafaellcarloss.apppositivo.Interfaces.ListViewOnClickListenerHack;
import com.positivo.rafaellcarloss.apppositivo.R;
import com.positivo.rafaellcarloss.apppositivo.TelaRecarga;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rafaellcarloss on 22/10/15.
 */
public class MenuFragment extends Fragment implements AdapterView.OnItemClickListener {
    private ListView mListView;
    int posicaoAtual = 0;

    public MenuFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        selectItem(posicaoAtual);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        mListView = (ListView) view.findViewById(R.id.lv_menu);

        ArrayList<Menu> vrListaMenu = new ArrayList<Menu>();

        vrListaMenu.add(new Menu(R.mipmap.ic_cifrao_vermelho, "Fazer Recarga"));
        vrListaMenu.add(new Menu(R.mipmap.ic_cifrao, "Recarga Gratis"));
        vrListaMenu.add(new Menu(R.mipmap.ic_calendario, "Recarga Automatica"));

        MenuAdaptador vrMenuAdaptador = new MenuAdaptador(getActivity(), vrListaMenu);

        mListView.setAdapter(vrMenuAdaptador);


        mListView.setItemChecked(posicaoAtual, true);
        mListView.setOnItemClickListener(this);
        return view;
    }

    private void selectItem(int position) {
        posicaoAtual = position;

        if (mListView != null) {
            mListView.setItemChecked(position, true);
        }
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {
            startActivity(new Intent(getActivity(), TelaRecarga.class));
        } else {
            Toast.makeText(getActivity(), "Posicao" + position, Toast.LENGTH_SHORT).show();
        }

    }
}