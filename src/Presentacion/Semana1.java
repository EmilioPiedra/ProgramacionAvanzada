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

            int a = objLogCliente.RecuperarMAXClientes(objCliente,ArrayClientes);
            objCliente.setId(a);
            objCliente.setApellidos("Leon");
            objCliente.setNombre("Sebastian");
            objCliente.setCedula("1105");
            //objLogCliente.Insertar(objCliente);
          //  if (objLogCliente.validarCedula(objCliente)) {
            //    objLogCliente.Insertar(objCliente);
           // }
            System.out.println(objCliente.toString());
            System.out.println("Clientes");
            ArrayClientes.removeAll(ArrayClientes);
            objLogCliente.RecuperarClientes(ArrayClientes);
            System.out.println(ArrayClientes.size());

            for (Cliente objAuxCliente: ArrayClientes)
                System.out.println(objAuxCliente.toString());
/*
            objCliente = new Cliente();
            objCliente.setCedula( "1105");
            System.out.println("Busqueda" +
                    " Numero: "+objCliente.getCedula());
            if (objLogCliente.BuscarClienteCedula(objCliente)){
                System.out.println(objCliente.toString());
            }else {
                System.out.println("no existe");
            }
*/
            objDireccion.setId(objDireccion.getId());
            objDireccion.setNumero("200-212");
            objDireccion.setCalle1("Alisos");
            objDireccion.setCalle2("Catamayo");
            objDireccion.setActual(10);
           // objLogDireccion.Insertar(objDireccion);
            System.out.println(objDireccion.toString());

            Direccion objDirecciones1 = new Direccion();
            LogDireccion objLogicaDirecciones1= new LogDireccion();

            objDirecciones1.setId(objDirecciones1.getId());
            objDirecciones1.setCalle1("Calvas");
            objDirecciones1.setCalle2("24 de mayo");
            objDirecciones1.setNumero("112-333");
            objDirecciones1.setActual(2);
            int idc=objCliente.getId();
            objDirecciones1.setIdCliente(idc);
            objLogicaDirecciones1.Insertar(objDirecciones1);

            System.out.println("--------------------------------------------------");
            ArrayList<Direccion> direccionesClientes = new ArrayList<>();
            direccionesClientes.removeAll(direccionesClientes);
            objLogDireccion.BuscarDireccionesCliente(objCliente, direccionesClientes);
            for (Direccion objAuxDireccion : direccionesClientes) {
                System.out.println(objAuxDireccion.toString());
            }
            System.out.println("--------------------------------------------------");
            System.out.println("Direccion");
            ArrayDireccion.removeAll(ArrayDireccion);
            objLogDireccion.RecuperarDireccion(ArrayDireccion);
            for (Direccion objAuxDireccion: ArrayDireccion)
                System.out.println(objAuxDireccion.toString());
/*
            objDireccion = new Direccion();
            objDireccion.setNumero( "200");
            System.out.println("Busqueda" +
                    " Numero: "+objDireccion.getNumero());
            if (objLogDireccion.BuscarDireccionNumero(objDireccion)){
                System.out.println(objDireccion.toString());
            }else {
                System.out.println("no existe");
            }*/
            ArrayClientes.removeAll(ArrayClientes);
            objLogCliente.RecuperarClientes(ArrayClientes);

            for (Cliente objAuxCliente : ArrayClientes) {
                System.out.println(objAuxCliente.toString());
            }
            objCliente = new Cliente();
            objCliente.setCedula("1104");
            System.out.println("Busqueda"
                    + "Numero" + objCliente.getCedula());
            if (objLogCliente.BuscarClienteCedula(objCliente)) {

                System.out.println(objCliente.toString());
            } else {
                System.out.println("No existe");
            }
            ArrayDireccion.removeAll(ArrayDireccion);
            objLogDireccion.RecuperarDireccion(ArrayDireccion);
            System.out.println(ArrayClientes.size());

            for (Direccion objAuxDireccion : ArrayDireccion) {
                System.out.println(objAuxDireccion.toString());
            }

        }
    }


