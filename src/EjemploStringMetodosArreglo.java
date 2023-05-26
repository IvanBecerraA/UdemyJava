public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
        }

        System.out.println();
        System.out.println("trabalenguas = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");

        for (int j = 0; j < arreglo2.length; j++){
            System.out.print(arreglo2[j]);
        }

        System.out.println();
        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("\\."); // [.]
        for (int i = 0; i < archivoArr.length; i++) {
            System.out.print(archivoArr[i]);
        }
        System.out.println("extension = " + archivoArr[archivoArr.length - 1]);
        
    }
}
