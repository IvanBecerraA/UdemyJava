public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzman";
        
        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + numeroA + numeroB);
        System.out.println(numeroA + numeroB + detalle);
        System.out.println(detalle + (numeroA + numeroB));
        
        String detalle2 = curso.concat(" " + profesor);
        String detalle3 = curso.concat(" con ".concat(profesor));
        String detalle4 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);
        System.out.println("detalle3 = " + detalle3);
        System.out.println("detalle4 = " + detalle4);

    }
}
