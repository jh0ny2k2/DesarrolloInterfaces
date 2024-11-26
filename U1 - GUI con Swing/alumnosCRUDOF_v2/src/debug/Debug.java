package debug;

/**
 *
 * @author japa
 */
public class Debug {
    private static final boolean DEBUG=true;
    private final int logLevel=0;
    
    public static void  log(String mensaje){
        if (DEBUG)
            System.out.println(mensaje);
        // Aquí podríamos grabar el mensaje de error en un fichero o BD y
        // podríamos establecer varios niveles de log y pasarlo como parámetro
    }
}
