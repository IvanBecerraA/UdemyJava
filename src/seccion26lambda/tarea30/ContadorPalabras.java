package seccion26lambda.tarea30;

import java.util.Map;

@FunctionalInterface
public interface ContadorPalabras {
    Map<String, Integer> contarPalabras(String frase);
}
