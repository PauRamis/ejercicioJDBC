package domain;

public class Libro {

    private int libroID;
    private String titulo;
    private String isbn;
    private int paginas;
    private String editorial;

    private Autor autor;

    public Libro(int libroID, String titulo, String isbn, int paginas, String editorial, Autor autor) {
        this.libroID = libroID;
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = paginas;
        this.editorial = editorial;
        this.autor = autor;
    }

    public int getLibroID() {
        return libroID;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public Autor getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "libroID=" + libroID +
                ", titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", paginas=" + paginas +
                ", editorial='" + editorial + '\'' +
                ", autor=" + autor +
                '}';
    }
}


