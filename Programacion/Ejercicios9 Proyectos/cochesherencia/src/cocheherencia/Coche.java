package cocheherencia;

public class Coche extends Vehiculo {

    public Coche(String nombre, String modelo, String color, String motor) {
        super(nombre, modelo, color, motor);
    }

    @Override
    public void MostrarDatos() {
        System.out.println("El modelo de su " + getNombre() + " es "
                + getModelo() + " el color es " + getColor() + " su motor es " + getMotor());
    }

    @Override
    public void Gracias() {
        super.Gracias();
        System.out.println("Esperamos que su proximo coche, lo compre con nosotros");
    }

}
