import java.io.*;

public class ManejoArhcivos {
    private static final String NOMBRE_ARCHIVO = "C:\\Users\\satencioh\\Desktop\\JavaProject\\archivos\\archivo.txt";

    public static void main(String[] args) {
        Archivo archivoNuevo = new Archivo();
        archivoNuevo.crear(NOMBRE_ARCHIVO);
        archivoNuevo.leer(NOMBRE_ARCHIVO);
        archivoNuevo.escribir(NOMBRE_ARCHIVO);
        archivoNuevo.leer(NOMBRE_ARCHIVO);
    }
}

class Archivo{


    public void crear(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Archivo creado!");
        }catch (IOException e){
            System.out.println("Error en la creacion del archivo");
        }
    }

    public void escribir(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        String linea = "Manejo de archivos (crear, leer y escribir) en Java\n";
        try{
            PrintWriter entrada = new PrintWriter(new FileWriter(archivo, true));
            entrada.println(linea);
            entrada.close();
            System.out.println("Se escribio en el archivo!");
        }catch (IOException e){
            System.out.println("No se ha encontrado el archivo");
        }

    }

    public void leer(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader salida = new BufferedReader(new FileReader(archivo));
            String linea = "";
            while(linea != null){
                linea = salida.readLine();

                if(linea != null){
                    System.out.println(linea);
                }
            }
            salida.close();
        }catch (IOException e){
            System.out.println("No se ha encontrado el archivo");
        }
    }
}