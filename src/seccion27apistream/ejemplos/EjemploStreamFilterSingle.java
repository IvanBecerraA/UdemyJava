package seccion27apistream.ejemplos;

import seccion27apistream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena"
                , "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepex"))
                .peek(System.out::println);

        Optional<Usuario> usuario = nombres.findFirst();
        //System.out.println(usuario.orElse(new Usuario("Jhon", "Doe")).getNombre());
        //System.out.println(usuario.orElseGet(() -> new Usuario("Jhon", "Doe")).getNombre());
        if (usuario.isPresent()) {
            System.out.println(usuario.get());
        } else {
            System.out.println("No se encontro el objeto");
        }

    }
}
