package Test;

import Datos.Conexion;
import Datos.UsuarioDAO;
import Datos.UsuarioDAOJDBC;
import Dominio.UsuarioDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestUsuario {
    public static void main(String[] args){
        Connection conexion = null;

        try {
            conexion = Conexion.conectar();
            if (conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }

            UsuarioDAO usuarioDAO = new UsuarioDAOJDBC(conexion);
            List<UsuarioDTO> usuarios = usuarioDAO.seleccionar();

            for (UsuarioDTO usuario: usuarios) {
                System.out.println("Usuario ===> " +usuario);
            }



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
