package Clases;

import java.util.ArrayList;

public class Cliente {
    int id;
    String Cedula;
    String Nombres;
    String Apellidos;
    ArrayList <Direccion> direcciones = new ArrayList<Direccion>();
    public Cliente() {
    }
    public Cliente(String cedula, String nombres, String apellidos) {
        this.Cedula = cedula;
        this.Nombres = nombres;
        this.Apellidos = apellidos;
    }
    public String getCedula() {
        return Cedula;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }


    public void setCedula(String cedula) {
        this.Cedula = cedula;
    }

    public void setNombre(String nombre) {
        Nombres = nombre;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Cedula='" + Cedula + '\'' +
                ", Nombre='" + Nombres + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                '}';
    }
}
