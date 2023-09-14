package seccion28optional.ejemplo;

import seccion28optional.ejemplo.models.Computador;
import seccion28optional.ejemplo.models.Fabricante;
import seccion28optional.ejemplo.models.Procesador;
import seccion28optional.ejemplo.repositorio.ComputadorRepositorio;
import seccion28optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String f = repositorio.filtrar("asus")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab -> "intel".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");
        System.out.println("f = " + f);




    }

}
