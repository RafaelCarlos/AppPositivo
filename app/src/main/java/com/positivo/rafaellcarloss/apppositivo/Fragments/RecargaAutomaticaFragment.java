package com.positivo.rafaellcarloss.apppositivo.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.positivo.rafaellcarloss.apppositivo.R;

/**
 * Created by rafaellcarloss on 03/11/15.
 */
public class RecargaAutomaticaFragment extends Fragment {
    public RecargaAutomaticaFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_recarga_automatica, container, false);

        return view;
    }
}
