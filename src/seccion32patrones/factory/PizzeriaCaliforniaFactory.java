package seccion32patrones.factory;

import seccion32patrones.factory.producto.PizzaCaliforniaPepperoni;
import seccion32patrones.factory.producto.PizzaCaliforniaQueso;
import seccion32patrones.factory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory {
    @Override
    PizzaProducto crearPizza(String tipo) {

        return switch (tipo) {
            case "queso" -> new PizzaCaliforniaQueso();
            case "pepperoni" -> new PizzaCaliforniaPepperoni();
            case "vegetariana" -> new PizzaCaliforniaVegetariana();
            default -> null;
        };

    }
}
