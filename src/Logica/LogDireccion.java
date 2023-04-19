package Logica;

import BaseDatos.BDCliente;
import BaseDatos.BDDireccion;
import Clases.Cliente;
import Clases.Direccion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LogDireccion {

    BDDireccion objDatDireccion = new BDDireccion();

    public void Insertar(Direccion objDireccion) throws ClassNotFoundException,
            SQLException {
        objDatDireccion.Insertar(objDireccion);

    }
    public void RecuperarDireccion(ArrayList<Direccion> arrayDireccion) throws SQLException, ClassNotFoundException {
        Direccion direccion = new Direccion();
        ResultSet rs = objDatDireccion.RecuperarDireccion();
        while (rs.next()){
            direccion = new Direccion();
            direccion.setNumero(rs.getString(1));
            direccion.setCalle1(rs.getString(2));
            direccion.setCalle2(rs.getString(3));
            direccion.setActual(rs.getInt(4));
            arrayDireccion.add(direccion);
        }
    }
    public boolean BuscarDireccionNumero(Direccion objDireccion) throws SQLException, ClassNotFoundException {
        ResultSet rs =objDatDireccion.BuscarDireccionPorNumero(objDireccion);
        while (rs.next()){
            objDireccion.setCalle1(rs.getString(2));
            objDireccion.setCalle2(rs.getString(3));
            return true;

        }
        return false;

    }
}
