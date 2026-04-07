// Classe A (Circulo)
public class Circulo extends Ponto2D{
   // atributos para definir o circulo
   private double raio;
   // associacaoo por composicao
   public Circulo( double raio, double x, double y){
      super(x, y);
      this.raio = raio;
   }
   // funcao que verifica se um Ponto2D está contido no Circulo
   public boolean contains( Ponto2D p){
      // centro passado de forma implicita
      // p passado de forma explicita
      return distance(p) <= raio;
   }

}