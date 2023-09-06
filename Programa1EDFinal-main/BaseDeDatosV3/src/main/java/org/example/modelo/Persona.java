package org.example.modelo;

public class Persona {
    private int Id;
    private String Nombre;
    private String Apellido;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido) {
        Id = id;
        Nombre = nombre;
        Apellido = apellido;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Id=" + Id +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                '}';
    }
}
