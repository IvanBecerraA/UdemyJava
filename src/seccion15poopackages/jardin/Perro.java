package seccion15poopackages.jardin;


import seccion15poopackages.hogar.Persona;

public class Perro {
    protected String nombre;
    protected String raza;

    String jugar(Persona persona) {
        return persona.lanzarPelota();
    }
}
