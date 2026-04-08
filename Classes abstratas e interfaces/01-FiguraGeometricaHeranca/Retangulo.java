public class Retangulo extends FiguraGeometrica {
   private double base;
   private double altura;
   public Retangulo(String cor, double base, double altura){
      // invoca construtor da classe FiguraGeometrica 	
      super(cor); 
      this.base = base;
      this.altura = altura;
   }
   @Override
   public boolean equals(Object o) {
      Retangulo r = (Retangulo) o;
      return super.equals(o) && this.base==r.base && 
             this.altura== r.altura;
   }
   public double area() {
        return this.base * this.altura;  
   }
}

