package Datos;

import Dominio.Usuario;

import java.sql.*;
import java.util.*;

public class UsuarioBD {

    private Connection conexionTransaccional;

    private static final String SELECT = "SELECT id_usuario, usuario, password FROM USUARIOS";
    private static final String INSERT = "INSERT INTO USUARIOS (ID_USUARIO, USUARIO, PASSWORD) VALUES (SEQ_USUARIO.NEXTVAL,?,?)";
    private static final String UPDATE = "UPDATE USUARIOS SET  USUARIO = ?, PASSWORD = ? WHERE ID_USUARIO = ?";
    private static final String DELETE = "DELETE FROM USUARIOS WHERE ID_USUARIO = ?";

    public UsuarioBD(){

    }

    public UsuarioBD(Connection conexionTransaccional){
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<Usuario> seleccionar() throws SQLException{
        Connection conectar = null;
        PreparedStatement instruccion = null;
        ResultSet rs = null;
        Usuario user;
        List<Usuario> usuarios = new ArrayList<>();

        try {
            conectar = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            instruccion = conectar.prepareStatement(SELECT);
            rs = instruccion.executeQuery();

            while (rs.next()){
                int id_usuario = rs.getInt("id_usuario");
                String usuario = rs.getString("usuario");
                String password = rs.getString("password");

                user = new Usuario();
                user.setId_usuario(id_usuario);
                user.setUsuario(usuario);
                user.setPassword(password);

                usuarios.add(user);

            }
        }
        finally {
                Conexion.close(rs);
                Conexion.close(instruccion);
                if(this.conexionTransaccional == null){
                        Conexion.close(conectar);
                }
        }

        return usuarios;
    }

    public void insertar(Usuario usuario) throws SQLException{
        Connection conectar = null;
        PreparedStatement instruccion = null;
        int rows;
        try {
            conectar = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            instruccion = conectar.prepareStatement(INSERT);
            instruccion.setString(1, usuario.getUsuario());
            instruccion.setString(2, usuario.getPassword());

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

    public void modificar(Usuario usuario) throws SQLException{
        Connection conectar = null;
        PreparedStatement instruccion = null;
        int rows;

        try {
            conectar = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            instruccion = conectar.prepareStatement(UPDATE);
            instruccion.setString(1, usuario.getUsuario());
            instruccion.setString(2, usuario.getPassword());
            instruccion.setInt(3, usuario.getId_usuario());

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

    public void eliminar(Usuario usuario) throws SQLException{
        Connection conectar = null;
        PreparedStatement instruccion = null;
        int rows;

        try {
            conectar = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            instruccion = conectar.prepareStatement(DELETE);
            instruccion.setInt(1, usuario.getId_usuario());

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
}
