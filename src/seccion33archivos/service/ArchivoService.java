package seccion33archivos.service;

import java.io.*;
import java.util.Scanner;

public class ArchivoService {

    public void crearArchivo(String nombre) {
        File archivo = new File(nombre);
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))) {
            buffer.append("Hola que tal\n")
                    .append("Todo bien? yo acá escribiendo un archivo\n")
                    .append("Hasta la próxima\n");
            //buffer.close();
            System.out.println("El archivo se ha creado con éxito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void crearArchivo2(String nombre) {
        File archivo = new File(nombre);
        try (PrintWriter print = new PrintWriter(new FileWriter(archivo, true))) {
            print.println("Hola que tal");
            print.println("Todo bien? yo acá escribiendo un archivo");
            print.printf("Hasta la próxima %s", "Iván");
            //buffer.close();
            System.out.println("El archivo se ha creado con éxito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String leerArchivo(String nombre) {
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            String linea;
            while ( (linea = reader.readLine()) !=null) {
                sb.append(linea).append("\n");
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    public String leerArchivo2(String nombre) {
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try (Scanner sc = new Scanner(archivo)){
            sc.useDelimiter("\n");
            while (sc.hasNext()) {
                sb.append(sc.next()).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }


}
