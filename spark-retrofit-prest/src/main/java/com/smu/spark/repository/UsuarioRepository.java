package com.smu.spark.repository;

import com.smu.spark.dao.Usuario;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface UsuarioRepository {

    @GET("usuario")
    Call<List<Usuario>> buscarPorId(@Header("Authorization") String token, @Query("nome") Long idUsuario);

    @GET("usuario")
    Call<List<Usuario>> listarTodos(@Header("Authorization") String token);

    @POST("usuario")
    Call<List<Usuario>> salvar(@Header("Authorization") String token, @Body Usuario usuario);

    @PUT("usuario")
    Call<List<Usuario>> atualizar(@Header("Authorization") String token, @Body Usuario usuario);
}
