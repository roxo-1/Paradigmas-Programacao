public class Quadrado  extends Retangulo {
   public Quadrado(String cor, double lado){
      super(cor);
      this.lado = lado;
   }
   @Override
   public void desenhar() {
      System.out.println("Desenhando um quadrado na cor " + super.cor + " no (" + this.lado + ", " + this.lado + ")");
   } 
}