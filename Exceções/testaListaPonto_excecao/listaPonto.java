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
        if(i>qtd || i<0){
            throw new IndexOutOfBoundsException("Não dá");
        }
        return pontos[i];
    } 
    public boolean equals(Object obj){
        Ponto2D outro = (Ponto2D) obj;
        return Double.compare(this.x, outro.getX()) == 0 && Double.compare(this.y, outro.getY()) == 0;   
    }

    public int busca(Ponto2D p){
        for(int i = 0; i<qtd; i++){
            if(pontos.getPonto(i).equals(p)){
                return i;
            }
        }
        return -1;
    }

    public Ponto2D remove(int i){
        if(i>qtd || i<0){
            throw new IndexOutOfBoundsException("Não dá");
        }
       return pontos.remove(i);
    }


}
