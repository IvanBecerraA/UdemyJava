package seccion32patrones.decorator.decorador;

import seccion32patrones.decorator.Formateable;

public class ReversaDecorador extends TextoDecorador {

    public ReversaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuilder sb = new StringBuilder(texto.darFormato());
        return sb.reverse().toString();
    }
}
