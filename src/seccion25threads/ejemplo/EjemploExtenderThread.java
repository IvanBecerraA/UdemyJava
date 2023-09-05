package seccion25threads.ejemplo;

import seccion25threads.ejemplo.threads.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {

        Thread hilo = new NombreThread("Jhon Doe");
        hilo.start();
        //Thread.sleep(100);

        Thread hilo2 = new NombreThread("Maria");
        hilo2.start();

        Thread hilo3 = new NombreThread("Pepe");
        hilo3.start();

        System.out.println(hilo.getState());
        System.out.println(hilo2.getState());
        System.out.println(hilo3.getState());

    }
}
