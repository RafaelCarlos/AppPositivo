package com.positivo.rafaellcarloss.apppositivo.Interfaces;

import com.google.gson.JsonElement;
import com.positivo.rafaellcarloss.apppositivo.Entidades.Usuario;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * Created by rafaelcarlos on 24/02/16.
 */
public interface CadastroUsuarioService {

    public static final String BASE_URL = "http://192.168.0.3/PositivoWS/positivoservice/";

    @POST("usuario/inserir")
    Call<Usuario> novoUsuario(@Body Usuario usuario);

    @POST("usuario/")
    void getUserJsonElement(
            @QueryMap Map<String, String> params,
            Callback<JsonElement> response);
}
