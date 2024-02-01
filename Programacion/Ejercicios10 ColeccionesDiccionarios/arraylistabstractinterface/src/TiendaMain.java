import java.util.ArrayList;

public class TiendaMain {
    private ArrayList<ProductoInformatico> productos;

    public TiendaMain()
    {
        productos=new ArrayList<ProductoInformatico>();
    }

    public void agregarProducto(ProductoInformatico producto)
    {
        productos.add(producto);
    }
    public void mostrarProductos()
    {
        for(ProductoInformatico producto : productos)
        {
            System.out.println(producto.getDescripcion());
            producto.agregarAlCarrito();
            System.out.println("--------------------");
        }
    }
    public static void main(String[] args) {
        
        TiendaMain tienda = new TiendaMain();

        Portatilimpl portatil1 = new Portatilimpl("Lenovo ThinkPad X1 Carbon",14000, 16);
        tienda.agregarProducto(portatil1);

        Portatilimpl portatil2 = new Portatilimpl("Dell XSP 13",968, 15);
        tienda.agregarProducto(portatil2);

        MovilImpl movil1 = new MovilImpl("Samsung galaxy23", 1400, 7, "Orange");
        tienda.agregarProducto(movil1);

        MovilImpl movil2 = new MovilImpl("Xiaomi Mi13", 1200, 6, "Libre");
        tienda.agregarProducto(movil2);

        Tabletimpl tablet1 = new Tabletimpl("Samsung Galaxy Tab S7", 649.99, 12, true);
        tienda.agregarProducto(tablet1);

        Tabletimpl tablet2 = new Tabletimpl("Apple Tab S12", 1649.99, 14, true);
        tienda.agregarProducto(tablet2);

        AccesoriosImpli accesorios1 = new AccesoriosImpli("Nubia 500 ", 0, "Teclado", "Logitech");
        tienda.agregarProducto(accesorios1);

        AccesoriosImpli accesorios2 = new AccesoriosImpli("G502 ", 0, "Raton", "Logitech");
        tienda.agregarProducto(accesorios2);

        tienda.mostrarProductos();



    }

}
