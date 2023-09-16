package seccion32patrones.observer;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositotio extends Observable {
    private List<String> repositorio = new ArrayList<>();
    public void crearUsuario(String usuario) {
        repositorio.add(usuario);
        notifyObversers(usuario);
    }
}
