package aps.patterns;

import states.*;

public class Player extends Observado {
    
    private State state;
    private int score = 0;

    public int getScore() {
        return score;
    }
    private int life = 100;

    public int getLife() {
        return life;
    }
    
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
    
    public void headshot(){
         score = 50;
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
