package Logica;

import BaseDatos.BDCliente;
import BaseDatos.Conexion;
import Clases.Cliente;
import Clases.Direccion;
import com.mysql.cj.util.DnsSrv;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LogCliente {
    Conexion BLcon = new Conexion();
    BDCliente objBDCliente = new BDCliente();
    public boolean validarCedula (Cliente objCliente){
        if (objCliente.getCedula().length()==4)
            return true;
        return false;
    }

    public void Insertar(Cliente objCliente) throws ClassNotFoundException, SQLException {
        objBDCliente.Insertar(objCliente);
    }

    public void RecuperarClientes(ArrayList<Cliente> arrayClientes) throws SQLException, ClassNotFoundException {
        Cliente objCliente = new Cliente();
        ResultSet rs = objBDCliente.RecuperarClientes();
        while (rs.next()){
            objCliente = new Cliente();
            objCliente.setCedula(rs.getString(1));
            objCliente.setNombre(rs.getString(2));
            objCliente.setApellidos(rs.getString(3));
            arrayClientes.add(objCliente);
        }

    }

    public boolean BuscarClienteCedula(Cliente objCliente) throws SQLException, ClassNotFoundException {
        ResultSet rs =objBDCliente.BuscarClientePorCedula(objCliente);
        while (rs.next()){
            objCliente.setNombre(rs.getString(2));
            objCliente.setApellidos(rs.getString(3));
            return true;

        }
        return false;

    }

}
