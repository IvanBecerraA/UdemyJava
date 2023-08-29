package seccion19poo.tarea24;

public class Tigre extends Felino{

    private String especieTigre;

    public Tigre(String habitad, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad, String especieTigre) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "El tigre " + especieTigre + ", corre a " + velocidad + ", para ir a comer";
    }

    @Override
    public String dormir() {
        return "El tigre va a dormir en " + habitad;
    }

    @Override
    public String correr() {
        return "El tigre corre a " + velocidad;
    }

    @Override
    public String comunicarse() {
        return "El tigre se comunica con la manada de " + especieTigre;
    }

    @Override
    public String toString() {
        return "Tigre{" +
                "especieTigre='" + especieTigre + '\'' +
                ", tamanoGarras=" + tamanoGarras +
                ", velocidad=" + velocidad +
                ", habitad='" + habitad + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
