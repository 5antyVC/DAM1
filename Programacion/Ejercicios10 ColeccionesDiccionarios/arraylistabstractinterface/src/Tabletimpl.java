public class Tabletimpl extends ProductoInformatico implements Tablet {
    private int tamanoPantalla;
    private boolean Wifi;

    public Tabletimpl(String nombre, double precio, int tamanoPantalla, boolean wifi) {
        super(nombre, precio);
        this.tamanoPantalla = tamanoPantalla;
        this.Wifi = wifi;
    }

    public int getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(int tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public boolean isWifi() {
        return Wifi;
    }

    public void setWifi(boolean wifi) {
        this.Wifi = wifi;
    }

    public String getDescripcion() {
        // TODO Auto-generated method stub
        return ("Tablet: " + getNombre() + ", Tamaño pantalla: " + getTamanoPantalla() + " pulgadas, Wifi: " + isWifi()
                + " , Precio: " + getPrecio());
    }

    @Override
    public boolean wifi() {
        // TODO Auto-generated method stub
        return Wifi;
    }

    @Override
    public void agregarAlCarrito() {
        super.agregarAlCarrito();
        System.out.println("Recibira un estuche de cuero gratis con la compra de su tablet");
    }

}
