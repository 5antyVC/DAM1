public class AccesoriosImpli extends ProductoInformatico implements Accesorios {
    private String Tipo;
    private String Marca;

    public AccesoriosImpli(String nombre, double precio, String tipo, String marca) {
        super(nombre, precio);
        this.Tipo = tipo;
        this.Marca = marca;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    @Override
    public String getTipo() {
        return Tipo;
        }

    @Override
    public String getMarca() {
        return Marca;
    }

    @Override
    public String getDescripcion() {
        return ("Accesorios: "+getNombre()+ ", Tipo: "+Tipo+ ", Marca: "+ Marca);
    }
    @Override
    public void agregarAlCarrito()
    {
        super.agregarAlCarrito();
        System.out.println("Recibira esto como regalo");
    }
}
