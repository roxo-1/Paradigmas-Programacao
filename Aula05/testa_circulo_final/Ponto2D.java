public class Ponto2D {
    private double x,y;
    // inicializa um ponto alocado dinamicamente e iniciliza os campos do ponto
    public Ponto2D(){
        this.x = 0;
        this.y = 0;
    }
    public Ponto2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    // Retornar os valores das componentes x 
    public double getX(){
        return this.x;
    }
    // Retornar os valores das componentes y
    public double getY(){
        return this.y;
    }
    //Somar dois pontos e obtem um terceiro;
    public Ponto2D add(Ponto2D outro){

        return new Ponto2D(this.x + outro.x,this.y+outro.y);
    }
    // Multiplicar ambas as coordenadas de um ponto 
    public Ponto2D scale(double s){
        
        return null;
    
    }
    //Calcular o coeficiente angular de uma reta que passe pelos dois pontos
    public double gradient(Ponto2D outro){

        return 0.0;
    
    }
    // Calcular distância Euclidiana
    public double distance(Ponto2D outro){
        return Math.sqrt(Math.pow((this.x - outro.x),2)+Math.pow((this.y - outro.y),2));

    }
    
}

