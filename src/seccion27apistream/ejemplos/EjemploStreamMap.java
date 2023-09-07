package seccion27apistream.ejemplos;

import seccion27apistream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .map(usuario -> {
                    String nombre = usuario.getNombre().toUpperCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });

        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);
        //nombres.forEach(System.out::println);

        Stream<String> numeros = Stream.of("uno", "Dos", "Tres")
                .peek(System.out::println)
                .map(String::toLowerCase);
        List<String> listaNumeros = numeros.collect(Collectors.toList());
        listaNumeros.forEach(System.out::println);

        Stream<Usuario> usuarios2 = Stream.of("Iván Becerra", "Pato Guzman", "Pepa Pig")
                .map(usuario -> new Usuario(usuario.split(" ")[0], usuario.split(" ")[1]));
        usuarios2.forEach(System.out::println);

    }
}
