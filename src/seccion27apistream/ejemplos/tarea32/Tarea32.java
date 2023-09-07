package seccion27apistream.ejemplos.tarea32;

import java.util.Arrays;
import java.util.function.Function;

public class Tarea32 {
    public static void main(String[] args) {

        Integer[] arreglo = {4, 6, 10, 54, 30};

        Function<Integer[], Integer> max = arr -> Arrays.stream(arr).reduce(0, (a, b) -> a > b ? a : b);

        int resultado = max.apply(arreglo);
        System.out.println(resultado);

        Function<String[], String> functionString = array -> Arrays.stream(array).reduce("todos los nombres", (a, b) -> a.concat(" - ").concat(b));
        System.out.println(functionString.apply(new String[]{"uno", "dos", "tres"}));

    }
}
