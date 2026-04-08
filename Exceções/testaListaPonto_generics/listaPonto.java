import java.util.ArrayList;
public class listaPonto{
    private ArrayList <Ponto2D> pontos;  // container de Pontos
    public listaPonto( int N ){
        pontos =new ArrayList<>();
    }
    public void adiciona(Ponto2D p){
        pontos.add(p);
    }
    public int quantidade(){
       return pontos.size();
    }
    public Ponto2D getPonto(int i){
        return null;
    } 
    public boolean contains(Ponto2D p){
        return pontos.contains(p);
    }
    public boolean contains2(Ponto2D p){
        // percorre todos os elementos da coleção
        for (Ponto2D e : this.pontos)
            if (e.equals(p))
                return true;
        return false;
    }

}
