public class UsoPersona {
    public static void main(String[] args) {
        Pareja<String> una = new Pareja<>();
        una.setPrimero("Sergio");
        System.out.println(una.getPrimero());


        Pareja<Persona> otra = new Pareja<>();
        otra.setPrimero(new Persona("Sandy"));
        System.out.println(otra.getPrimero());

        Empleado[] listaEmpleados = {new Empleado("Sergio",29,20.000),
                                    new Empleado("Sandy",23,50.000),
                                    new Empleado("Eduar",12,10.000)
        };
        System.out.println(MisMatrices.getElementos(listaEmpleados));
    }
}
class Persona{

    private String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

class MisMatrices{
    public static <T>  String getElementos(T[] array){
        return "El array tiene " + array.length + " elementos.";
    }
}
