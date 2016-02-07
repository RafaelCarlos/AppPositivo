package com.positivo.rafaellcarloss.apppositivo.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.positivo.rafaellcarloss.apppositivo.Domain.Historico;

import java.util.List;

/**
 * Created by rafaellcarloss on 18/11/15.
 */
public class HistoricoAdapter extends ArrayAdapter {


    private Context context;
    private List<Historico> lista;

    public HistoricoAdapter(Context context, List<Historico> lista) {
        super(context, 0, lista);
        this.context = context;
        this.lista = lista;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        return super.getView(position, convertView, parent);
    }
}
