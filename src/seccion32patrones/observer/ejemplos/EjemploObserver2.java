package seccion32patrones.observer.ejemplos;

import seccion32patrones.observer.UsuarioRepositotio;

public class EjemploObserver2 {
    public static void main(String[] args) {

        UsuarioRepositotio repo = new UsuarioRepositotio();

        repo.addObserver((o, u) -> System.out.println("Enviando un email al usuario " + u));
        repo.addObserver((o, u) -> System.out.println("Enviando un email al administrador"));
        repo.addObserver((o, u) -> System.out.println("Guardando info del usuario " + u + " en el logs"));
        repo.crearUsuario("Iván");

    }
}
