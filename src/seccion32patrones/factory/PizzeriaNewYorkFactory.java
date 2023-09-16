package seccion32patrones.factory;

import seccion32patrones.factory.producto.PizzaNewYorkItaliana;
import seccion32patrones.factory.producto.PizzaNewYorkPepperoni;
import seccion32patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {
    @Override
    PizzaProducto crearPizza(String tipo) {

        return switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "pepperoni" -> new PizzaNewYorkPepperoni();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };

    }
}
