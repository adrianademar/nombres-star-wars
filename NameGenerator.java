
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    static final int APELLIDO = 4;
    static final int NOMBRE = 3;
    static final int APELLIDO_MADRE = 2;
    static final int CIUDAD = 5;
    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator() {
        
    }
    
    public void generateStarWarsName(String nombre, String apellido, String apellidoMadre, String ciudad) {
        String nombreSW = apellido.substring(0, APELLIDO) + nombre.substring(0, NOMBRE);
        String apellidoSW = apellidoMadre.substring(0, APELLIDO_MADRE) + ciudad.substring(0, CIUDAD);
        System.out.println(nombreSW + " " + apellidoSW);
    }
}
