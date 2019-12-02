package states;

public class Normal implements State{
    @Override
    public void atirar() {
        System.out.println("Atira normal.");
    }

    @Override
    public void mover() {
        System.out.println("Anda rápido.");
    }
}
