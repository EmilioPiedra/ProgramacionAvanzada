package BaseDatos;

import Clases.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BDCliente {
        Conexion BLcon = new Conexion();
    public int Insertar(Cliente objCliente) throws SQLException, ClassNotFoundException {
        String Sentencia = "INSERT INTO CLIENTE (Cedula, Nombres, Apellidos)"
                + " VALUES (?,?,?)";
        PreparedStatement ps= BLcon.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objCliente.getCedula());
        ps.setString(2, objCliente.getNombres());
        ps.setString(3, objCliente.getApellidos());
        return ps.executeUpdate();
    }
    public ResultSet RecuperarClientes () throws SQLException, ClassNotFoundException {
        Statement st = BLcon.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM CLIENTE";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }

    public ResultSet BuscarClientePorCedula(Cliente objCliente) throws SQLException, ClassNotFoundException {
        Statement st = BLcon.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM CLIENTE WHERE CEDULA = "+ objCliente.getCedula();;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
    public ResultSet BuscarClientePorCedula1(Cliente objCliente) throws SQLException, ClassNotFoundException {
        Statement st = BLcon.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM CLIENTE WHERE CEDULA = ?";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objCliente.getCedula());
        return ps.executeQuery();
    }


}
