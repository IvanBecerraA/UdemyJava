package seccion21hasta22genericos.genericsclass;

public class EjemploGenericos {
    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Peregrino", "Caballo"));
        transporteCaballos.add(new Animal("Grillo", "Caballo"));
        transporteCaballos.add(new Animal("Tunquen", "Caballo"));
        transporteCaballos.add(new Animal("Tococalma", "Caballo"));
        transporteCaballos.add(new Animal("Longotoma", "Caballo"));
        imprimirCamion(transporteCaballos);

        Camion<Maquinaria> transporteMaquinaria = new Camion<>(3);
        transporteMaquinaria.add(new Maquinaria("Bulldozer"));
        transporteMaquinaria.add(new Maquinaria("Grúa Horquilla"));
        transporteMaquinaria.add(new Maquinaria("Perforadora"));
        imprimirCamion(transporteMaquinaria);

        Camion<Automovil> transporteAuto = new Camion<>(3);
        transporteAuto.add(new Automovil("Toyota"));
        transporteAuto.add(new Automovil("Mitsubishi"));
        transporteAuto.add(new Automovil("Chevrolet"));
        imprimirCamion(transporteAuto);


    }

    public static <T> void imprimirCamion(Camion<T> camion) {
        for (T a : camion) {
            if (a instanceof Animal) {
                System.out.println(((Animal)a).getNombre() + " tipo: " + ((Animal)a).getTipo());
            } else if (a instanceof Automovil) {
                System.out.println(((Automovil)a).getMarca());
            } else if (a instanceof Maquinaria) {
                System.out.println("tipo: " + ((Maquinaria)a).getTipo());
            }


        }
    }
}
