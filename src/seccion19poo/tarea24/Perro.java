package seccion19poo.tarea24;

public class Perro extends Mamifero{

    private Integer fuerzaMordida;

    public Perro(String habitad, Float altura, Float largo, Float peso, String nombreCientifico, Integer fuerzaMordida) {
        super(habitad, altura, largo, peso, nombreCientifico);
        this.fuerzaMordida = fuerzaMordida;
    }

    public Integer getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro muerde con una fuerza de mordida de " + fuerzaMordida + " para moler su comida";
    }

    @Override
    public String dormir() {
        return "El perro " + nombreCientifico + " se pone a dormir";
    }

    @Override
    public String correr() {
        return "El perro se pone a correr";
    }

    @Override
    public String comunicarse() {
        return "El perro ladra";
    }

    @Override
    public String toString() {
        return "Perro{" +
                "fuerzaMordida=" + fuerzaMordida +
                ", habitad='" + habitad + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
