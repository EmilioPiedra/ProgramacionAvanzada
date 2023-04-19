package Presentacion;
import Clases.Cliente;
import Clases.Direccion;
import Logica.LogCliente;
import Logica.LogDireccion;

import java.sql.SQLException;
import java.util.ArrayList;

public class Semana1 {
        public static void main(String[] args) throws SQLException, ClassNotFoundException {
            Cliente objCliente = new Cliente();
            Direccion objDireccion = new Direccion();
            ArrayList<Cliente> ArrayClientes = new ArrayList();
            ArrayList<Direccion> ArrayDireccion = new ArrayList();
            LogCliente objLogCliente = new LogCliente();
            LogDireccion objLogDireccion = new LogDireccion();
            objCliente.setApellidos("Garcia");
            objCliente.setNombre("Pepe");
            objCliente.setCedula("1104");

            System.out.println(objCliente.getCedula());
            System.out.println(objCliente.getNombres());
            System.out.println(objCliente.getApellidos());

           // if (objLogCliente.validarCedula(objCliente)) {
           //     objLogCliente.Insertar(objCliente);
           // }

            System.out.println("Clientes");
            ArrayClientes.removeAll(ArrayClientes);
            objLogCliente.RecuperarClientes(ArrayClientes);
            System.out.println(ArrayClientes.size());

            for (Cliente objAuxCliente: ArrayClientes)
                System.out.println(objAuxCliente.toString());

            objCliente = new Cliente();
            objCliente.setCedula( "1105");
            System.out.println("Busqueda" +
                    " Numero: "+objCliente.getCedula());
            if (objLogCliente.BuscarClienteCedula(objCliente)){
                System.out.println(objCliente.toString());
            }else {
                System.out.println("no existe");
            }


            objDireccion.setNumero("200-212");
            objDireccion.setCalle1("Alisos");
            objDireccion.setCalle2("Catamayo");
            objDireccion.setActual(10);
           // objLogDireccion.Insertar(objDireccion);
            System.out.println(objDireccion);
            System.out.println("Direccion");
            ArrayDireccion.removeAll(ArrayDireccion);
            objLogDireccion.RecuperarDireccion(ArrayDireccion);
            System.out.println(ArrayDireccion.size());
            for (Direccion objAuxDireccion: ArrayDireccion)
                System.out.println(objAuxDireccion.toString());

            objDireccion = new Direccion();
            objDireccion.setNumero( "200");
            System.out.println("Busqueda" +
                    " Numero: "+objDireccion.getNumero());
            if (objLogDireccion.BuscarDireccionNumero(objDireccion)){
                System.out.println(objDireccion.toString());
            }else {
                System.out.println("no existe");
            }
        }
    }


