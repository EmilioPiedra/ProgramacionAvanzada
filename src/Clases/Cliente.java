package Clases;

import java.util.ArrayList;

public class Cliente {
    static int id=0;
    String Cedula;
    String Nombres;
    String Apellidos;
    ArrayList <Direccion> direcciones = new ArrayList<Direccion>();
    public Cliente() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Cliente(int id,String cedula, String nombres, String apellidos, ArrayList<Direccion> direcciones) {
        id = id++;
        Cedula = cedula;
        Nombres = nombres;
        Apellidos = apellidos;
        this.direcciones = direcciones;
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
                "id=" + id +
                ", Cedula='" + Cedula + '\'' +
                ", Nombres='" + Nombres + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", direcciones=" + direcciones +
                '}';
    }
}
