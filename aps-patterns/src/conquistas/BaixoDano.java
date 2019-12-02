package conquistas;

public class BaixoDano extends Conquista{
    
    private int life;
    
    public BaixoDano(int life){
        this.life = life;
    }
    
    @Override
    public boolean busca() {
        System.out.println(" - Baixo dano?");
        return life > 80;
    }
    
}
