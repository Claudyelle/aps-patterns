package conquistas;

public abstract class Conquista {
    
    private Conquista proximo;

    public void setProximo(Conquista proximo) {
        this.proximo = proximo;
    }
        
    public abstract boolean busca();
     
    public void buscarChain(){
        if(busca()){
            System.out.println("Conquistado!");
        }if(proximo != null){
             proximo.buscarChain();
        }
    }
}
