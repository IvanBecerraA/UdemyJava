package seccion28optional.ejemplo;

import seccion28optional.ejemplo.models.Computador;
import seccion28optional.ejemplo.repositorio.ComputadorRepositorio;
import seccion28optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        repositorio.filtrar("mac").ifPresentOrElse(System.out::println,
                () -> System.out.println("No se encuentra"));

        //Optional<Computador> pc = repositorio.filtrar("asus rog");

        /*if (pc.isPresent()) {
            System.out.println(pc.get());
        } else {
            System.out.println("No se encuentra");
        }*/

    }
}
