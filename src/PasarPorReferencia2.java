class Persona {
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public String getNombre(){
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Iván");


        System.out.println("iniciamos el método main");
        System.out.println("persona.nombre = " + persona.getNombre());
        System.out.println("Antes de llamar al método test ");

        test(persona);
        System.out.println("Después de llamar al método test");
        System.out.println("persona.nombre = " + persona.getNombre());
        System.out.println("Finaliza el método main con los datos del arreglo modificados");

    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el método test");
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza el método test");
    }
}
