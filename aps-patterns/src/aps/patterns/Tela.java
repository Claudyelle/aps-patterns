package aps.patterns;
 
public class Tela implements Observador{

    @Override
    public void notifica(int life) {
        System.out.println("Cuidado! Jogador ferido! Vida: " + life);
    }
    
}
