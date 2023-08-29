package seccion20poointerfaces.tarea25.modelos;

abstract public class Producto implements IProducto{

    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public double getPrecioVenta() {
        return this.precio;
    }

    @Override
    public int getPrecio() {
        return this.precio;
    }
}
