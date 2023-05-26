import java.util.Scanner;

public class Tarea9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número positivo o negativo");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número positivo o negativo");
        int num2 = scanner.nextInt();
        int resultadoMultiplicacion = 0;

        if (num1 > 0 && num2 > 0) {

            for (int i = 0; i < num1; i++) {
                resultadoMultiplicacion = resultadoMultiplicacion + num2;
            }

        System.out.println(num1 + " * " + num2 + " = " + resultadoMultiplicacion);

        } else if (num1 > 0 && num2 < 0) {

            for (int i = 0; i < num1; i++) {
                resultadoMultiplicacion = resultadoMultiplicacion + num2;
            }

            System.out.println(num1 + " * " + num2 + " = " + resultadoMultiplicacion);

        } else if (num1 < 0 && num2 > 0) {

            for (int i = 0; i < num2; i++) {
                resultadoMultiplicacion = resultadoMultiplicacion + num1;
            }

            System.out.println(num1 + " * " + num2 + " = " + resultadoMultiplicacion);

        } else {

            for (int i = num1; i < 0; i++) {
                resultadoMultiplicacion = resultadoMultiplicacion + num2;
            }

            resultadoMultiplicacion = resultadoMultiplicacion - (resultadoMultiplicacion) - (resultadoMultiplicacion);

            System.out.println(num1 + " * " + num2 + " = " + resultadoMultiplicacion); // (-1 * resultadoMultiplicacion)
        }

    }

    /* public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero a: ");
        int a = scanner.nextInt();

        System.out.println("Ingrese el numero b: ");
        int b = scanner.nextInt();
        int resultado = 0;

        // verificamos los signos de cada uno, si es positivo o negativo
        boolean positivoB = b > -1;
        boolean positivoA = a > -1;

        // calculamos el valor absoluto de a
        int absolutoA = positivoA? a: -a; // equivalente a Math.abs(a);

        // sumamos tantas veces el valor de b, segun el valor de a.
        for(int i = 0; i < absolutoA; i++){
            resultado = resultado + b;
        }

        // si ambos son negativos o si solo a es negativo damos vuelta el signo
        if((!positivoA && !positivoB) || !positivoA){
            resultado = -resultado;
        }

        System.out.println("el resultado es " + resultado);
    } */
}
