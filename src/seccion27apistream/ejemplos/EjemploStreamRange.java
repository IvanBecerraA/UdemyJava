package seccion27apistream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRange {
    public static void main(String[] args) {

        IntStream numeros = IntStream.range(5, 20).peek(System.out::println);

        //int resultado = numeros.reduce(0, Integer::sum); // (a, b) -> a+b
        //int resultado = numeros.sum();
        IntSummaryStatistics stats = numeros.summaryStatistics();
        System.out.println("max: " + stats.getMax());
        System.out.println("min: " + stats.getMin());
        System.out.println("suma: " + stats.getSum());
        System.out.println("promedio: " + stats.getAverage());
        System.out.println("total: " + stats.getCount());


    }
}
