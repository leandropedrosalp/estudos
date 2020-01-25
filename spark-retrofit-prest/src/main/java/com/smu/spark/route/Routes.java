package com.smu.spark.route;


import com.smu.spark.handler.UsuarioHandler;
import com.smu.spark.transformer.JsonTransformer;
import org.eclipse.jetty.http.MimeTypes;

import static spark.Spark.*;

public class Routes {

    public static void map(UsuarioHandler handler) {

        path("/user", () -> {

            before(handler::antes);

            after(handler::depois);

            get("/:id", MimeTypes.Type.APPLICATION_JSON.asString(), handler::buscarPorId, new JsonTransformer());

            get("/", MimeTypes.Type.APPLICATION_JSON.asString(), handler::listarTodos, new JsonTransformer());

            post("/", MimeTypes.Type.APPLICATION_JSON.asString(), handler::salvar, new JsonTransformer());

            put("/:id", MimeTypes.Type.APPLICATION_JSON.asString(), handler::atualizar, new JsonTransformer());
        });
    }
}
