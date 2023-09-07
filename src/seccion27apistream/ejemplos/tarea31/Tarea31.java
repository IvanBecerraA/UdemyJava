package seccion27apistream.ejemplos.tarea31;

import java.util.Arrays;
import java.util.stream.Stream;

public class Tarea31 {
    public static void main(String[] args) {

        int[] numeros = new int[100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i+1;
        }

        double resultado = Arrays.stream(numeros)
                .filter(n -> n % 10 != 0)
                .mapToDouble(n -> (double) n / 2)
                .reduce(0, (a, b) -> a + b);

        System.out.println(resultado);

    }
}
