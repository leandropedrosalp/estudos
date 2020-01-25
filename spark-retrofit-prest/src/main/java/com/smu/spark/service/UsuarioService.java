package com.smu.spark.service;

import com.smu.spark.dao.Usuario;
import com.smu.spark.producer.RetrofitProducer;
import com.smu.spark.repository.UsuarioRepository;
import com.smu.spark.validator.UsuarioValidator;

import java.io.IOException;
import java.util.List;

import static com.smu.spark.util.JwtUtil.getJwtToken;

public class UsuarioService {

    private UsuarioRepository usuarioRepository;
    private List<Usuario> listaDeRetorno;

    public UsuarioService() {
        usuarioRepository = RetrofitProducer.getBaseUrlRetrofit("http://localhost:8080/").create(UsuarioRepository.class);
    }

    public Usuario buscarPorId(Long idUsuario) {

        try {
            listaDeRetorno = usuarioRepository.buscarPorId(getJwtToken(), idUsuario).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return verificaListaDeRetorno();
    }

    public List<Usuario> listarTodos() {
        try {
            listaDeRetorno = usuarioRepository.listarTodos(getJwtToken()).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaDeRetorno;
    }

    public Usuario salvar(Usuario usuario) {
        if (UsuarioValidator.isValido(usuario)) {
            try {
                listaDeRetorno = usuarioRepository.salvar(getJwtToken(), usuario).execute().body();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            return null;
        }
        return verificaListaDeRetorno();
    }

    public Usuario atualizar(Usuario usuario, Long idUsuario) {
        if (UsuarioValidator.isValido(usuario)) {
            List<Usuario> existente = null;
            try {
                existente = usuarioRepository.buscarPorId(getJwtToken(), idUsuario).execute().body();
                if (existente != null) {
                    usuario.setId(idUsuario);
                    listaDeRetorno = usuarioRepository.atualizar(getJwtToken(), usuario).execute().body();
                } else {
                    listaDeRetorno = usuarioRepository.salvar(getJwtToken(), usuario).execute().body();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            return null;
        }
        return verificaListaDeRetorno();
    }

    private Usuario verificaListaDeRetorno() {
        if (listaDeRetorno.equals(null) || listaDeRetorno.isEmpty()) {
            return null;
        }
        return listaDeRetorno.get(0);
    }

}
