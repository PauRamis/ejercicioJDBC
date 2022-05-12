package dao;

public interface UsuarioDao {

    Usuario findById(String nombre);

    boolean createUser(String nombreUsuario, String telefono, String dirección);


}
