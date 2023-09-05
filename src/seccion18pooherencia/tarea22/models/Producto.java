package seccion18pooherencia.tarea22.models;

public class Producto {
    private String nombre;
    private Double precio;
    private static Producto[] productos = new Producto[8];
    private static int indiceProductos = 0;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void addProducto() {
        productos[indiceProductos++] = this;
    }

    public static void imprimirProducto() {
        for (Producto p : productos) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }
    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", precio=" + precio;
    }
}
