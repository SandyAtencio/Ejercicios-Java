package Datos;

import java.sql.*;

public class Conexion {

    private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String JDBC_USER = "system";
    private static final String JDBC_PASS = "2406";

    public static Connection conexion() throws SQLException{
        return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASS);
    }

    public static void close(PreparedStatement instruccion){
        try{
            instruccion.close();
        }catch (SQLException e){
            e.printStackTrace(System.out);
        }
    }

    public static void close(ResultSet resultado) {
        try{
            resultado.close();
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
