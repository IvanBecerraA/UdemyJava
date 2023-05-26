import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double precio1, precio2, impuesto;

        System.out.println("Ingrese el nombre de la factura o descripción");
        String factura = scanner.nextLine();

        System.out.println("Ingrese el primer precio");
        precio1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo precio");
        precio2 = scanner.nextDouble();
        impuesto = (precio1 + precio2) * 0.19;

        System.out.println("La factura " + factura + " tiene un total bruto de: " + (precio1+precio2) + "\n" +
                "con un impuesto de: " + impuesto + "\n" +
                "y el monto después de impuesto es de: " + ((precio1+precio2) + impuesto));
    }
}
