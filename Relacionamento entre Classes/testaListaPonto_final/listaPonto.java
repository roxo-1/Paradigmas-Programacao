public class listaPonto{
    private Ponto2D pontos[];  // container de Pontos
    private int qtd;
    public listaPonto( int N ){
        this.pontos =new Ponto2D[N];
        this.qtd = 0;
    }
    public int quantidade(){
        return this.qtd;
    }
    public void adiciona(Ponto2D p){
        // adiciona e atualiza o qtd
        this.pontos[qtd++] = p;
    } 
    public Ponto2D getPonto(int i){
        if( i>=0 && i < this.qtd )
            return pontos[i];

        return null;
        
    } 

 




}
