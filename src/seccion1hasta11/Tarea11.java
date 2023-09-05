package seccion1hasta11;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Tarea11 {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaActual = formato.format(fecha);

        System.out.println("Ingrese su fecha de nacimiento con el formato: 'yyyy-MM-dd'");

        try {
            Date fechaNacimiento = formato.parse(scanner.next());
            System.out.println("fecha actual = " + fechaActual);
            String fechaNacimiento2 = formato.format(fechaNacimiento);
            System.out.println("fecha de nacimiento = " + fechaNacimiento2);

            String[] fechaNacimientoArr = fechaNacimiento2.split("-");
            String[] fechaActualArr = fechaActual.split("-");
            int edad = (Integer.parseInt(fechaActualArr[0]) - Integer.parseInt(fechaNacimientoArr[0]));
            if (Integer.parseInt(fechaActualArr[1]) < Integer.parseInt(fechaNacimientoArr[1])) {
                edad--;
            } else if ((Integer.parseInt(fechaActualArr[1]) == Integer.parseInt(fechaNacimientoArr[1]))
                    && Integer.parseInt(fechaActualArr[2]) < Integer.parseInt(fechaNacimientoArr[2])) {
                edad--;
            }

            System.out.println("edad del usuario: " + edad + " años");

        } catch (ParseException e) {
            System.out.println("Error: " + e);
        }

        // otro método
        System.out.println("Ingrese un fecha de nacimiento con formato yyyy-MM-dd:");
        String fechaStr = scanner.next();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNacimiento = df.parse(fechaStr);
        Date actual = new Date();

        // creamos un patron de fecha numérico con el año mes y día
        df = new SimpleDateFormat("yyyyMMdd");

        // luego convertimos ambas fechas la actual y la fecha de nacimiento
        // en enteros que contiene el año mes y día
        int desde = Integer.parseInt(df.format(fechaNacimiento));
        int hasta = Integer.parseInt(df.format(actual));

        // luego restamos ambas fechas y dividimos en 10000 para quitar decimales y
        // dejar la fecha en decenas o centenas
        int edad = (hasta - desde) / 10000;
        System.out.println("La edad es: " + edad);
    }
}
