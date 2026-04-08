public class FiguraGeometrica {
   private String cor;
   public FiguraGeometrica(String cor){ this.cor = cor; }
   public boolean equals(Object o){ 
      FiguraGeometrica fg = (FiguraGeometrica) o;
      return this.cor.equals(fg.cor); 
   }
   public void desenhar(){
      System.out.println("Desenha uma figura geometrica ???");
   }

}
