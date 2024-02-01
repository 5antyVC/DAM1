package cocheherencia;

public class Bicicleta extends Vehiculo {
    
    private String tipo;
    public Bicicleta(String nombre ,String modelo, String color, String tipo)
    {

        super(nombre, modelo, color, tipo);
        this.tipo=tipo;

    }
    @Override
    public void MostrarDatos()
    {
        System.out.println("El modelo de su "+getNombre()+" es "
        + getModelo()+" el color es "+ getColor()+ "y el tipo es "+getTipo());
    }
    public String getTipo()
    {
        return tipo;
    }
    public void setTipo(String tipo)
    {
        this.tipo=tipo;
    }
    @Override
    public void Gracias() {
        super.Gracias();
        System.out.println("Esperamos que su proximo Bicicleta, la compre con nosotros");
    }
}
