package seccion18pooherencia.tarea21.models;

public class Cliente extends Persona{
    private int id;
    private static int ultimoId;

    Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.id = ++ultimoId;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nid=" + id;
    }
}
