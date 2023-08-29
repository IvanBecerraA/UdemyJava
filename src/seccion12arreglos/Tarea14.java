package seccion12arreglos;

public class Tarea14 {
    public static void main(String[] args) {

        int[] arreglo = {14, 33, 15, 36, 78, 21, 43};
        
        int numMayor = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            numMayor = (arreglo[i] > numMayor) ? arreglo[i] : numMayor;
        }
        System.out.println("numMayor = " + numMayor);

    }
}
