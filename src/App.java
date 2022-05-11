import dao.AutorDao;
import dao.LibroDao;
import dao.mysql_implementation.AutorDaoMysql;
import dao.mysql_implementation.LibroDaoMysql;
import domain.Autor;
import domain.Libro;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App {

    public static void main(String [] args) {

        Connection con = DBUtil.createConnectionFromProperties("res/connection.properties");
        LibroDao libroDao  = new LibroDaoMysql(con);

        List<Libro> libros = libroDao.findByAutor("brand");

    }




}
