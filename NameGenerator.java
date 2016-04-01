
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    private String tuNombre;
    private String tuApellido;
    private String apellidoMadre;
    private String ciudadNacimiento;
    
    private static final int PRIMERAS_LETRAS = 3;
    private static final int PRIMERAS_LETRAS_MADRE = 2;
    
    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator(String tuNombre, String tuApellido, String apellidoMadre, String ciudadNacimiento)
    {
       this.tuNombre = tuNombre;
       this.tuApellido = tuApellido;
       this.apellidoMadre = apellidoMadre;
       this.ciudadNacimiento = ciudadNacimiento;
    }

    /**
     * Metodo que generara tu nombre de forma aleatoria
     */
    public String generateStarWarsName(){
        String nombreDePelicula = null;
        nombreDePelicula = tuApellido.substring(0, PRIMERAS_LETRAS) 
        + tuNombre.substring(0, PRIMERAS_LETRAS).toLowerCase()
        + " " + apellidoMadre.substring(0, PRIMERAS_LETRAS_MADRE) + ciudadNacimiento.substring(0, PRIMERAS_LETRAS).toLowerCase();
        return nombreDePelicula;
    }
}
