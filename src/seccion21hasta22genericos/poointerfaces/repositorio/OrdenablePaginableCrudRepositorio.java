package seccion21hasta22genericos.poointerfaces.repositorio;

public interface OrdenablePaginableCrudRepositorio<T> extends CrudRepositorio<T>, OrdenableRepositorio<T>, PaginableRepositorio<T>, ContableRepositorio{

}
