package seccion1hasta11;

public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 5.8f;

        // con una sola linea se puede sin llaves
        if (promedio >= 6.5)
            System.out.println("felicitaciones, excelente promedio!");
        else
            System.out.println("3");
        
        
        if (promedio >= 6.5) {
            System.out.println("felicitaciones, excelente promedio!");
        } else if (promedio >= 6.0){
            System.out.println("Muy buen promedio!");
        } else if (promedio >= 5.5) {
            System.out.println("Buena promedio");
        } else if (promedio >= 5) {
            System.out.println("Regular, necesitas esforzarte un poco más");
        } else if (promedio >= 4) {
            System.out.println("Insuficiente, necesitas estudiar más");
        } else {
            System.out.println("Reprobado");
        }

        System.out.println("promedio = " + promedio);

    }
}
