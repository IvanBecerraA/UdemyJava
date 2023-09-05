package seccion12arreglos;

import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        
        String[] productos = new String[7];
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxty";
        productos[2] = "Disco Duro SSD";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast";
        productos[6] = "Bicicleta";

        Arrays.sort(productos);

        String producto1 = productos[0];
        String producto2 = productos[1];
        String producto3 = productos[2];
        String producto4 = productos[3];
        String producto5 = productos[4];
        String producto6 = productos[5];
        String producto7 = productos[6];
        System.out.println("productos[0] = " + producto1);
        System.out.println("productos[1] = " + producto2);
        System.out.println("productos[2] = " + producto3);
        System.out.println("productos[3] = " + producto4);
        System.out.println("productos[4] = " + producto5);
        System.out.println("productos[5] = " + producto6);
        System.out.println("productos[6] = " + producto7);

        int[] numeros = new int[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = (int)35L;
        numeros[3] = -1;
        // numeros[4] = 5;

        Arrays.sort(numeros);
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1];
        // int m = numeros[4];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}
