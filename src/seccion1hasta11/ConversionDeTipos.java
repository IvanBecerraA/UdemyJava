package seccion1hasta11;

public class ConversionDeTipos {
    public static void main(String[] args) {

        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        
        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);
        
        // int a String
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        // int a String con valueOf
        otroNumeroStr = String.valueOf(otroNumeroInt + 10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456f);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = 32768;
        short s = (short)i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char c = (char)i;
        System.out.println("c = " + c);
        float f = (float) i;
        System.out.println("f = " + f);
    }
}
