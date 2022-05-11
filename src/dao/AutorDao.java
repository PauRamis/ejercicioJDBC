package dao;

import domain.Autor;

import java.sql.ResultSet;

public interface AutorDao {

    /**
     * Returns the Autor if found, null otherwise
     * @param id
     * @return
     */
    Autor findById(int id);

    Autor findByName(String name);
}
