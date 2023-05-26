import java.util.Locale;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Iván";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Iván\") = " + nombre.equals("Iván"));
        System.out.println("nombre.equals(\"iván\") = " + nombre.equals("iván"));
        System.out.println("nombre.equalsIgnoreCase(\"ivÁN\") = " + nombre.equalsIgnoreCase("ivÁN"));
        System.out.println("nombre.compareTo(\"Iván\") = " + nombre.compareTo("Iván"));
        System.out.println("nombre.compareTo(\"Iván\") = " + nombre.compareTo("Iváan"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(2));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(3));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,3) = " + nombre.substring(1,3));
        System.out.println("nombre = " + nombre.substring(nombre.length()-1));
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains(\"ab\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));
        System.out.println("  trabalenguas  ");
        System.out.println("  trabalenguas  ".trim());

    }
}
