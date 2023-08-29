package seccion21hasta22genericos.poointerfaces.repositorio;

import java.util.List;

public interface PaginableRepositorio <T>{

    List<T> listar(int desde, int hasta);

}
