package seccion19poo.tarea24;

abstract public class Felino extends Mamifero{

    protected Float tamanoGarras;
    protected Integer velocidad;

    public Felino(String habitad, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public Float getTamanoGarras() {
        return tamanoGarras;
    }

    public Integer getVelocidad() {
        return velocidad;
    }
}
