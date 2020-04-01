import java.sql.*;

public class infoMetaDatos {
    public static void main(String[] args){
            mostrarInfoBD();
    }
    static void mostrarInfoBD() {
        Connection conexion = null;

        try{
            conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","2406");

            //obtencion de datos
            DatabaseMetaData datos = conexion.getMetaData();

            //mostrar informacion de la BD
            System.out.println("Gestor de BD: " + datos.getDatabaseProductName());
            System.out.println("Version del gestor: " + datos.getDatabaseProductVersion());
            System.out.println("Nombre del Driver: " + datos.getDriverName());
            System.out.println("Version del Driver: " + datos.getDriverVersion());

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try{
                conexion.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
