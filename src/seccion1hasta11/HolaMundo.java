package seccion1hasta11;

import java.util.Locale;

public class HolaMundo {
    public static void main(String[] args) {

        String saludar ="Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar = " + saludar.toUpperCase());
        
        int numero = 11;
        System.out.println("numero = " + numero);
        boolean valor = true;
        if(valor){
            
        }
        
        var numero3 = 15;
        
        String nombre;

        nombre = "Iván";

        if(numero > 10){
            nombre = "Juan";
        }
        System.out.println("nombre = " + nombre);

        // Comentario Java

        /*
        Comentario en
        bloque
         */

        // Tipos de datos primitivos de valor entero
        // Tipo, nombre y bits
        byte a = 8;
        short b = 16;
        int c = 32;
        long d = 64l;

    }
}
