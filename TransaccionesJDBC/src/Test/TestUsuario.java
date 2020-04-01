package Test;

import Datos.*;
import Dominio.Usuario;

import java.sql.*;

public class TestUsuario {
    public static void main(String[] args){
        Connection conexion = null;

        try {
            conexion = Conexion.conectar();
            if (conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }

            UsuarioBD usuarioBd = new UsuarioBD(conexion);

            Usuario cambioUsuario = new Usuario();
            cambioUsuario.setUsuario("shura_cfc");
            cambioUsuario.setPassword("2406");
            cambioUsuario.setId_usuario(2);
            usuarioBd.modificar(cambioUsuario);

            Usuario nuevoUsuario = new Usuario();
            nuevoUsuario.setUsuario("satencioh");
            nuevoUsuario.setPassword("12345");
            usuarioBd.insertar(nuevoUsuario);

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
