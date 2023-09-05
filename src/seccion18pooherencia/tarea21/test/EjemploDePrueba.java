package seccion18pooherencia.tarea21.test;

import seccion18pooherencia.tarea21.models.Gerente;

public class EjemploDePrueba {
    public static void main(String[] args) {

        Gerente gerente1 = new Gerente("Iván", "Becerra", "123", "Chile", 1000000.00);
        gerente1.setPresupuesto(5000000.00);
        gerente1.aumentarRemuneracion(15);
        System.out.println(gerente1);


    }
}
