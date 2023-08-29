package seccion18pooherencia.tarea21.models;

public class Gerente extends Empleado{
    private Double presupuesto;

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion);
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\npresupuesto=" + presupuesto;
    }
}
