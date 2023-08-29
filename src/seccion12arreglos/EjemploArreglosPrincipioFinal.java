package seccion12arreglos;

public class EjemploArreglosPrincipioFinal {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int[] a = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        int aux = 0;
        for (int i = 0; i < numeros.length - i; i++) {
            // System.out.println(numeros[i] + " - " + numeros[numeros.length - 1 - i]);
            a[aux++] = numeros[i];
            a[aux++] = numeros[numeros.length - 1 - i];
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("i = " + i + " valor: " + a[i]);
        }

    }
}
