package aps.patterns;

import states.*;

public class Player extends Observado {
    
    private State state;
    private int life = 100;
    
    public Player(){
        this.state = new Normal();
    }
    
    public void sofrerDano(int dano){
        this.life -= dano;
        if(life <= 25){
            state = new Ferido();
            notificaTodos();
        }else
            state = new Normal();
    }
    
    public void estado(){
        state.mover();
        state.atirar();
    }

    @Override
    public void notificaTodos() {
        observadores.forEach((obs) -> {
            obs.notifica(life);
        });
    }
        
}
