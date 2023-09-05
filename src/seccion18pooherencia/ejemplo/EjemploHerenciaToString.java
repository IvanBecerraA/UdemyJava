package seccion18pooherencia.ejemplo;

import seccion18pooherencia.pooherencia.Alumno;
import seccion18pooherencia.pooherencia.AlumnoInternacional;
import seccion18pooherencia.pooherencia.Persona;
import seccion18pooherencia.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println("======= Creando la instancia de la clase Alumno =======");
        Alumno alumno = new Alumno("Iván", "Becerra", 29, "Intituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("ivan@gmail.com");

        System.out.println("======= Creando la instancia de la clase AlumnoInternacional =======");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEdad(15);
        alumno.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("peter@gmail.com");

        System.out.println("======= Creando la instancia de la clase Profesor =======");
        Profesor profesor = new Profesor("Luci", "Pérez", "Matemáticas");
        profesor.setEdad(37);
        profesor.setEmail("profesor.luci@colegio.com");

        System.out.println("======= - =======");
        System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " " + alumno.getInstitucion());
        System.out.println(alumnoInt.getNombre() + " " + alumnoInt.getApellido() + " " + alumnoInt.getInstitucion() + " " + alumnoInt.getPais());
        System.out.println("Profesor " + profesor.getAsignatura() + ": " + profesor.getNombre() + " " + profesor.getApellido());


        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);
    }

    public static void imprimir(Persona persona) {
        System.out.println();
        System.out.println(persona);
    }
}
