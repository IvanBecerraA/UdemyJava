package seccion25threads.ejemplosync;

import seccion25threads.ejemplosync.runnable.Consumidor;
import seccion25threads.ejemplosync.runnable.Panadero;

public class EjemploProductorConsumidor {
    public static void main(String[] args) {

        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();

    }
}
