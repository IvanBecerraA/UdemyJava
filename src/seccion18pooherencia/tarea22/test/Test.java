package seccion18pooherencia.tarea22.test;

import seccion18pooherencia.tarea22.models.*;

import static seccion18pooherencia.tarea22.models.Producto.imprimirProducto;

public class Test {
    public static void main(String[] args) {

        new Lacteo("leche", 1000.00, 3, 4);
        new Lacteo("leche de chocolate", 1200.00, 5, 5);

        new Fruta("Manzana", 1200.00, 1.00, "Rojo");
        new Fruta("Platano", 1300.00, 1.00, "Amarillo");

        new Limpieza("Esponja", 600.00, "Esponja", 0.00);
        new Limpieza("Lavaloza", 3000.00, "detergente", 1.50);

        new NoPerecible("no perecible 1", 999.00, 2, 300);
        new NoPerecible("no perecible 2", 999.00, 9, 999);

        imprimirProducto();

    }
}
