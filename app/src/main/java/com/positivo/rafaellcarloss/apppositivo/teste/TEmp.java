package com.positivo.rafaellcarloss.apppositivo.teste;

/**
 * Created by rafaellcarloss on 05/02/16.
 */
public class TEmp {


    /**
     *
     * public class PostagemServicoREST {

     private static final String HOST = "http://192.168.56.1:8084/Viwork";
     private static final String RESOURCE_TODOS = "/api/postagem";

     OkHttpClient okHttpClient;
     ObjectMapper objectMapper;

     public PostagemServicoREST() {
     this.objectMapper = new ObjectMapper();
     this.okHttpClient = new OkHttpClient();
     }

     public List<Postagem> getTodos() throws IOException {
     Request request = new Request.Builder()
     .url(HOST + RESOURCE_TODOS)
     .build();

     Log.i(PostagemServicoREST.class.getName(), request.httpUrl().toString());
     Response response = okHttpClient.newCall(request).execute();

     return this.objectMapper.readValue(response.body().string(), TypeFactory.defaultInstance()
     .constructCollectionType(ArrayList.class, Postagem.class));
     }
     }

     *
     */
}
