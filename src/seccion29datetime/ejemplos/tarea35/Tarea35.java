package seccion29datetime.ejemplos.tarea35;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Tarea35 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento con formato: yyyy-MM-dd");
        String fecha = sc.next();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate fechaDate = LocalDate.parse(fecha);
            LocalDate fechaActual = LocalDate.now();
            Period edad = Period.between(fechaDate, fechaActual);
            System.out.printf("Desde su fecha de nacimiento: %s a la fecha Actual: %s, usted tiene %d años, %d meses y %d días",
                    fechaDate.format(df), fechaActual.format(df), edad.getYears(), edad.getMonths(), edad.getDays());
        } catch ( DateTimeParseException e) {
            System.err.println("Error: " + e);
            System.exit(0);
        }


    }
}
