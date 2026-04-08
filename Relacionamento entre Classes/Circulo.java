// Classe A (Circulo)
public class Circulo{
   // atributos para definir o circulo
   private double raio;
   private Ponto2D centro;
   // associacao por agregacao
   public Circulo(double raio, Ponto2D centro){
      this.raio = raio;
      this.centro = centro;
   }
   // associacaoo por composicao
   public Circulo(double raio, double x, double y){
      this.raio = raio;
      this.centro = new Ponto2D(x,y);
   }

   // funcao que verifica se um Ponto2D está contido no Circulo
   public boolean contains(Ponto2D p){
      return this.centro.distance(p) <= this.raio;
   }
}