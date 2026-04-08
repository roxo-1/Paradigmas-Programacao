// javac -g teste_lista_ponto.java Ponto2D.java listaPonto.java

public class teste_lista_ponto{
    public static void main(String[] args) {
        listaPonto lista = new listaPonto(2);
        lista.adiciona(new Ponto2D(10,10));
        lista.adiciona(new Ponto2D(10,10));
        //lista.adiciona(new Ponto2D(10,10)); // o que acontece aqui ?
        System.out.println("Fim de programa!");
    }
}