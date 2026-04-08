public class listaPonto{
    private Ponto2D pontos[];  // container de Pontos
    private int qtd;
    public listaPonto( int N ){
        pontos =new Ponto2D[N]; 
        qtd = 0;
    }
    public void adiciona(Ponto2D p){
        if (qtd >= pontos.length) { // detectar
            throw new IllegalStateException("Lista cheia"); // lançar
        }
        pontos[qtd++] = p;
    }
    public int quantidade(){
        return this.qtd;
    }
    public Ponto2D getPonto(int i){
        return null;
    } 


}
