import java.sql.*;

public class Conexion {
    public static void main(String[] args) {

        //1. cadena de conexion
        String url = "jdbc:oracle:thin:@localhost:1521:XE";

        try {
            //2.crear objeto de conexion a la bd
            Connection conexion = DriverManager.getConnection(url,"system","2406");

            //3. crear objeto de tipo Statement(sentencia)
            Statement instruccion = conexion.createStatement();

            //4. crear el query
            String sql = "SELECT ID_PERSONA, NOMBRE, APELLIDO, EMAIL, TELEFONO FROM PERSONA";

            //5. ejecuccion del query
            ResultSet resultado = instruccion.executeQuery(sql);

            //6. Procesar el resultado
            while(resultado.next()){
                System.out.println("Id Persona: " + resultado.getInt(1)
                        + " nombre: " + resultado.getString(2)
                        + " apellido: " + resultado.getString(3)
                        + " email: " + resultado.getString(4)
                        +" telefono: " + resultado.getString(5));
            }
            //cerrar cada objeto utilizado
            instruccion.close();
            resultado.close();
            conexion.close();

        }catch (SQLException e){
            e.printStackTrace(System.out);
        }

    }
}
