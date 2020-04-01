package Test;

import Datos.PersonaJDBC;
import Domain.Persona;

import java.util.List;

public class ManejoPersonaJDBC {
    public static void main(String[] args) {

        //1. seleccionar
        PersonaJDBC personaBD = new PersonaJDBC();
        Persona persona = new Persona();
        List<Persona> personas = personaBD.seleccionar();

        for (Persona p: personas) {
            System.out.println("Persona: " + p);
        }

        //2. Insertar
        /*persona.setNombre("Sergio");
        persona.setApellido("Rodriguez");
        persona.setEmail("sandres9017@gmail.com");
        persona.setTelefono("3168041955");

        personaBD.insertar(persona);*/

        //3. Actualizar
        /*persona.setNombre("Sergio");
        persona.setApellido("Rodriguez");
        persona.setEmail("sergio@gmail.com");
        persona.setTelefono("3168041955");
        persona.setIdPersona(24);

        personaBD.actualizar(persona);*/

        //4. Delete
        persona.setIdPersona(3);
        personaBD.eliminar(persona);

        
    }
}
