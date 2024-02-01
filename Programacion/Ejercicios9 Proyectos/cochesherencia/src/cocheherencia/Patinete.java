package cocheherencia;

public class Patinete extends Vehiculo {
    
    private int bateria;
    public Patinete(String nombre ,String modelo, String color, int bateria)
    {

        super(nombre, modelo, color);
        this.bateria=bateria;

    }
    @Override
    public void MostrarDatos()
    {
        System.out.println("El modelo de su "+getNombre()+" es "
        + getModelo()+" el color es "+ getColor()+ " y la bateria es de "+getBateria()+" mA");
    }
    public int getBateria()
    {
        return bateria;
    }
    public void setBateria(int bateria)
    {
        this.bateria=bateria;
    }
    @Override
    public void Gracias() {
        super.Gracias();
        System.out.println("Esperamos que su proximo Patinete, lo compre con nosotros");
    }
}
