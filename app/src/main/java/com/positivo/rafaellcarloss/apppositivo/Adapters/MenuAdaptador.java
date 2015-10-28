package com.positivo.rafaellcarloss.apppositivo.Adapters;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.positivo.rafaellcarloss.apppositivo.Domain.Menu;
import com.positivo.rafaellcarloss.apppositivo.R;

import java.util.List;

/**
 * Created by rafaellcarloss on 22/10/15.
 */
public class MenuAdaptador extends ArrayAdapter<Menu> {

    private Context context;
    private List<Menu> lista;
    private LayoutInflater inflater;
    private float scale;
    private int width;
    private int height;


    public MenuAdaptador(Context context, List<Menu> lista) {
        super(context, 0, lista);
        this.context = context;
        this.lista = lista;

//        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        scale = context.getResources().getDisplayMetrics().density;
//        width = context.getResources().getDisplayMetrics().widthPixels - (int) (14 * scale + 0.5f);
//        height = (width / 16) * 9;

    }


    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Menu getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int indice, View celulaRecliclada, ViewGroup pai) {

        if (celulaRecliclada == null) {
            celulaRecliclada = LayoutInflater.from(context).inflate(R.layout.item_menu, null);
        }

        ImageView vrImageView = (ImageView) celulaRecliclada.findViewById(R.id.ivMenuIcon);
        vrImageView.setImageBitmap(BitmapFactory.decodeResource(context.getResources(), lista.get(indice).getFoto()));


        TextView nome = (TextView) celulaRecliclada.findViewById(R.id.tvMenuItem);
        nome.setText(lista.get(indice).getNome());


        return celulaRecliclada;
    }

}
