
public class Portatilimpl extends ProductoInformatico implements Portatil {
    private int tamanoPantalla;

    public Portatilimpl(String nombre, double precio, int tamanoPantalla) {
        super(nombre, precio);
        this.tamanoPantalla = tamanoPantalla;
    }

    public int getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(int tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public String getDescripcion() {
        return "Portatil: "+getNombre()+",  "+ tamanoPantalla +" pulgadas, Precio: "+ getPrecio()+" €";
    }
}
