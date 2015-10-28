package com.positivo.rafaellcarloss.apppositivo.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.positivo.rafaellcarloss.apppositivo.R;

/**
 * Created by rafaellcarloss on 28/10/15.
 */
public class CarteiraFragment extends Fragment {

    public CarteiraFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_carteira, container, false);

        return view;
    }
}
