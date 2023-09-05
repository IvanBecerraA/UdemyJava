package seccion26lambda.tarea30;

import java.util.Collections;

public class Tarea30 {
    public static void main(String[] args) {

        ContadorPalabras contador = frase -> {

            String[] arreglo = frase.replaceAll("[,.]", "").toLowerCase().split(" ");

            String palabra = "";
            int max = 0;
            for (int i = 0; i < arreglo.length; i++) {
                int cantidad = 0;
                for (int j = 0; j < arreglo.length; j++) {
                    if (arreglo[i].equalsIgnoreCase(arreglo[j])) {
                        cantidad++;
                    }
                }

                if (cantidad > max) {
                    max = cantidad;
                    palabra = arreglo[i];
                }
            }

            return Collections.singletonMap(palabra, max);
        };

        contador.contarPalabras("Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto." +
                " Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500")
                .forEach( (k, v) -> System.out.println("la palabra " + k + " se repite " + v + " veces."));

    }
}
