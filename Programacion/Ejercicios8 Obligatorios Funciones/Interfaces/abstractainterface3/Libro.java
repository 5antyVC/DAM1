package abstractainterface3;

class Libro extends Producto {
    private String autor;

    public Libro(String nombre, String descripcion, double precio, String autor) {
        super(nombre, descripcion, precio);
        this.autor = autor;
    }

    @Override
    public void MostrarInformacion() {
        super.MostrarInformacion();
        System.out.println("Autor: " + autor);
    }

    @Override
    public void SuCompra() {
        System.out.println("Ha comprado un libro, gracias!!");

    }

}
