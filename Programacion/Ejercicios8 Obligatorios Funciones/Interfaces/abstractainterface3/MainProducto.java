package abstractainterface3;

public class MainProducto {

    public static void main(String[] args) {

        Libro libro = new Libro("El señor de los anillos", "Novela de aventura", 30.00, "Tolkien");
        Electrodomestico electro = new Electrodomestico("Refrigerador", "Refrigerador de marca LG", 500, "LG");

        libro.MostrarInformacion();
        libro.SuCompra();
        System.out.println();
        electro.MostrarInformacion();
        electro.SuCompra();

    }

}