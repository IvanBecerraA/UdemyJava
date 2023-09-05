package seccion26lambda.tarea29;

import java.util.function.Function;

public class Tarea29 {
    public static void main(String[] args) {

        Function<String, String> function = frase -> {

            System.out.println(frase);
            String frase2 = frase.replaceAll("[\s.,]", "").toUpperCase();

            return frase2;
        };

        System.out.println(function.apply("  ,, Iván.. , Becerra .. "));

    }
}
