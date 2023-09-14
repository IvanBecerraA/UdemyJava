package seccion28optional.ejemplo;

import seccion28optional.ejemplo.models.Computador;
import seccion28optional.ejemplo.repositorio.ComputadorRepositorio;
import seccion28optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador pc = repositorio.filtrar("rog").orElse(valorPorDefecto());
        System.out.println("pc = " + pc);

        pc = repositorio.filtrar("macbook pro").orElseGet(EjemploRepositorioMetodosOrElse::valorPorDefecto);
        System.out.println(pc);



    }

    public static Computador valorPorDefecto() {
        System.out.println("Obteniendo valor por defecto");
        return new Computador("HP Omen", "LA0001");
    }
}
