package seccion33archivos;

import seccion33archivos.service.ArchivoService;

public class EjemploCrearArchivo {
    public static void main(String[] args) {

        String nombreArchivo = "D:\\Cursos\\Java\\archivo\\java.txt";

        ArchivoService service = new ArchivoService();
        service.crearArchivo2(nombreArchivo);

    }
}
