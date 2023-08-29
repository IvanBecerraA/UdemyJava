package seccion1hasta11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd'");
        try {
            Date fecha = format.parse(scanner.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();

            if (fecha.after(fecha2)) {
                System.out.println("Fecha (del usuario) es después que fecha2");
            } else if (fecha.before(fecha2)){
                System.out.println("Fecha es anterior que fecha 2");
            } else {
                System.out.println("Fechas son iguales");
            }

            if (fecha.compareTo(fecha2) > 0) {
                System.out.println("Fecha (del usuario) es después que fecha2");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha es anterior que fecha 2");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("Fechas son iguales");
            }

        } catch (ParseException e) {
            // throw new RuntimeException(e);
            System.err.println("La fecha tiene un formato incorrecto");
            System.err.println("El formato debe ser yyyy-MM-dd");
            // System.exit(1);
            main(args);
        }

    }
}
