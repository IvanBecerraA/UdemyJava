package seccion33archivos;

import seccion33archivos.service.ArchivoService;

public class EjemploLeerArchivo {
    public static void main(String[] args) {

        String nombreArchivo = "D:\\Cursos\\Java\\archivo\\java.txt";
        ArchivoService service = new ArchivoService();

        System.out.println(service.leerArchivo2(nombreArchivo));



    }
}
