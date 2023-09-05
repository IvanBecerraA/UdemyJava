package seccion21hasta22genericos.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T> implements Iterable<T>{

    private List<T> objeto;
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objeto = new ArrayList<>();
    }

    public void add(T objeto) {
        if(this.objeto.size() <= max) {
            this.objeto.add(objeto);
        } else {
            throw new RuntimeException("no hay más espacio");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.objeto.iterator();
    }
}
