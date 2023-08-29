package seccion19poo.tarea24;

public class Lobo extends Canino{

    private Integer numCamada;
    private String especieLobo;

    public Lobo(String habitad, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanoColmillos, Integer numCamada, String especieLobo) {
        super(habitad, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public Integer getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El Lobo " + color + " come";
    }

    @Override
    public String dormir() {
        return "El lobo se va a dormir con " + numCamada + " integrantes de su camada";
    }

    @Override
    public String correr() {
        return "El lobo corre por " + habitad;
    }

    @Override
    public String comunicarse() {
        return "El lobo " + especieLobo + " se comunica";
    }

    @Override
    public String toString() {
        return "Lobo{" +
                "numCamada=" + numCamada +
                ", especieLobo='" + especieLobo + '\'' +
                ", color='" + color + '\'' +
                ", tamanoColmillos=" + tamanoColmillos +
                ", habitad='" + habitad + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
