package seccion12arreglos;

public class EjemploArreglosForOrdenamientoBurbuja {
    public static void main(String[] args) {

        

        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD", "Asus Notebook", "Macbook Air", "Chromecast", "Bicicleta"};
        int total = productos.length;

        sortBurbuja(productos);

        System.out.println("--- Usando for ---");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        Integer[] numeros = new Integer[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = (int)35L;
        numeros[3] = -1;

        sortBurbuja(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("i = " + i + " : " + numeros[i]);
        }



    }

    public static void arregloInverso(String[] arreglo) {
        int total = arreglo.length;
        int total2 = arreglo.length;
        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }

    public static void sortBurbuja(Object[] arreglo) {
        int total = arreglo.length;
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 -i ; j++) {
                if ( ((Comparable) arreglo[j+1]).compareTo(arreglo[j]) < 0 ) {
                    Object aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
    }
}
