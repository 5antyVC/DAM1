package abstractainterface3;



class Electrodomestico extends Producto {
    private String marca;
    
    public Electrodomestico(String nombre, String descripcion, double precio, String marca) {
        super(nombre, descripcion, precio);
        this.marca = marca;
    }
    
    @Override
    public void MostrarInformacion() {
        super.MostrarInformacion();
    	System.out.println("Marcar: " + marca);
    }
    @Override
    public void SuCompra() {
    	System.out.println("Ha comprado un electrodoméstico, gracias!!");
    	
    }
}