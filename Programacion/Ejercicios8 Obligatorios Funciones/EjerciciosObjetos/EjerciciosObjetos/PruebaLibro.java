package EjerciciosObjetos;

public class PruebaLibro {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        Libro libro3 = new Libro();
        Libro libro4 = new Libro();

        libro1.autor = "Tolkien";
        libro1.isbn = "1";
        libro1.numeroDePaginas = 200;
        libro1.titulo = "El Hobbit";
        libro1.precio = 5.00;

        // dar valores al objeto libro2
        libro2.autor = "Frank Herbert";
        libro2.isbn = "2";
        libro2.numeroDePaginas = 400;
        libro2.titulo = "Dune";
        libro2.precio = 15.00;

        // dar valores al objeto libro3
        libro3.autor = "Cervantes";
        libro3.isbn = "3";
        libro3.numeroDePaginas = 1200;
        libro3.titulo = "El Quijote";
        libro3.precio = 35.00;

        // dar valores al objeto libro3
        libro4.autor = "Jorge el Salvaje";
        libro4.isbn = "777";
        libro4.numeroDePaginas = 120000000;
        libro4.titulo = "Asi es la PUTA VIDA";
        libro4.precio = 9999999.99;

        // mostrar valores de los objetos
        System.out.println(libro1.titulo + " Autor:" + libro1.autor + " isbn:" + libro1.isbn + " Paginas:" + libro1.numeroDePaginas + " Precio:"
                + libro1.precio);
        System.out.println(libro2.titulo + " Autor:" + libro2.autor + " isbn:" + libro2.isbn + " Paginas:" + libro2.numeroDePaginas + " Precio:"
                + libro2.precio);
        System.out.println(libro3.titulo + " Autor:" + libro3.autor + " isbn:" + libro3.isbn + " Paginas:" + libro3.numeroDePaginas + " Precio:"
                + libro3.precio);
        System.out.println(libro4.titulo + " Autor:" + libro4.autor + " isbn:" + libro4.isbn + " Paginas:" + libro4.numeroDePaginas + " Precio:"
                + libro4.precio);

    }
}
