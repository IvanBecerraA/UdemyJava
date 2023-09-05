package seccion13matrices;

import java.util.Scanner;

public class Tarea19 {
    public static void main(String[] args) {

        int[][] matriz;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un número");
        n = scanner.nextInt();

        if (n < 1) {
            System.out.println("ERROR");
            System.exit(-1);
        }

        matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i ++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ( (j == 0) || (i == n/2) || (j == n -1 && i > n/2) ) {
                    matriz[i][j] = 1;
                }
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i ++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(i + "," + j + " ");
            }
            System.out.println();
        }
    }
}
