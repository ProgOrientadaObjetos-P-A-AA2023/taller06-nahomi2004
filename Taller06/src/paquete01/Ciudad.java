
package paquete01;

public class Ciudad {
    /*  nombre de la ciudad, provincia de la ciudad. */
    
    private String nombre;
    private String provincia;
    
    public Ciudad (String n, String p) {
        nombre = n;
        provincia = p;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerProvincia() {
        return provincia;
    }
    
    public void establecerNombre(String a) {
        nombre = a;
    }
    
    public void establecerProvincia(String a) {
        provincia = a;
    }
}
