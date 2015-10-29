package com.positivo.rafaellcarloss.apppositivo.Adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.positivo.rafaellcarloss.apppositivo.Domain.Menu;
import com.positivo.rafaellcarloss.apppositivo.Domain.RecargaGratis;
import com.positivo.rafaellcarloss.apppositivo.R;
import com.positivo.rafaellcarloss.apppositivo.TelaRecarga;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rafaellcarloss on 29/10/15.
 */
public class RecargaGratisAdapter extends ArrayAdapter<RecargaGratis> {

    private Context context;
    private List<RecargaGratis> lista;


    public RecargaGratisAdapter(Context context, List<RecargaGratis> lista) {
        super(context, 0, lista);
        this.context = context;
        this.lista = lista;

    }

    public View getView(int indice, View celulaRecliclada, ViewGroup pai) {

        if (celulaRecliclada == null) {
            celulaRecliclada = LayoutInflater.from(context).inflate(R.layout.item_recarga_gratis, null);
        }

        ImageView vrImageView = (ImageView) celulaRecliclada.findViewById(R.id.iv_recarga_gratis);
        vrImageView.setImageBitmap(BitmapFactory.decodeResource(context.getResources(), lista.get(indice).getFoto()));


        TextView nome = (TextView) celulaRecliclada.findViewById(R.id.tv_recarga_gratis);
        nome.setText(lista.get(indice).getNome());


        return celulaRecliclada;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public RecargaGratis getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
