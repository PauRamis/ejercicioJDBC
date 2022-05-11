package dao.mysql_implementation;

import dao.AutorDao;
import domain.Autor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AutorDaoMysql implements AutorDao {

    private Connection con;

    public AutorDaoMysql(Connection con) {
        this.con = con;
    }


    @Override
    public Autor findById(int id) {
        Autor autor = null;
        String query = "SELECT * FROM autor WHERE autorID = ?";

        try {
            // Preparar la query
            PreparedStatement getAutorStmnt = con.prepareStatement(query);

            // Sustituir los parámetros de la query (cambiar '?' por valores)
            // Cambia el primer interrogante por el argumento 'id'
            getAutorStmnt.setInt(1, id);

            // Ejecutar la query
            ResultSet result = getAutorStmnt.executeQuery();

            if (result.next()) {
                // Obtener el campo "nombre" de la fila actual
                String nombreAutor = result.getString("nombre");
                // Obtener el campo 'autorID' de la fila actual
                int autorID = result.getInt("autorID");

                autor = new Autor(autorID, nombreAutor);

            }

        } catch (SQLException e) {
            System.err.println(e);
        }

        return autor;
    }

    @Override
    public Autor findByName(String name) {
        Autor autor = null;
        String query = "SELECT * FROM autor WHERE nombre LIKE ?";

        try {
            // Preparar la query
            PreparedStatement getAutorStmnt = con.prepareStatement(query);

            // Sustituir los parámetros de la query (cambiar '?' por valores)
            // Cambia el primer interrogante por el argumento 'id'
            getAutorStmnt.setString(1, '%'+name+'%');

            // Ejecutar la query
            ResultSet result = getAutorStmnt.executeQuery();

            if (result.next()) {
                // Obtener el campo "nombre" de la fila actual
                String nombreAutor = result.getString("nombre");
                // Obtener el campo 'autorID' de la fila actual
                int autorID = result.getInt("autorID");

                autor = new Autor(autorID, nombreAutor);

            }

        } catch (SQLException e) {
            System.err.println(e);
        }

        return autor;
    }
}
