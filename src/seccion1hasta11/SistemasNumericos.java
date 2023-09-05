package seccion1hasta11;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 0;
        try {

        numeroDecimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero"));

        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un número entero \n error: " + e);
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);


        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "numero octal de = " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal);
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex = "numero hexadecimal de = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);


        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;
        JOptionPane.showMessageDialog(null, mensaje);

    }
}
