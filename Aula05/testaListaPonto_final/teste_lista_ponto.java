// javac -g teste_lista_ponto.java Ponto2D.java listaPonto.java

public class teste_lista_ponto{
    static void test_assert(boolean expr, String msg) {
        if (!expr) {
            StackTraceElement[] stack = Thread.currentThread().getStackTrace();

            StackTraceElement caller = stack[2]; // quem chamou test_assert

            System.out.println(
                "[FALHA] " + msg +
                " em " + caller.getFileName() +
                ":" + caller.getLineNumber() +
                " metodo: " + caller.getMethodName()
            );
            System.exit(1); // PARA O TESTE SE FALHAR
        }

    }
    static void test_create_lista() {
        listaPonto pontos = new listaPonto(10);
        test_assert(pontos.quantidade() == 0,"Erro na verificacao da quantidade, deveria ter 0 pontos validos na container");
        pontos.adiciona(new Ponto2D(0,0));
        pontos.adiciona(new Ponto2D(10,10));
        pontos.adiciona(new Ponto2D(20,20));
        test_assert(pontos.quantidade() == 3,"Erro na verificacao da quantidade, deveria ter 3 pontos validos na container");

        test_assert(pontos.getPonto(3)==null,"Informado posicao invalida, deveria retornar null!");
        test_assert(pontos.getPonto(0)!=null,"Informado posicao valida, deveria retornar um Ponto2D!");
    }
    static void test_add_busca(){
        // escreva o testa para os metodos
        // public boolean adiciona(Ponto2D p, int i){....}
        // public int busca(Ponto2D p){....}


        

    }

    public static void main(String[] args) {

        System.out.println("Executando testes ...");
        System.out.println("================\n");

        test_create_lista();
        System.out.println("test_create_lista [PASS]\n");

        test_add_busca();
        System.out.println("test_add_busca [PASS]\n");


        System.out.println("================");
        System.out.println("TODOS TESTES PASS");
    }
}