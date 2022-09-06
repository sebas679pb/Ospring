package edu.escuelaing.arep.app;

public class RequestMappingExample {

    @RequestMapping("/index")
    public static String index() {
        return "funciona";
    }

    @RequestMapping("/home")
    public static String profe5() {
        return "funciona :v";
    }
}
