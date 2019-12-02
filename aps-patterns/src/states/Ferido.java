package states;

public class Ferido implements State {

    @Override
    public void atirar() {
        System.out.println("Atira com dificuldade.");
    }

    @Override
    public void mover() {
        System.out.println("Anda bem devagar.");
    }
    
}
