package domain;

public class Autor {

    private int autorID;
    private String nombre;

    public Autor(int autorID, String nombre) {
        this.autorID = autorID;
        this.nombre = nombre;
    }

    public int getAutorID() {
        return autorID;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Autor: "+nombre;
    }
}
