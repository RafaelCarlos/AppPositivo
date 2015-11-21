package com.positivo.rafaellcarloss.apppositivo.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.positivo.rafaellcarloss.apppositivo.Adapters.CartoesAdapter;
import com.positivo.rafaellcarloss.apppositivo.Domain.Cartoes;
import com.positivo.rafaellcarloss.apppositivo.R;

import java.util.ArrayList;

/**
 * Created by rafaellcarloss on 03/11/15.
 */
public class CartoesFrament extends Fragment implements OnItemClickListener {

    private ListView mListView;

    public CartoesFrament() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cartoes, container, false);

        mListView = (ListView) view.findViewById(R.id.lv_fragment_cartoes);

        ArrayList<Cartoes> lista = new ArrayList<Cartoes>();
        lista.add(new Cartoes(R.mipmap.ic_cartoes, "Fulano dos Santos", "(4381)"));
        lista.add(new Cartoes(R.mipmap.ic_cartoes, "Ciclano da Silva", "(6972)"));
        lista.add(new Cartoes(R.mipmap.ic_cartoes, "Beltrano Oliveira", "(1249)"));

        CartoesAdapter adapter = new CartoesAdapter(getActivity(), lista);

        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(this);

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {
            Toast.makeText(getActivity(), "Fulano clicado ", Toast.LENGTH_SHORT).show();
        } else if (position == 1) {
            Toast.makeText(getActivity(), "Ciclano clicado ", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(getActivity(), "Beltrano clicado ", Toast.LENGTH_SHORT).show();

        }
    }
}
