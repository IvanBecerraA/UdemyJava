package seccion32patrones.composite.ejemplo;

import seccion32patrones.composite.Archivo;
import seccion32patrones.composite.Directorio;

public class EjemploCompositeBuscar {
    public static void main(String[] args) {

        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");

        java.addComponente(new Archivo("patron-composite.docx"));
        Directorio stream = new Directorio("Api Stream");
        stream.addComponente(new Archivo("stream-map.docx"));

        java.addComponente(stream);
        doc.addComponente(java);

        doc.addComponente(new Archivo("cv.docx"));
        doc.addComponente(new Archivo("logo.jpeg"));

        boolean encontrado = doc.buscar("patron-composite.docx");
        System.out.println("encontrado = " + encontrado);
        
        encontrado = doc.buscar("pi stream");
        System.out.println("encontrado \"pi stream\"= " + encontrado);
        
        encontrado = doc.buscar("cv.docx");
        System.out.println("encontrado \"cv.docx\"= " + encontrado);
        
        //System.out.println(doc.mostrar(0));

    }
}
