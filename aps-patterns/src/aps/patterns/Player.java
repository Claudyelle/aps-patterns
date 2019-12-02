package aps.patterns;

import states.*;

public class Player {
    
    private State state;
    private int life;
    
    public Player(){
        this.state = new Normal();
    }
    
    public void sofrerDano(int dano){
        this.life -= dano;
        if(life <= 25)
            state = new Ferido();
        else
            state = new Normal();
    }
    
    public void estado(){
        state.mover();
        state.atirar();
    }
        
}
