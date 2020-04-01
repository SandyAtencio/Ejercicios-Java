package Datos;

import Dominio.UsuarioDTO;

import java.sql.SQLException;
import java.util.List;

public interface UsuarioDAO {

    List<UsuarioDTO> seleccionar() throws SQLException;
    void insertar(UsuarioDTO usuario) throws SQLException;
    void modificar(UsuarioDTO usuario) throws SQLException;
    void eliminar(UsuarioDTO usuario) throws SQLException;

}
