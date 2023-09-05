package seccion12arreglos;

import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumaNotasMatematicas = 0, sumaNotasHistoria = 0, sumaNotasLenguaje = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 7 notas de estudiantes para matemáticas");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = scanner.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para historia");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = scanner.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para lenguaje");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            sumaNotasMatematicas += claseMatematicas[i];
            sumaNotasHistoria += claseHistoria[i];
            sumaNotasLenguaje += claseLenguaje[i];
        }

        double promedioMatematicas = sumaNotasMatematicas/claseMatematicas.length;
        double promedioHistoria = sumaNotasHistoria/claseHistoria.length;
        double promedioLenguaje = sumaNotasLenguaje/claseLenguaje.length;

        System.out.println("Promedio clase matemáticas: " + (sumaNotasMatematicas/claseMatematicas.length));
        System.out.println("Promedio clase historia: " + (sumaNotasHistoria/claseHistoria.length));
        System.out.println("Promedio clase lenguaje: " + (sumaNotasLenguaje/claseLenguaje.length));
        System.out.println("Promedio total del curso: " + ((promedioMatematicas + promedioHistoria + promedioLenguaje) / 3));
        System.out.println("Ingrese el identificador del alumno (de 0 a 6): ");
        int id = scanner.nextInt();
        double promedioAlumno = ((claseMatematicas[id] + claseHistoria[id] + claseLenguaje[id]) / 3);
        System.out.println("Promedio alumno Nro " + id + " : " + promedioAlumno);


    }
}
