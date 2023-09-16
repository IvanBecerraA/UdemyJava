package seccion32patrones.factory.producto;

import seccion32patrones.factory.PizzaProducto;

public class PizzaCaliforniaPepperoni extends PizzaProducto {

    public PizzaCaliforniaPepperoni() {
        super();
        nombre = "Pizza California Pepperoni";
        masa = "Masa de la piedra gruesa";
        salsa = "Salsa de tomate";
        ingredientes.add("Pepperoni");
        ingredientes.add("Extra queso Mozzarella");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 50 min. a 55°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños rectángulos.");
    }
}
