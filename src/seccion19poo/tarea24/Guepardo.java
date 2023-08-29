package seccion19poo.tarea24;

public class Guepardo extends Felino{

    public Guepardo(String habitad, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo come un elefante y ahora pesa " + peso;
    }

    @Override
    public String dormir() {
        return "El gueapardo se va a dormir en " + habitad;
    }

    @Override
    public String correr() {
        return "El guapardo corre y salta a una altura superior que su tamaño de " + altura;
    }

    @Override
    public String comunicarse() {
        return "El guepardo se comunica con toda su manada de " + nombreCientifico;
    }

    @Override
    public String toString() {
        return "Guepardo{" +
                "tamanoGarras=" + tamanoGarras +
                ", velocidad=" + velocidad +
                ", habitad='" + habitad + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
