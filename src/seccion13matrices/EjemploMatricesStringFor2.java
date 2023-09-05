package seccion13matrices;

public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {

        String[][] nombres = { {"Pepe", "Pepa"}, {"Josefa", "Paco"}, {"Lucas", "Pancha"} };

        for (String[] row : nombres) {
            for (String nombre : row) {
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }

    }
}
