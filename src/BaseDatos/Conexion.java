package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexion {
    //Conectarse a la BDD
    public Connection con;
    public Connection getConnection () throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/base";
        Class.forName(driver);
        return DriverManager.getConnection(url, "root","12345678");
    }
    public Connection AbrirConexion() throws ClassNotFoundException, SQLException{
        con = getConnection();
        return con;
    }
    public void CerrarConexion() throws SQLException{
        con.close();
    }
}

