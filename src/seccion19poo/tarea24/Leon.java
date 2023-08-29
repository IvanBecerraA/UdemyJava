package seccion19poo.tarea24;

public class Leon extends Felino{

    private Integer numManada;
    private Float potenciaRugidoDecibel;

    public Leon(String habitad, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad, Integer numManada, Float potenciaRugidoDecibel) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public Integer getNumManada() {
        return numManada;
    }

    public Float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El León caza junto a su grupo de " + numManada + " individuos en las llanuras africanas";
    }

    @Override
    public String dormir() {
        return "El león se estira y alcanza un largo de " + largo + " y se duerme";
    }

    @Override
    public String correr() {
        return "El león corre rápido y pesa " + peso;
    }

    @Override
    public String comunicarse() {
        return "El león se comunica con un rugido de " + potenciaRugidoDecibel + " decibeles";
    }

    @Override
    public String toString() {
        return "Leon{" +
                "numManada=" + numManada +
                ", potenciaRugidoDecibel=" + potenciaRugidoDecibel +
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
