package seccion21hasta22genericos.poointerfaces;

import seccion21hasta22genericos.poointerfaces.modelo.Cliente;
import seccion21hasta22genericos.poointerfaces.repositorio.Direccion;
import seccion21hasta22genericos.poointerfaces.repositorio.OrdenablePaginableCrudRepositorio;
import seccion21hasta22genericos.poointerfaces.repositorio.excepciones.AccesoDatoException;
import seccion21hasta22genericos.poointerfaces.repositorio.excepciones.EscrituraAccesoDatoException;
import seccion21hasta22genericos.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;
import seccion21hasta22genericos.poointerfaces.repositorio.excepciones.RegistroDuplicadoAccesoDatoException;
import seccion21hasta22genericos.poointerfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        try {
            OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
            repo.crear(new Cliente("Jano", "Pérez"));
            repo.crear(new Cliente("Bea", "González"));
            repo.crear(new Cliente("Luci", "Martínez"));
            Cliente andres = new Cliente("Andrés", "Guzmán");
            repo.crear(andres);
            repo.crear(andres);

            //repo.crear(null);

            List<Cliente> clientes = repo.listar();
            clientes.forEach(System.out::println);

            System.out.println();
            List<Cliente> paginable = repo.listar(1, 3);
            paginable.forEach(System.out::println);

            System.out.println("===== ordenar =====");
            List<Cliente> clientesOrdenAsc = repo.listar("apellido", Direccion.ASC);
            for (Cliente c : clientesOrdenAsc) {
                System.out.println(c);
            }

            System.out.println("===== editar =====");
            Cliente beaActualizar = new Cliente("Bea", "Mena");
            beaActualizar.setId(2);
            repo.editar(beaActualizar);
            Cliente bea = repo.porId(10);
            System.out.println(bea);
            System.out.println(" ========= ");
            repo.listar("nombre", Direccion.ASC).forEach(System.out::println);

            System.out.println("===== eliminar =====");
            repo.eliminar(2);
            repo.listar().forEach(System.out::println);

            System.out.println("===== total =====");
            System.out.println("Total registros: " + repo.total());
        } catch (RegistroDuplicadoAccesoDatoException e) {
            System.out.println("Registro duplicado: " + e.getMessage());
            e.printStackTrace();
        } catch (LecturaAccesoDatoException e) {
            System.out.println("Lectura: " + e.getMessage());
            e.printStackTrace();
        } catch (EscrituraAccesoDatoException e) {
            System.out.println("Escritura: " + e.getMessage());
            e.printStackTrace();
        } catch (AccesoDatoException e) {
            System.out.println("Generica" + e.getMessage());
            e.printStackTrace();
        }
    }
}
