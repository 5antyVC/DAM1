
public class Persona {
    private String nombre;
    private int edad;
    private String colorfav;

    
    /** 
     * @return String
     */
    //Devuelve  el color favorito de la persona
    public String getColorfav() {
        return colorfav;
    }
    
    /** 
     * @param colorfav
     */
    //Establece el color favorito de la persona
    public void setColorfav(String colorfav) {
        this.colorfav = colorfav;
    }

    /**
     * Constructor de la clase Persona.
     * @param nombre El nombre de la persona.
     * @param edad La edad de la persona.
     * @param colorfav el color favorito de la persona
     */
    public Persona(String nombre, int edad, String colorfav) {
        this.nombre = nombre;
        this.edad = edad;
        this.colorfav=colorfav;
    }
    
    /**
     * Devuelve el nombre de la persona.
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Establece el nombre de la persona.
     * @param nombre El nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Devuelve la edad de la persona.
     * @return La edad de la persona.
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * Establece la edad de la persona.
     * @param edad La edad de la persona.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
