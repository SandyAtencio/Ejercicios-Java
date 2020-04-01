package Datos;

import Dominio.Usuario;

import java.sql.*;
import java.util.*;

public class UsuarioBD {

    private static final String SELECT = "SELECT id_usuario, usuario, password FROM USUARIOS";
    private static final String INSERT = "INSERT INTO USUARIOS (ID_USUARIO, USUARIO, PASSWORD) VALUES (SEQ_USUARIO.NEXTVAL,?,?)";
    private static final String UPDATE = "UPDATE USUARIOS SET  USUARIO = ?, PASSWORD = ? WHERE ID_USUARIO = ?";
    private static final String DELETE = "DELETE FROM USUARIOS WHERE ID_USUARIO = ?";

    public List<Usuario> seleccionar(){
        Connection conectar = null;
        PreparedStatement instruccion = null;
        ResultSet rs = null;
        Usuario user;
        List<Usuario> usuarios = new ArrayList<>();

        try {
            conectar = Conexion.conectar();
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
        }catch (SQLException e){
            e.printStackTrace(System.out);
        }
        finally {
                if(conectar != null && instruccion != null && rs != null){
                    Conexion.close(conectar);
                    Conexion.close(instruccion);
                    Conexion.close(rs);
                }
        }

        return usuarios;
    }

    public void insertar(Usuario usuario){
        Connection conectar = null;
        PreparedStatement instruccion = null;
        int rows;
        try {
            conectar = Conexion.conectar();
            instruccion = conectar.prepareStatement(INSERT);
            instruccion.setString(1, usuario.getUsuario());
            instruccion.setString(2, usuario.getPassword());

            rows = instruccion.executeUpdate();
            System.out.println("********************");
            System.out.println("Registros insertados: " + rows);

        }catch (SQLException e){
            e.printStackTrace(System.out);
        }
        finally {
            if(conectar != null && instruccion != null){
                Conexion.close(conectar);
                Conexion.close(instruccion);
            }
        }
    }

    public void modificar(Usuario usuario){
        Connection conectar = null;
        PreparedStatement instruccion = null;
        int rows;

        try {
            conectar = Conexion.conectar();
            instruccion = conectar.prepareStatement(UPDATE);
            instruccion.setString(1, usuario.getUsuario());
            instruccion.setString(2, usuario.getPassword());
            instruccion.setInt(3, usuario.getId_usuario());

            rows = instruccion.executeUpdate();
            System.out.println("**********************************");
            System.out.println("Registros actualizados: " + rows);

        }catch (SQLException e){
            e.printStackTrace(System.out);
        }
        finally {
            if(conectar != null && instruccion != null){
                Conexion.close(conectar);
                Conexion.close(instruccion);
            }
        }
    }

    public void eliminar(Usuario usuario){
        Connection conectar = null;
        PreparedStatement instruccion = null;
        int rows;

        try {
            conectar = Conexion.conectar();
            instruccion = conectar.prepareStatement(DELETE);
            instruccion.setInt(1, usuario.getId_usuario());

            rows = instruccion.executeUpdate();
            System.out.println("***********************************");
            System.out.println("Registros eliminados: " + rows);

        }catch (SQLException e){
            e.printStackTrace(System.out);
        }
        finally {
            if(conectar != null && instruccion != null){
                Conexion.close(conectar);
                Conexion.close(instruccion);
            }
        }
    }
}
