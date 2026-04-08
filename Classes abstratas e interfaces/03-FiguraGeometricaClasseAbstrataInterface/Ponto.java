public class Ponto extends FiguraGeometrica{
    public Ponto(String cor, double x, double y){
        super(cor);
        this.x = x;
        this.y = y;
    }
    @Override
    public void desenhar() {
        System.out.println("Desenhando um ponto na cor " + super.cor + " nas coordenadas (" + this.x + ", " + this.y + ")");
    }
}