package com.smu.spark;

import com.smu.spark.handler.UsuarioHandler;
import com.smu.spark.route.Routes;

public class App {

    public static void main(String[] args) {
        Routes.map(new UsuarioHandler());
    }

}
