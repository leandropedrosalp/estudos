package com.smu.spark.util;

import spark.Filter;
import spark.Request;
import spark.Response;

public class Configs {

    public static Filter cors = (Request req, Response resp) -> {
        resp.header("Access-Control-Allow-Origin", "*");
        resp.header("Access-Control-Allow-Methods", "POST, GET, PUT, DELETE, OPTIONS");
        resp.header("Access-Control-Allow-Credentials", "true");
        resp.header("Access-Control-Max-Age", "3600");
        resp.header("Access-Control-Allow-Headers",
                "api, versao, Content-Type, Access-Control-Allow-Headers, Access-Control-Request-Method, Authorization, X-Requested-With, Accept-Encoding");
        resp.header("Content-Type", "application/json");
    };

    public static Filter options = (Request req, Response resp) -> {
        if (req.raw().getMethod().equalsIgnoreCase("OPTIONS"))
            return;
    };

    public static Filter gzip = (Request req, Response resp) -> {
        resp.header("Content-Encoding", "gzip");
    };

}
