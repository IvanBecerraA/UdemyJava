package seccion12arreglos;

import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        
        String[] productos = new String[7];
        int total = productos.length;

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxty";
        productos[2] = "Disco Duro SSD";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast";
        productos[6] = "Bicicleta";

        Arrays.sort(productos);
        System.out.println("--- Usando for ---");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        System.out.println("--- Usando foreach ---");
        for (String producto : productos) {
            System.out.println("producto = " + producto);
        }

        System.out.println("--- Usando while ---");
        int i = 0;
        while (i < total) {
            System.out.println("para indice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("--- Usando do while ---");
        int j = 0;
        do {
            System.out.println("para indice " + j + " : " + productos[j]);
            j++;
        } while (j < total);


        int[] numeros = new int[10];
        int totalN = numeros.length;
        for (int k = 0; k < totalN; k++) {
            numeros[k] = k*3;
        }
        for (int k = 0; k < totalN; k++) {
            System.out.println("numeros = " + numeros[k]);
        }


    }
}
