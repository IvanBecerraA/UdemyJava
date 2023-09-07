package seccion27apistream.ejemplos;

import seccion27apistream.ejemplos.models.Factura;
import seccion27apistream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Jhon", "Doe");
        Usuario usuario2 = new Usuario("Pepe", "Pérez");

        usuario1.addFatura(new Factura("compras tecnologías"));
        usuario1.addFatura(new Factura("compras muebles"));

        usuario2.addFatura(new Factura("bicicleta"));
        usuario2.addFatura(new Factura("notebook gamer"));

        List<Usuario> usuarios = Arrays.asList(usuario1, usuario2);

        usuarios.stream()
                .flatMap(u -> u.getFacturas().stream())
                .forEach(f -> System.out.println(f.getDescripcion().concat(" : cliente ")
                        .concat(f.getUsuario().toString())));

        /*usuarios.stream()
                .map(Usuario::getFacturas)
                .flatMap(List::stream)
                .forEach(f -> System.out.println(f.getDescripcion().concat(" : cliente ")
                        .concat(f.getUsuario().toString())));*/

        /*for (Usuario u : usuarios) {
            for (Factura f : usuario1.getFacturas()) {
                System.out.println(f.getDescripcion());
            }
        }*/


    }
}
