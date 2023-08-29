package seccion1hasta11;

import java.util.Scanner;
public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nombre1, nombre2, nombre3, n1, n2, n3, resultado;

        System.out.println("Ingrese el primer nombre");
        nombre1 = scanner.nextLine();
        System.out.println("Ingrese el segundo nombre");
        nombre2 = scanner.nextLine();
        System.out.println("Ingrese el tercer nombre");
        nombre3 = scanner.nextLine();

        n1 = (String.valueOf(nombre1.charAt(1))).toUpperCase().concat(".").concat(nombre1.substring(nombre1.length()-2));
        n2 = (String.valueOf(nombre2.charAt(1))).toUpperCase().concat(".").concat(nombre2.substring(nombre2.length()-2));
        n3 = (String.valueOf(nombre3.charAt(1))).toUpperCase().concat(".").concat(nombre3.substring(nombre3.length()-2));

        resultado = n1.concat("_").concat(n2).concat("_").concat(n3);

        System.out.println("nombres = " + nombre1 + ", " + nombre2 + " y " + nombre3);
        System.out.println("resultado = " + resultado);

    }
}
