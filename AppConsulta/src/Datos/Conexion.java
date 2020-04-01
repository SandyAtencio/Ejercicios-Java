package Datos;

import java.sql.*;

public class Conexion {

    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USER = "system";
    private static final String PASS = "2406";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASS);
    }

    public static void close(PreparedStatement instruccion){
        try{
            instruccion.close();
        }catch (SQLException e){
            e.printStackTrace(System.out);
        }
    }

    public static void close(ResultSet rs){
        try{
            rs.close();
        }catch (SQLException e){
            e.printStackTrace(System.out);
        }
    }

    public static void close(Connection conexion){
        try{
            conexion.close();
        }catch (SQLException e){
            e.printStackTrace(System.out);
        }
    }


}
