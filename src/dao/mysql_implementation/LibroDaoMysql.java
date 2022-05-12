package dao.mysql_implementation;

import dao.LibroDao;
import domain.Autor;
import domain.Libro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibroDaoMysql implements LibroDao {


    private Connection con;

    public LibroDaoMysql(Connection con) {
        this.con = con;
    }

    @Override
    public List<Libro> findByAutor(String autorName) {

        List<Libro> libros = new ArrayList<>();

        String query =
                "SELECT * FROM libro " +
                        "NATURAL JOIN autor " +
                        "WHERE nombre LIKE ?";

        try {
            PreparedStatement findByAuthorStmnt = con.prepareStatement(query);
            findByAuthorStmnt.setString(1, '%' + autorName + '%');
            ResultSet result = findByAuthorStmnt.executeQuery();

            while (result.next()) {

                Autor autor = new Autor(
                        result.getInt("autorID"),
                        result.getString("nombre")
                );

                Libro libro = new Libro(
                        result.getInt("libroID"),
                        result.getString("titulo"),
                        result.getString("ISBN"),
                        result.getInt("paginas"),
                        result.getString("editorial"),
                        autor
                );

                libros.add(libro);
            }

        } catch (SQLException e) {
            System.err.println(e);
        }
        return libros;
    }

    @Override
    public List<Libro> findByEditorial(String editorialName){
        return null;
    }
    /* {

        List<Libro> libros = new ArrayList<>();

        String query = "SELECT * FROM libro NATURAL JOIN autor WHERE editorial like ?";

        try {
            PreparedStatement getLibreStatment = con.prepareStatement(query);
            getLibreStatment.setString(1, '%' + editorialName + '%');
            ResultSet result = getLibreStatment.executeQuery();

            while (result.next()) {
                Autor autor = new Autor(
                        result.getInt("autorID"),
                        result.getString("nombre")
                );

                Libro libro = new Libro(
                        result.getInt("libroID"),
                        result.getString("titulo"),
                        result.getString("ISBN"),
                        result.getInt("paginas"),
                        result.getString("editorial"),
                        autor
                );

                libros.add(libro);
            }

        } catch (SQLException e) {
            System.err.println(e);
        }

        return editorialName;
    }*/

    @Override
    public List<Libro> findByTitulo(String title) {
        return null;
    }
}
