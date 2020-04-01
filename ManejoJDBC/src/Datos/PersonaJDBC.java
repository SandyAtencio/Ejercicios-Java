package Datos;

import Domain.Persona;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaJDBC {

    //1. se crean las consultas que se van a emplear

    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM PERSONA";
    private static final String SQL_INSERT = "INSERT INTO persona (id_persona, nombre, apellido, email, telefono) VALUES (SEQ_PERSONA.NEXTVAL,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE persona SET  nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";


    public List<Persona> seleccionar(){

        Connection conectar = null;
        PreparedStatement instruccion = null;
        ResultSet rs = null;
        Persona persona;
        List<Persona> personas = new ArrayList<>();

        try {
            conectar = Conexion.conexion();
            instruccion = conectar.prepareStatement(SQL_SELECT);
            rs = instruccion.executeQuery();

            while(rs.next()){
                int id_persona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");

                persona = new Persona();
                persona.setIdPersona(id_persona);
                persona.setNombre(nombre);
                persona.setApellido(apellido);
                persona.setEmail(email);
                persona.setTelefono(telefono);

                personas.add(persona);
            }

        }catch (SQLException e){
            e.printStackTrace(System.out);
        }
        finally{
            if (conectar != null && instruccion != null && rs != null) {
                Conexion.close(conectar);
                Conexion.close(instruccion);
                Conexion.close(rs);
            }
        }

        return personas;
    }

    public void insertar(Persona persona){
        Connection conectar = null;
        PreparedStatement instruccion = null;
        int rows;

        try {
            conectar = Conexion.conexion();
            instruccion = conectar.prepareStatement(SQL_INSERT);
            instruccion.setString(1, persona.getNombre());
            instruccion.setString(2, persona.getApellido());
            instruccion.setString(3, persona.getEmail());
            instruccion.setString(4, persona.getTelefono());

            rows = instruccion.executeUpdate();
            System.out.println("**********************************");
            System.out.println("Registros afectados: " + rows);

        }catch (SQLException e){
            e.printStackTrace(System.out);
        }
        finally {
            if (conectar != null && instruccion != null) {
                Conexion.close(conectar);
                Conexion.close(instruccion);
            }
        }

    }

    public int actualizar(Persona persona){
        Connection conectar = null;
        PreparedStatement instruccion = null;
        int rows = 0;

        try {
            conectar = Conexion.conexion();
            instruccion = conectar.prepareStatement(SQL_UPDATE);
            instruccion.setString(1, persona.getNombre());
            instruccion.setString(2, persona.getApellido());
            instruccion.setString(3, persona.getEmail());
            instruccion.setString(4, persona.getTelefono());
            instruccion.setInt(5, persona.getIdPersona());

            rows = instruccion.executeUpdate();
            System.out.println("**********************************");
            System.out.println("Registros actualizados: " + rows);

        }catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            if(conectar != null & instruccion != null){
                Conexion.close(conectar);
                Conexion.close(instruccion);
            }
        }
        return rows;
    }

    public int eliminar(Persona persona){
        Connection conectar = null;
        PreparedStatement instruccion = null;
        int rows = 0;

        try{
            conectar = Conexion.conexion();
            instruccion = conectar.prepareStatement(SQL_DELETE);
            instruccion.setInt(1, persona.getIdPersona());

            rows = instruccion.executeUpdate();
            System.out.println("**********************************");
            System.out.println("Registros eliminados: " + rows);

        }catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            if(conectar != null & instruccion != null){
                Conexion.close(conectar);
                Conexion.close(instruccion);
            }
        }
        return rows;
    }

}

