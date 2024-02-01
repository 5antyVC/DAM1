package Libro;

import java.util.ArrayList;

public class PruebaLibro {
        public static void main(String[] args) {
                Libro[] listaLibro = new Libro[3];
                listaLibro[0] = new Libro();
                listaLibro[1] = new Libro();
                listaLibro[2] = new Libro();

                String[] autores = { "Tolkien", "Cervantes", "Shakespeare" };
                String[] titulos = { "El Hobbit", "Quijote", "Hamlet" };
                String[] isbn = { "1", "2", "3" };
                int[] Paginas = { 200, 1500, 180 };

                for (int i = 0; i < listaLibro.length; i++) {
                        listaLibro[i].autor = autores[i];
                        listaLibro[i].titulo = titulos[i];
                        listaLibro[i].isbn = isbn[i];
                        listaLibro[i].numeroDePaginas = Paginas[i];

                }

                for (int i = 0; i < listaLibro.length; i++) {
                        System.out.println("Autor " + listaLibro[i].autor + ", Libro: " + listaLibro[i].titulo
                                        + ", Isbn:" + listaLibro[i].isbn + " ,NumeroPaginas:"
                                        + listaLibro[i].numeroDePaginas);

                }

        }
}
