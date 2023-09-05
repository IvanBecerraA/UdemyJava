package seccion24colecciones.set;

import seccion24colecciones.modelo.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        Set<Alumno> sa = new HashSet<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andrés", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 2));

        System.out.println(sa);

        System.out.println();
        System.out.println("Iterando usando un foreach");
        for (Alumno a : sa) {
            System.out.println(a);
        }

        System.out.println();
        System.out.println("Iterando usando while e iterator");
        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()) {
            Alumno a = it.next();
            System.out.println(a);
        }

        System.out.println();
        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);

    }
}
