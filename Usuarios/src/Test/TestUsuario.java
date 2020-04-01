package Test;

import Datos.UsuarioBD;
import Dominio.Usuario;

import java.util.List;

public class TestUsuario {
    public static void main(String[] args) {

        UsuarioBD usuarioBD = new UsuarioBD();
        List<Usuario> usuarios = usuarioBD.seleccionar();

        for (Usuario user: usuarios) {
            System.out.println("Usuario ===> " + user);
        }

        Usuario usuario = new Usuario();
       /* usuario.setUsuario("srodriguez");
        usuario.setPassword("123");

        usuarioBD.insertar(usuario);*/

       /*usuario.setUsuario("srodriguez");
       usuario.setPassword("2406");
       usuario.setId_usuario(2);

       usuarioBD.modificar(usuario);*/

       usuario.setId_usuario(1);
       usuarioBD.eliminar(usuario);


    }
}
