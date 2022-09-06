package edu.escuelaing.arep.app;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class RunRequestMapping {
    private static Map<String, Method> services = new HashMap<String, Method>();

    public static void run() throws Exception {
        for (Method m : Class.forName("edu.escuelaing.arep.app.RequestMappingExample").getMethods()) {
            if (m.isAnnotationPresent(RequestMapping.class)) {
                try {
                    String uri = m.getAnnotation(RequestMapping.class).value();
                    System.out.println(uri + ": " + m.invoke(null));
                    services.put(uri, m);

                } catch (Throwable ex) {
                    System.out.print("Error: " + ex);
                }
            }
        }
    }

    public static String getMethod(String uri) throws Exception {
        System.out.println(uri);
        Method m = services.get(uri);
        return (String) m.invoke(null);
    }
}
