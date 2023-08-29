package seccion1hasta11;

import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Ivan", "Sophia", "Amelia", "Estephania", "Pato", "Pepa", "Bea", "Pepe"};

        for (int i = 0; i < nombres.length; i++) {

            if (nombres[i].equalsIgnoreCase("pato") || nombres[i].toLowerCase().contains("pepa".toLowerCase())) {
                continue;
            }
            System.out.println(i + ".- " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Pato\"");

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)) {
                JOptionPane.showMessageDialog(null,"El nombre es " + nombres[i]);
                break;
            }
        }

    }
}
