package seccion1hasta11;

public class SentenciaWhile {
    public static void main(String[] args) {


        int i = 0;

        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean prueba = true;

        while (prueba) {
            if (i == 7) {
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        prueba = true;
        i = 0;

        do {
            if( i == 10) {
                prueba = false;
            }
            System.out.println("se ejecuta al menos una vez");
            i++;
        } while (prueba);

        do {
            prueba = false;
        } while (prueba);

    }
}
