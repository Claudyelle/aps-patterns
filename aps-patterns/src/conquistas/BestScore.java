package conquistas;

public class BestScore extends Conquista {
    
    private int score;
    
    public BestScore(int score){
        this.score = score;
    }
    
    @Override
    public boolean busca() {
         System.out.println(" - Melhor pontuação?");
         return score >= 50;
    }
    
}
