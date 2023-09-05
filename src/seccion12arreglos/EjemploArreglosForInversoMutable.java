package seccion12arreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public static void main(String[] args) {

        

        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD", "Asus Notebook", "Macbook Air", "Chromecast", "Bicicleta"};
        int total = productos.length;

        Arrays.sort(productos);
        System.out.println("--- Usando for ---");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        // arregloInverso(productos);

        Collections.reverse(Arrays.asList(productos));

        System.out.println("--- Usando for ---");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }
    }

    public static void arregloInverso(String[] arreglo) {
        int total = arreglo.length;
        int total2 = arreglo.length;
        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }
}
