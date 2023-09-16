package seccion32patrones.decorator2;

import seccion32patrones.decorator2.decorador.ConChocolateDecorador;
import seccion32patrones.decorator2.decorador.ConCremaDecorador;
import seccion32patrones.decorator2.decorador.ConLecheDecorador;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {

        Configurable cafe = new Cafe(7, "Cafe Mocha");
        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChocolate = new ConChocolateDecorador(conLeche);

        System.out.println("El precio del cafe mocha es: " + conChocolate.getPrecioBase());
        System.out.println("Los ingredientes: " + conChocolate.getIngredientes());

        Configurable capuchino = new Cafe(4, "Cafe Capuchino");
        conCrema = new ConCremaDecorador(capuchino);
        conLeche = new ConLecheDecorador(conCrema);
        System.out.println("El precio del capuchino es: " + conLeche.getPrecioBase());
        System.out.println("Los ingredientes: " + conLeche.getIngredientes());

        Configurable espresso = new Cafe(3, "Cafe Expresso");
        System.out.println("El precio del cafe espresso es: " + espresso.getPrecioBase());
        System.out.println("Los ingredientes: " + espresso.getIngredientes());

    }
}
