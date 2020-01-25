package com.smu.spark.handler;

import com.google.gson.Gson;
import com.smu.spark.dao.Usuario;
import com.smu.spark.route.Routes;
import com.smu.spark.service.UsuarioService;
import org.eclipse.jetty.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;
import spark.Response;
import spark.utils.StringUtils;

import java.util.Date;
import java.util.List;

public class UsuarioHandler {

    UsuarioService usuarioService = new UsuarioService();
    Logger logger = LoggerFactory.getLogger(Routes.class);

    public Usuario buscarPorId(Request req, Response res) {
        Long idUsuario = Long.valueOf(!StringUtils.isEmpty(req.params("id")) ? req.params("id") : "0");
        Usuario usuario = usuarioService.buscarPorId(idUsuario);
        if (usuario == null) {
            res.status(HttpStatus.NO_CONTENT_204);
        }
        return usuario;
    }

    public List<Usuario> listarTodos(Request req, Response res) {
        return usuarioService.listarTodos();
    }

    public Usuario salvar(Request req, Response res) {
        Usuario usuario = new Gson().fromJson(req.body(), Usuario.class);
        usuarioService.salvar(usuario);

        if (usuario.getId() == null || usuario.getId() < 1l) {
            res.status(HttpStatus.BAD_REQUEST_400);
        }

        return usuario;
    }

    public Usuario atualizar(Request req, Response res) {
        Long idUsuario = Long.valueOf(!StringUtils.isEmpty(req.params("id")) ? req.params("id") : "0");
        Usuario usuario = new Gson().fromJson(req.body(), Usuario.class);
        usuarioService.atualizar(usuario, idUsuario);

        if (usuario.getId() == null || usuario.getId() < 1l) {
            res.status(HttpStatus.BAD_REQUEST_400);
        }

        return usuario;
    }

    public void antes(Request req, Response res) {
        logger.info(String.format("Requisicao recebida as %s", new Date()));
    }

    public void depois(Request req, Response res) {
        logger.info(String.format("Requisicao encerrada as %s", new Date()));
    }

}
