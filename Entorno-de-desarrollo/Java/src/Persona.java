

public class Persona implements Muerte{
    private  String nombre;

    //Singleton
    protected Persona(String nombre)
    {
        super();
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public  void muerte(){
        System.out.println("Me muero "+getNombre());
    }

}
