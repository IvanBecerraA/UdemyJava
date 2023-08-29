package seccion13matrices;

import java.util.Scanner;

public class Tarea18 {
    public static void main(String[] args) {

        String[][] matriz;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un número");
        n = scanner.nextInt();

        if (n > 0) {

            matriz = new String[n][n];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (i == j || ( (i+j) == n-1 )) {
                        matriz[i][j] = "x";
                    } else {
                        matriz[i][j] = "_";
                    }
                    System.out.print(matriz[i][j] + "\t");
                    // System.out.print(i + "," + j + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("error");
        }

    }
}
