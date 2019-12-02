package main;

import aps.patterns.*;
import conquistas.*;


public class Main {

    public static void main(String[] args) {
        Player player1 = new Player();       
        player1.setObservador(new Tela());
        player1.estado();
        player1.sofrerDano(80);        
        player1.estado();
        player1.headshot();        
        
        BaixoDano chain = new BaixoDano(player1.getLife());        
        Conquista firstBlood = new FirstBlood();
        Conquista bestScore = new BestScore(player1.getScore());
        
        chain.setProximo(firstBlood);
        firstBlood.setProximo(bestScore);
        
        chain.buscarChain();
    }
    
}
