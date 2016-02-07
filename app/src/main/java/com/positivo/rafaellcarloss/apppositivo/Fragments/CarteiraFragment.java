package com.positivo.rafaellcarloss.apppositivo.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.positivo.rafaellcarloss.apppositivo.Adapters.CarteiraAdaptadorFragment;
import com.positivo.rafaellcarloss.apppositivo.Domain.Carteira;
import com.positivo.rafaellcarloss.apppositivo.R;

import java.util.ArrayList;

/**
 * Created by rafaellcarloss on 28/10/15.
 */
public class CarteiraFragment extends Fragment implements AdapterView.OnItemClickListener {


    ListView mListView;

    public CarteiraFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_carteira, container, false);

        mListView = (ListView) view.findViewById(R.id.lv_itens_carteira);

        ArrayList<Carteira> vrCarteira = new ArrayList<Carteira>();
        vrCarteira.add(new Carteira(R.mipmap.ic_mais, "Adicionar Dinheiro", "Boleto Bancário"));
        vrCarteira.add(new Carteira(R.mipmap.ic_cifrao, "Ganhe Dinheiro", "Compartilhe com seus amigos e ganhe!"));

        CarteiraAdaptadorFragment vrAdaptador = new CarteiraAdaptadorFragment(getActivity(), vrCarteira);

        mListView.setAdapter(vrAdaptador);

        mListView.setOnItemClickListener(this);


        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        if (position == 1) {
            Toast.makeText(getActivity(), "Posicao" + position, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getActivity(), "Posicao" + position, Toast.LENGTH_SHORT).show();
        }

    }
}
