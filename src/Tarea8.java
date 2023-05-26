import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double[] notasFinales = new Double[20];
        Double promedioMayor5 = 0d, promedioMenor4 = 0d, promedioTotal = 0d;
        int contadorNotas1 = 0, contadorMayor5 = 0, contadorMenor4 = 0;

        try {

            for (int i = 0; i < notasFinales.length; i++) {

                System.out.println("Ingresar la nota final del alumno N° " + (i + 1) + ", \"debe ser de 1 - 7\"");
                notasFinales[i] = scanner.nextDouble();

                if (notasFinales[i] == 0) {
                    System.out.println("Error al ingresar nota = 0, finalizando programa");
                    System.exit(0);
                }

                while (notasFinales[i] < 1 || notasFinales[i] > 7) {
                    System.out.println("Ingrese una nota valida: de 1 - 7. Para el alumno N° " + (i + 1));
                    notasFinales[i] = scanner.nextDouble();
                    if (notasFinales[i] == 0) {
                        System.out.println("Error al ingresar nota = 0, finalizando programa");
                        System.exit(0);
                    }
                }

                promedioTotal  += notasFinales[i];

                if (notasFinales[i] > 5) {
                    promedioMayor5 += notasFinales[i];
                    contadorMayor5++;
                } else if (notasFinales[i] < 4) {
                    promedioMenor4 += notasFinales[i];
                    contadorMenor4++;
                }

                if (notasFinales[i] == 1) {
                    contadorNotas1++;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error al ingresar valores no numericos.");
            main(args);
            System.exit(0);
        }

        System.out.println("-------------- Notas Finales --------------");
        for (double nota : notasFinales) {
            System.out.print(" [" + nota + "]");
        }
        System.out.println("\nPromedio de notas mayor a 5: " + String.format("%.1f", (promedioMayor5 / contadorMayor5)) + ", Total notas mayor a 5: " + contadorMayor5);
        System.out.println("Promedio de menor a 4: " + String.format("%.1f", (promedioMenor4 / contadorMenor4)) + ", Total notas menor a 4: " + contadorMenor4);
        System.out.println("Cantidad de notas 1: " + contadorNotas1);
        System.out.println("Promedio total de todos los alumnos: " + String.format("%.1f", (promedioTotal / 20)) );

    }
}
