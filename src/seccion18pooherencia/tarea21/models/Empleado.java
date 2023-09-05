package seccion18pooherencia.tarea21.models;

public class Empleado extends Persona{
    private Double remuneracion;
    private int empreadoID;
    private static int ultimoID;

    Empleado(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empreadoID = ++ultimoID;
    }

    public Double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpreadoID() {
        return empreadoID;
    }

    public static int getUltimoID() {
        return ultimoID;
    }

    public void aumentarRemuneracion(int porcentaje) {
        this.remuneracion += remuneracion * porcentaje / 100;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nremuneracion=" + remuneracion +
                ", empreadoID=" + empreadoID;
    }
}
