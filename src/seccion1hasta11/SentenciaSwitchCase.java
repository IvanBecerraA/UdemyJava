package seccion1hasta11;

import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        short num = 0;
        byte num1 = 1;
        char num2 = 2;
        int num3 = 3;
        var num4 = 4;
        String nombre = "admin";

        switch (num4) {
            case 0:
                System.out.println("El num es cero");
                break;
            case 1:
                System.out.println("El num es uno");
                break;
            case 2:
                System.out.println("El num es dos");
                break;
            case 3:
                System.out.println("El num es tres");
                break;
            default:
                System.out.println("Número o caracter desconocido");
        }

        switch (nombre) {
            case "admin":
                System.out.println("Hola admin");
            case "Ivan":
                System.out.println("Hola Ivan");
            default:
                System.out.println("Usuario no ingresado");
        }

        System.out.println("Ingresar el número del mes del 1 al 12");
        int mes = scanner.nextInt();
        String nombreMes = null;

        switch (mes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                System.out.println("Indefinido");
        }

        System.out.println("nombreMes = " + nombreMes);
    }
}
