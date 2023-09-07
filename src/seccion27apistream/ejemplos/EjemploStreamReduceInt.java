package seccion27apistream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduceInt {
    public static void main(String[] args) {

        Stream<Integer> nombres = Stream.of(5, 10, 15, 20);

        int resultado = nombres.reduce(0, Integer::sum); // (a, b) -> a+b
        System.out.println(resultado);


    }
}
