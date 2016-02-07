package com.positivo.rafaellcarloss.apppositivo.Adapters;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.positivo.rafaellcarloss.apppositivo.Domain.Cartoes;
import com.positivo.rafaellcarloss.apppositivo.R;

import java.util.List;

/**
 * Created by rafaellcarloss on 18/11/15.
 */
public class CartoesAdapter extends ArrayAdapter<Cartoes> {

    private Context context;
    private List<Cartoes> lista;

    public CartoesAdapter(Context context, List<Cartoes> lista) {
        super(context, 0, lista);
        this.context = context;
        this.lista = lista;
    }


    @Override
    public View getView(int indice, View celulaRecliclada, ViewGroup pai) {


        if (celulaRecliclada == null) {
            celulaRecliclada = LayoutInflater.from(context).inflate(R.layout.item_cartoes, null);
        }

        ImageView vrImageView = (ImageView) celulaRecliclada.findViewById(R.id.iv_cartao_item_cartoes);
        vrImageView.setImageBitmap(BitmapFactory.decodeResource(context.getResources(), lista.get(indice).getFoto()));


        TextView titulo = (TextView) celulaRecliclada.findViewById(R.id.tv_nome_titular_item_cartoes);
        titulo.setText(lista.get(indice).getNome());

        TextView descricao = (TextView) celulaRecliclada.findViewById(R.id.tv_numero_final_cartao_item_cartoes);
        descricao.setText(lista.get(indice).getNumeroFinal());


        return celulaRecliclada;
    }
}
