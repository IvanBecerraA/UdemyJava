package seccion28optional.ejemplo;

import seccion28optional.ejemplo.models.Computador;
import seccion28optional.ejemplo.repositorio.ComputadorRepositorio;
import seccion28optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorioMetodosOrElseThrow {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador pc = repositorio.filtrar("rog").orElseThrow(IllegalStateException::new);
        System.out.println("pc = " + pc);

        String archivo = "documento.pdf";
        String extencion = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow();

        System.out.println(extencion);



    }

}
