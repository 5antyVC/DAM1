package cocheherencia;

public abstract class Vehiculo {
    private String nombre;
    private String modelo;
    private String color;
    private String motor;

    public Vehiculo(String nombre, String modelo, String color, String motor) {
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.nombre=nombre;
    }
    public Vehiculo(String nombre,String modelo, String color) {
        this.modelo = modelo;
        this.color = color;
        this.nombre=nombre;

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return color;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void MostrarDatos();
    
    public void Gracias()
    {
            System.out.println("Gracias por su compra");
    }
}
