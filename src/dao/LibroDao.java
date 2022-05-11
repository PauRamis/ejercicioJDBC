package dao;

import domain.Libro;
import java.util.List;

public interface LibroDao {
    List<Libro> findByAutor(String autorName);
    List<Libro> findByEditorial(String editorialName);
    List<Libro> findByTitulo(String title);
}
