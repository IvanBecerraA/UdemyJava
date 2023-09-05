package seccion21hasta22genericos.terea26.models;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {

    private List<T> productos;
    private int indiceProductos;
    private int max = 5;

    public BolsaSupermercado() {
        this.productos = new ArrayList();
    }

    public void addProducto(T t) {
        if (productos.size() <= max) {
            this.productos.add(t);
        } else {
            throw new RuntimeException("no hay más espacio.");
        }
    }

    public List<T> getProductos() {
        return productos;
    }

}
