package seccion27apistream.ejemplos.tarea34;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Tarea34 {
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1400, 2));
        productos.add(new Producto(300, 3));
        productos.add(new Producto(1500, 1));

        double granTotal = productos.stream()
                .map(p -> p.getCantidad() * p.getPrecio())
                .reduce(0d, Double::sum);

        System.out.println("granTotal = " + granTotal);

        double granTotal2 = productos.stream()
                .mapToDouble(p -> p.getPrecio() * p.getCantidad())
                .sum();
        System.out.println(granTotal2);
    }
}
