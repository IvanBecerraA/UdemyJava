package seccion21hasta22genericos.terea26;

import seccion21hasta22genericos.terea26.models.*;

public class Main {
    public static void main(String[] args) {

        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> bolsaLimpiezas = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> bolsaNoPerecibles = new BolsaSupermercado<>();

        bolsaFrutas.addProducto(new Fruta("Platano", 1400.00, 1.000, "Amarillo"));
        bolsaFrutas.addProducto(new Fruta("Manzana", 1300.00, 1.000, "Rojo"));
        bolsaFrutas.addProducto(new Fruta("Naranja", 1500.00, 1.000, "Naranja"));
        bolsaFrutas.addProducto(new Fruta("Zandía", 3000.00, 5.000, "Verde"));
        bolsaFrutas.addProducto(new Fruta("Frutilla", 1700.00, 1.000, "Rojo"));

        bolsaLacteos.addProducto(new Lacteo("Yogur", 150.00, 1, 1));
        bolsaLacteos.addProducto(new Lacteo("Crema de Leche caja", 800.00, 200, 4));
        bolsaLacteos.addProducto(new Lacteo("Yogur", 150.00, 1, 1));
        bolsaLacteos.addProducto(new Lacteo("Yogur", 150.00, 1, 1));
        bolsaLacteos.addProducto(new Lacteo("Yogur", 150.00, 1, 1));

        bolsaLimpiezas.addProducto(new Limpieza("Cif", 1690.00, "antibacterial", 0.75));
        bolsaLimpiezas.addProducto(new Limpieza("lavaloza", 1.2, "Quix", 2290));
        bolsaLimpiezas.addProducto(new Limpieza("cloro", 0.95, "Limpiador Crema", 1390));
        bolsaLimpiezas.addProducto(new Limpieza("Gel con Lavandinca", 0.45, "Lysoform", 1380));
        bolsaLimpiezas.addProducto(new Limpieza("Desinfectante Lavanda", 0.9, "Lysol", 1330));

        bolsaNoPerecibles.addProducto(new NoPerecible( "Atún Lomitos en Agua Angelmo", 960.00, 170, 95));
        bolsaNoPerecibles.addProducto(new NoPerecible( "Jurel Natural Lata", 1120.00, 425, 560));
        bolsaNoPerecibles.addProducto(new NoPerecible( "Porotos Negros Listos Para Servir Caja", 1030.00, 380, 234));
        bolsaNoPerecibles.addProducto(new NoPerecible( "Arroz Grano Largo Ancho Grado 1", 1320.00, 1000, 3340));
        bolsaNoPerecibles.addProducto(new NoPerecible( "Porotos Hallado Bolsa", 1990.00, 1000, 3536));

        System.out.println("     ===== Fruta =====");
        for (Fruta fruta : bolsaFrutas.getProductos()) {
            System.out.println(fruta.getNombre() + " precio: " + fruta.getPrecio() + ", peso: " + fruta.getPeso() + ", color: " + fruta.getColor());
        }

        System.out.println();
        System.out.println("     ===== Lacteo =====");
        for (Lacteo lacteo : bolsaLacteos.getProductos()) {
            System.out.println(lacteo.getNombre() + " precio: " + lacteo.getPrecio() + ", cantidad: " + lacteo.getCantidad() + ", proteinas: " + lacteo.getProteinas());
        }

        System.out.println();
        System.out.println("     ===== Limpieza =====");
        for (Limpieza limpieza : bolsaLimpiezas.getProductos()) {
            System.out.println(limpieza.getNombre() + " precio: " + limpieza.getPrecio() + ", componentes: " + limpieza.getComponentes() + ", litros: " + limpieza.getLitros());
        }

        System.out.println();
        System.out.println("     ===== No Pereceble =====");
        for (NoPerecible noPerecible : bolsaNoPerecibles.getProductos()) {
            System.out.println(noPerecible.getNombre() + " precio: " + noPerecible.getPrecio() + ", contenido: " + noPerecible.getContenido() + ", calorias: " + noPerecible.getCalorias());
        }

    }
}
