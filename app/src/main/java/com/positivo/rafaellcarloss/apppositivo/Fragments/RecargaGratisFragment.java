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
import com.positivo.rafaellcarloss.apppositivo.Adapters.RecargaGratisAdapter;
import com.positivo.rafaellcarloss.apppositivo.Domain.Menu;
import com.positivo.rafaellcarloss.apppositivo.Domain.RecargaGratis;
import com.positivo.rafaellcarloss.apppositivo.R;
import com.positivo.rafaellcarloss.apppositivo.TelaRecarga;

import java.util.ArrayList;

/**
 * Created by rafaellcarloss on 29/10/15.
 */
public class RecargaGratisFragment extends Fragment implements AdapterView.OnItemClickListener {


    ListView mListView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recarga_gratis, container, false);

        mListView = (ListView) view.findViewById(R.id.lv_fragment_recarga_gratis);

        ArrayList<RecargaGratis> vrListaRecargaGratis = new ArrayList<RecargaGratis>();

        vrListaRecargaGratis.add(new RecargaGratis(R.mipmap.ic_compartilhar, "Facebook"));
        vrListaRecargaGratis.add(new RecargaGratis(R.mipmap.ic_compartilhar, "WhatsApp"));
        vrListaRecargaGratis.add(new RecargaGratis(R.mipmap.ic_compartilhar, "E-mail"));

        RecargaGratisAdapter vrRecargaGratisAdapter = new RecargaGratisAdapter(getActivity(), vrListaRecargaGratis);

        mListView.setAdapter(vrRecargaGratisAdapter);


        mListView.setOnItemClickListener(this);
        return view;
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {
            Toast.makeText(getActivity(), "Posicao" + position, Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(getActivity(), "Posicao" + position, Toast.LENGTH_SHORT).show();
        }

    }
}