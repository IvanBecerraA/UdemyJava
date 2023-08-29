package seccion1hasta11;

public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        
        String archivo = "alguna_imagen.jpge";


        System.out.println("archivo.lastIndexOf(\".\") = " + archivo.lastIndexOf("."));
        System.out.println("archivo.substring(archivo.lastIndexOf(\".\") + 1) = " + archivo.substring(archivo.lastIndexOf(".") + 1));
    }
}
