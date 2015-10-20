package com.positivo.rafaellcarloss.apppositivo.Domain;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by rafaellcarloss on 20/10/15.
 */
public class Menu implements Parcelable {

    private String nome;
    private int foto;

    public Menu() {
    }

    public Menu(Parcel parcel) {
        setFoto(parcel.readInt());
        setNome(parcel.readString());
    }

    public Menu(String nome, int foto) {
        this.nome = nome;
        this.foto = foto;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    @Override
    public int describeContents() {return 0;}

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(getNome());
        dest.writeInt(getFoto());

    }

    public static final Parcelable.Creator<Menu> CREATOR = new Creator<Menu>() {
        @Override
        public Menu createFromParcel(Parcel source) {
            return new Menu(source);
        }

        @Override
        public Menu[] newArray(int size) {
            return new Menu[size];
        }
    };
}
