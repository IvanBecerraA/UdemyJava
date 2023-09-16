package seccion32patrones.decorator;

import seccion32patrones.decorator.decorador.MayusculaDecorador;
import seccion32patrones.decorator.decorador.ReversaDecorador;
import seccion32patrones.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {

        Formateable texto = new Texto("Hola que tal Iván!");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);

        System.out.println(subrayar.darFormato());

    }
}
