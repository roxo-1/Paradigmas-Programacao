public abstract class FiguraGeometrica {
   private String cor;
   public FiguraGeometrica(String cor){ this.cor = cor; }
   public boolean equals(Object o){ 
        FiguraGeometrica fg = (FiguraGeometrica) o;
        return this.cor.equals(fg.cor); 
   }
   // assinatura dos metodos abstratos
   public abstract double area(); 
   public abstract double perimetro();
   public abstract void desenhar();
}
