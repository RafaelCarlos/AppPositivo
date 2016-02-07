package com.positivo.rafaellcarloss.apppositivo.Adapters;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.positivo.rafaellcarloss.apppositivo.Domain.Carteira;
import com.positivo.rafaellcarloss.apppositivo.R;

import java.util.List;

/**
 * Created by rafaellcarloss on 28/10/15.
 */
public class CarteiraAdaptadorFragment extends ArrayAdapter<Carteira> {

    private Context context;
    private List<Carteira> lista;

    public CarteiraAdaptadorFragment(Context context, List<Carteira> lista) {
        super(context, 0, lista);

        this.context = context;
        this.lista = lista;
    }


    @Override
    public View getView(int indice, View celulaRecliclada, ViewGroup pai) {


        if (celulaRecliclada == null) {
            celulaRecliclada = LayoutInflater.from(context).inflate(R.layout.item_carteira, null);
        }

        ImageView vrImageView = (ImageView) celulaRecliclada.findViewById(R.id.iv_carteira_item_fragment);
        vrImageView.setImageBitmap(BitmapFactory.decodeResource(context.getResources(), lista.get(indice).getFoto()));


        TextView titulo = (TextView) celulaRecliclada.findViewById(R.id.tv_titulo_item_fragment_carteira);
        titulo.setText(lista.get(indice).getTitulo());

        TextView descricao = (TextView) celulaRecliclada.findViewById(R.id.tv_descricao_item_fragment_carteira);
        descricao.setText(lista.get(indice).getDescricao());


        return celulaRecliclada;
    }
}
