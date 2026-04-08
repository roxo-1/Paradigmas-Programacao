// javac -g teste_lista_ponto.java Ponto2D.java listaPonto.java

import java.io.FileReader;

public class teste_lista_ponto{
    public static void main(String[] args) {
        listaPonto lista = new listaPonto(2);
        try {
            lista.adiciona(new Ponto2D(10,10));
            lista.adiciona(new Ponto2D(10,10));
            lista.adiciona(new Ponto2D(10,10)); // o que acontece aqui ?
        } catch (IllegalStateException e) { // tratar
            System.out.println("Não foi possível adicionar: lista cheia");
        }
        System.out.println("Fim de programa!");

    }
}