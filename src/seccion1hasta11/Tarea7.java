package seccion1hasta11;

import java.util.Scanner;

public class Tarea7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cantidadNumeros = 0;

        System.out.println("Ingresar la cantidad de números a comparar, (valor mínimo 10)");
        while (cantidadNumeros < 10) {
            cantidadNumeros = scanner.nextInt();
            if (cantidadNumeros < 10) {
                System.out.println("Ingrese un valor mínimo 10");
            }
        }

        Integer[] numeros = new Integer[cantidadNumeros];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese número, N° " + ( i + 1));
            numeros[i] = scanner.nextInt();
        }

        int numeroMenor = numeros[0];
        for (int i : numeros) {
            for (int j: numeros) {
                if (i < j) {
                    if (i < numeroMenor) {
                        numeroMenor = i;
                    }
                }
            }
        }

        System.out.println("numeroMenor = " + numeroMenor);
        if (numeroMenor < 10) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("el numero menor es igual o mayor que 10!");
        }

    }
}
