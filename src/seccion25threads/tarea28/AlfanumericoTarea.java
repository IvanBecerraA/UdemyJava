package seccion25threads.tarea28;

import java.util.concurrent.TimeUnit;

public class AlfanumericoTarea implements Runnable {

    private Tipo tipo;

    public AlfanumericoTarea(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        try {
            switch (tipo) {
                case NUMERO -> {
                    for (int i = 0; i < 10; i++) {
                        System.out.println(i);
                        TimeUnit.SECONDS.sleep(1);
                    }
                }
                case LETRA -> {
                    for (char c = 'A'; c <= 'Z'; c++) {
                        System.out.println(c);
                        TimeUnit.SECONDS.sleep(1);
                    }
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
