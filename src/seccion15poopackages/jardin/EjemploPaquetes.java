package seccion15poopackages.jardin;

import seccion15poopackages.hogar.*;
import static seccion15poopackages.hogar.Persona.*;
import static seccion15poopackages.hogar.ColorPelo.*;


public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Iván");
        persona.setApellido("Becerra");
        persona.setColorPelo(CAFE);
        System.out.println(persona.getNombre());

        Perro perro = new Perro();
        perro.nombre = "Tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(persona);
        System.out.println("jugando = " + jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;


    }
}
