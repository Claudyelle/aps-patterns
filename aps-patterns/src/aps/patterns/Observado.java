package aps.patterns;

import java.util.ArrayList;
import java.util.List;

public abstract class Observado {
    
    protected List<Observador> observadores = new ArrayList<>();

    public void setObservador(Observador obs) {
        observadores.add(obs);
    }
    
    protected abstract void notificaTodos();
}
