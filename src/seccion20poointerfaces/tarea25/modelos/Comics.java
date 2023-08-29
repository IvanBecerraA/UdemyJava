package seccion20poointerfaces.tarea25.modelos;

public class Comics extends Libro{

    private String personaje;

    public Comics(int precio, String autor, String titulo, String editorial, String personaje) {
        super(precio, autor, titulo, editorial);
        this.personaje = personaje;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.9;
    }

    public String getPersonaje() {
        return personaje;
    }


}
