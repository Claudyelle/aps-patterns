package main;

import aps.patterns.*;


public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.setObservador(new Tela());
        player.estado();
        player.sofrerDano(80);
        player.estado();
    }
    
}
