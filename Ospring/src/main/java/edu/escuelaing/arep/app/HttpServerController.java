package edu.escuelaing.arep.app;

public class HttpServerController {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.getInstance();
        RunRequestMapping.run();
        try {
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
