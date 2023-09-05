package seccion12arreglos;

import java.util.Scanner;

public class Tarea13 {
    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar 10 números");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < a.length / 2; i++) {
            System.out.println(a[a.length-i-1]);
            System.out.println(a[i]);
        }
    }
}
