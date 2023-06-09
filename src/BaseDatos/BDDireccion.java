package BaseDatos;

import Clases.Cliente;
import Clases.Direccion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BDDireccion {

    Conexion BLcon = new Conexion();

    public int Insertar(Direccion objDireccion)
            throws SQLException, ClassNotFoundException  {
        String Sentencia = "INSERT INTO DIRECCION (ID_direccion, numero, calle1, calle2, actual, ID_Cliente)"
                + " VALUES (?,?,?,?,?,?)";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        ps.setInt(1,objDireccion.getId());
        ps.setString(2, objDireccion.getNumero());
        ps.setString(3, objDireccion.getCalle1());
        ps.setString(4, objDireccion.getCalle2());
        ps.setInt(5, objDireccion.getActual());
        ps.setInt(6, objDireccion.getIdCliente());

        return ps.executeUpdate();
    }
    public ResultSet RecuperarDireccion() throws SQLException, ClassNotFoundException {
        Statement st = BLcon.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM DIRECCION";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
    public ResultSet BuscarDireccionPorNumero(Direccion objDireccion) throws SQLException, ClassNotFoundException {
        Statement st = BLcon.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM DIRECCION WHERE NUMERO = "+ objDireccion.getNumero();;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }

    public ResultSet BuscarDireccionPorCliente(Cliente id) throws SQLException, ClassNotFoundException {
        Statement st = BLcon.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM DIRECCION WHERE ID_Cliente = " + id.getId() ;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
}
