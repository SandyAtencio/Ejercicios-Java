package Datos;

import Dominio.Producto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConsultasBD {

    private Connection conexionTransaccional;

    private static final String SELECT = "SELECT ID_ARTICULO, SECCION, NOMARTICULO, PRECIO, FECHA, IMPORTADO, PAISDEORIGEN FROM PRODUCTOS";
    private static final String INSERT = "INSERT INTO PRODUCTOS (ID_ARTICULO, SECCION, NOMARTICULO, PRECIO, FECHA, IMPORTADO, PAISDEORIGEN) VALUES (SEQ_PRODUCTOS.NEXTVAL,?,?,?,?,?,?)";
    private static final String UPDATE = "UPDATE PRODUCTOS SET SECCION = ?, NOMARTICULO = ?, PRECIO = ?, FECHA = ?, IMPORTADO = ?, PAISDEORIGEN = ? WHERE ID_ARTICULO = ?";
    private static final String DELETE = "DELETE FROM PRODUCTOS WHERE ID_ARTICULO = ?";

    public ConsultasBD(){

    }

    public ConsultasBD(Connection conexionTransaccional){
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<Producto> seleccionar() throws SQLException{
        Connection conectar = null;
        PreparedStatement instruccion = null;
        ResultSet rs = null;
        Producto producto;
        List<Producto> productos = new ArrayList<>();

        try {
            conectar = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            instruccion = conectar.prepareStatement(SELECT);
            rs = instruccion.executeQuery();

            while (rs.next()){
                int id_articulo = rs.getInt("ID_ARTICULO");
                String seccion = rs.getString("SECCION");
                String nomArticulo = rs.getString("NOMARTICULO");
                int precio = rs.getInt("PRECIO");
                String fecha = rs.getString("FECHA");
                String importado = rs.getString("IMPORTADO");
                String pais = rs.getString("PAISDEORIGEN");

                producto = new Producto();
                producto.setId_producto(id_articulo);
                producto.setSeccion(seccion);
                producto.setNomArticulo(nomArticulo);
                producto.setPrecio(precio);
                producto.setFecha(fecha);
                producto.setImportado(importado);
                producto.setPaisOrigen(pais);

                productos.add(producto);

            }
        }
        finally {
                Conexion.close(rs);
                Conexion.close(instruccion);
                if(this.conexionTransaccional == null){
                        Conexion.close(conectar);
                }
        }

        return productos;
    }

    public void insertar(Producto producto) throws SQLException{
        Connection conectar = null;
        PreparedStatement instruccion = null;
        int rows;
        try {
            conectar = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            instruccion = conectar.prepareStatement(INSERT);
            instruccion.setString(1, producto.getSeccion());
            instruccion.setString(2, producto.getNomArticulo());
            instruccion.setInt(3, producto.getPrecio());
            instruccion.setString(4, producto.getFecha());
            instruccion.setString(5, producto.getImportado());
            instruccion.setString(6, producto.getPaisOrigen());

            rows = instruccion.executeUpdate();
            System.out.println("********************");
            System.out.println("Registros insertados: " + rows);

        }
        finally {
            Conexion.close(instruccion);
            if(this.conexionTransaccional == null){
                Conexion.close(conectar);
            }
        }
    }

    public void modificar(Producto producto) throws SQLException{
        Connection conectar = null;
        PreparedStatement instruccion = null;
        int rows;

        try {
            conectar = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            instruccion = conectar.prepareStatement(UPDATE);
            instruccion.setString(1, producto.getSeccion());
            instruccion.setString(2, producto.getNomArticulo());
            instruccion.setInt(3, producto.getPrecio());
            instruccion.setString(4, producto.getFecha());
            instruccion.setString(5, producto.getImportado());
            instruccion.setString(6, producto.getPaisOrigen());
            instruccion.setInt(7, producto.getId_articulo());

            rows = instruccion.executeUpdate();
            System.out.println("**********************************");
            System.out.println("Registros actualizados: " + rows);

        }
        finally {
            Conexion.close(instruccion);
            if(this.conexionTransaccional == null){
                Conexion.close(conectar);
            }
        }
    }

    public void eliminar(Producto producto) throws SQLException{
        Connection conectar = null;
        PreparedStatement instruccion = null;
        int rows;

        try {
            conectar = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            instruccion = conectar.prepareStatement(DELETE);
            instruccion.setInt(1, producto.getId_articulo());

            rows = instruccion.executeUpdate();
            System.out.println("***********************************");
            System.out.println("Registros eliminados: " + rows);

        }
        finally {
            Conexion.close(instruccion);
            if(this.conexionTransaccional == null){
                Conexion.close(conectar);
            }
        }
    }

    public void procedureActualizar(Producto producto, int precio, String articulo) throws SQLException{
        Connection conectar = null;
        CallableStatement instruccion = null;

        try {
            conectar = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            instruccion = conectar.prepareCall("{call ACT_PRODUCTO(?,?) }");
            instruccion.setInt(1, precio);
            instruccion.setString(2, articulo);
            instruccion.execute();

        }
        finally {
            Conexion.close(instruccion);
            if(this.conexionTransaccional == null){
                Conexion.close(conectar);
            }
        }
    }
}
