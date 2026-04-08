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
    
    // Calcular distância Euclidiana
    public double distance(Ponto2D outro){
        return Math.sqrt(Math.pow((this.x - outro.x),2)+Math.pow((this.y - outro.y),2));
    }
    public boolean equals(Object obj){
        Ponto2D outro = (Ponto2D) obj;
        return Double.compare(this.x, outro.getX()) == 0 && Double.compare(this.y, outro.getY()) == 0;   
    }
    public String toString() {
        // O teste exige "(10.0,20.0)" -> Sem espaços!
        return "(" + this.x + "," + this.y + ")";
    }
       
}

