package seccion12arreglos;

import java.util.Scanner;

public class Tarea15 {
    public static void main(String[] args) {

        int[] arreglo = new int[7];
        int sumaP = 0, contadorP = 0, sumaN = 0, contadorN = 0, contadorCeros = 0;
        double promedioP, promedioN;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar 7 números");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = scanner.nextInt();
        }

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == 0) {
                contadorCeros++;
            } else if (arreglo[i] > 0) {
                sumaP += arreglo[i];
                contadorP++;
            } else {
                sumaN += arreglo[i];
                contadorN++;
            }
        }

        promedioP = (double) sumaP / contadorP;
        promedioN = (double) sumaN / contadorN;

        System.out.println("promedio números positivos = " + promedioP);
        System.out.println("promedio números negativos = " + promedioN);
        System.out.println("Cantidad de números cero = " + contadorCeros);
    }
}
