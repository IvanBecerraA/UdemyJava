package seccion25threads.tarea28;

public class Tarea28Main {
    public static void main(String[] args) {

        AlfanumericoTarea a1 = new AlfanumericoTarea(Tipo.NUMERO);
        AlfanumericoTarea a2 = new AlfanumericoTarea(Tipo.LETRA);

        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(a2);

        t1.start();
        t2.start();

    }
}
