public class Reta extends FiguraGeometrica{
    private double comprimento;
    public Reta(String cor,double comprimento){
        // invoca o construtor da classe Figura
        super(cor); 	 
        this.comprimento = comprimento;
    }
    public boolean equals(FiguraGeometrica o) {
          Reta r = (Reta) o;
          return  super.equals(o) &&
                  r.comprimento == this.comprimento;
    }
    public void desenhar(){
       System.out.println("---------------------");
    }
}

