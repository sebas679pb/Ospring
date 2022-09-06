package edu.escuelaing.arep.app;

public class TestExample {
    @Test
    public static void m1() {
    }

    public static void m2() throws Exception {
        throw (new Exception("error en m2"));
    }

    @Test
    public static void m3() {
    }

    @Test
    public static void m4() throws Exception {
        throw (new Exception("error en m4"));
    }

    public static void m5() {
    }

    @RequestMapping("/hola")
    public static void m6() throws Exception {
        throw (new Exception("error en m6"));
    }

}
