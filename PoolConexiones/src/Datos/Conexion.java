package Datos;

import javax.sql.DataSource;
import java.sql.*;
import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {

    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USER = "system";
    private static final String PASS = "2406";
    private static BasicDataSource dataSource;

    public static DataSource getDataSource(){

        if (dataSource == null) {
            dataSource = new BasicDataSource();
            dataSource.setUrl(URL);
            dataSource.setUsername(USER);
            dataSource.setPassword(PASS);
            dataSource.setInitialSize(50);
        }
        return dataSource;
    }

    public static Connection conectar() throws SQLException {
        return getDataSource().getConnection();
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
