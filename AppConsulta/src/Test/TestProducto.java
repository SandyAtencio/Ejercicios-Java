package Test;


import Datos.Conexion;
import Datos.ConsultasBD;
import Dominio.Producto;


import javax.swing.*;
import java.sql.*;
import java.util.List;

public class TestProducto {
    public static void main(String[] args) {

        Connection conexion = null;
        ConsultasBD consulta = new ConsultasBD(conexion);

        int precio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el precio"));
        String articulo =  JOptionPane.showInputDialog("Introduce nombre articulo");

        try {
            conexion = Conexion.conectar();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }

            /*CallableStatement sentencia = conexion.prepareCall("{call INFO_PRODUCTO }");
            ResultSet rs = sentencia.executeQuery();

            while(rs.next()){
                System.out.println(rs.getString(1) );
            }*/


            Producto actualizarProductoProcedure = new Producto();
            consulta.procedureActualizar(actualizarProductoProcedure, precio, articulo);


              /*List<Producto> productos = consulta.seleccionar();

            for (Producto p: productos) {
                System.out.println("Producto ====> " + p);
            }*/

            /*Producto nuevoProducto = new Producto();
            nuevoProducto.setSeccion("CERÁMICA");
            nuevoProducto.setNomArticulo("TUBOS");
            nuevoProducto.setPrecio(193);
            nuevoProducto.setFecha("04/02/2000");
            nuevoProducto.setImportado("VERDADERO");
            nuevoProducto.setPaisOrigen("CHINA");
            consulta.insertar(nuevoProducto);*/

           /*Producto cambioProducto = new Producto();
            cambioProducto.setSeccion("JUGUETERÍA");
            cambioProducto.setNomArticulo("COCHE");
            cambioProducto.setPrecio(183);
            cambioProducto.setFecha("26/05/2002");
            cambioProducto.setImportado("VERDADERO");
            cambioProducto.setPaisOrigen("MARRUECOS");
            cambioProducto.setId_producto(9);
            consulta.modificar(cambioProducto);

            Producto eliminadoProducto = new Producto();
            eliminadoProducto.setId_producto(11);
            consulta.eliminar(eliminadoProducto);*/



            conexion.commit();
            System.out.println("se realizo commit de la transaccion");

        } catch (SQLException e) {
            e.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            }catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

    }
}
