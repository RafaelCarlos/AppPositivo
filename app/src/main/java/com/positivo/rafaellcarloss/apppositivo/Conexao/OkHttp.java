package com.positivo.rafaellcarloss.apppositivo.Conexao;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * Created by rafaellcarloss on 19/01/16.
 */
public class OkHttp {

    public static final MediaType XML
            = MediaType.parse("application/xml; charset=utf-8");
    private static final String HOST = "http://developers.agenciaideias.com.br/cotacoes/json";

    private static OkHttpClient client;

    public OkHttp() {
        this.client = new OkHttpClient();
    }

    public static String post() throws IOException {
//        RequestBody body = RequestBody.create(XML, json);
        Request request = new Request.Builder()
                .url(HOST)
//                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
}
