package seccion32patrones.factory.ejemplo;

import seccion32patrones.factory.PizzaProducto;
import seccion32patrones.factory.PizzeriaCaliforniaFactory;
import seccion32patrones.factory.PizzeriaNewYorkFactory;
import seccion32patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {

        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = california.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza " + pizza.getNombre());
        
        pizza = ny.ordenarPizza("pepperoni");
        System.out.println("Andrés ordena la pizza " + pizza.getNombre());

        pizza = california.ordenarPizza("vegetariana");
        System.out.println("James ordena la pizza " + pizza.getNombre());
        
        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Linus ordena la pizza " + pizza.getNombre());        
        
        pizza = california.ordenarPizza("pepperoni");
        System.out.println("Jhon ordena la pizza " + pizza.getNombre());

        System.out.println("pizza = " + pizza);
    }
}
