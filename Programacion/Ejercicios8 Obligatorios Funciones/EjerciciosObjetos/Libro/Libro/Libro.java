package Libro;

public class Libro {

    String isbn;
    String titulo;
    String autor;
    double precio;
    int numeroDePaginas;

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public int  getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int  numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
}