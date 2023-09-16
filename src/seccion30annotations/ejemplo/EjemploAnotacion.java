package seccion30annotations.ejemplo;

import seccion30annotations.ejemplo.models.Producto;
import seccion30annotations.ejemplo.procesador.JsonSerializador;

import java.time.LocalDate;

public class EjemploAnotacion {
    public static void main(String[] args) {

        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("Mesa centro ROBLE");
        p.setPrecio(1000L);


        System.out.println("json = " + JsonSerializador.convertirJson(p));
    }
}
