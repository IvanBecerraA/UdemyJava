import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PracticaEjercicios {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese fecha de nacimiento");
        String fechaN = scanner.next();

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        Date fechaN2 = formato.parse(fechaN);
        Date fechaA = new Date();
        
        formato = new SimpleDateFormat("yyyyMMdd");
        
        int desde1 = Integer.parseInt(formato.format(fechaN2));
        int hasta1 = Integer.parseInt(formato.format(fechaA));
        
        int edad1 = (hasta1 - desde1);

        System.out.println("edad1 = " + edad1);


        
        

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
