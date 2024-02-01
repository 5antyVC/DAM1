public class MovilImpl extends ProductoInformatico implements Movil{
    private int TamanoPantalla;
    private String Operador;
    public int getGetTamanoPantalla() {
        return TamanoPantalla;
    }
    public void setGetTamanoPantalla(int TamanoPantalla) {
        this.TamanoPantalla = TamanoPantalla;
    }
    public String getOperador() {
        return Operador;
    }
    public void setOperador(String operador) {
        Operador = operador;
    }
    public MovilImpl(String nombre, double precio, int TamanoPantalla, String operador) {
        super(nombre, precio);
        this.TamanoPantalla = TamanoPantalla;
        this.Operador = operador;
    }
    @Override
    public String getDescripcion() {
        return ("Movil: "+getNombre()+ ", Tamaño de pantalla: "+TamanoPantalla+ " pulgadas"+ ", Operador: "+ getOperador()+", Precio: "+getPrecio()+" €");
    }
    @Override
    public int getTamanoPantalla() {
        return  TamanoPantalla;
    }
    @Override
    public void agregarAlCarrito()
    {
        super.agregarAlCarrito();
        System.out.println("Recibira un protector de pantalla gratis con la compra de su movil");
    }

}
