// javac -g teste_ponto2d.java Ponto2D.java
// executar debug
// jdb teste_ponto2d

// breakpoint
// stop in teste_ponto2d.main

// executar
// run 

// executa uma linha
// next

// entra em uma funcao
// step

// mostra variavel
// print <variavel>
//
// para sair
// quit
public class teste_ponto2d{
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
    // testa as operacoes
    // Inicialização - todo ponto deve ser inicializado com algum valor para x e y.
    // Testa tambem a operacao que retorna os valores das componentes x e y do ponto;
    static void test_new_get(){

        Ponto2D p = new Ponto2D(0,0);

        test_assert(p.getX() == 0, "Erro na inicializacao do atributo x");
        test_assert(p.getY() == 0, "Erro na inicializacao do atributo y");
        
        p = new Ponto2D(10,20);

        test_assert(p.getX() == 10, "Erro na inicializacao do atributo x");
        test_assert(p.getY() == 20, "Erro na inicializacao do atributo y");
    }
    // Testa a operacao
    // Somar dois pontos (e obter um terceiro);
    static void test_add() {

        Ponto2D a = new Ponto2D(10.5, 20);
        Ponto2D b = new Ponto2D(30, 40.3);
        Ponto2D c = a.add(b);
        

        test_assert(c != null, "Erro na alocacao do objeto Ponto2D c !");
        test_assert(c.getX() == 40.5, "Erro na soma: componente x!");
        test_assert(c.getY() == 60.3, "Erro na soma: componente x!");
    }
    // Testa a operacao
    // Multiplicar ambas as coordenadas de um ponto (recebendo um novo em troca) 
    // esta operacao equivale a mudanca de escala;
    static void test_scale() {

        Ponto2D a = new Ponto2D(10.5, 20);
        Ponto2D b = a.scale(2.5);

        test_assert(b != null, "Erro na alocacao do objeto Ponto2D b !");
        test_assert(b.getX() == 26.25, "Erro na escala: componente x!");
        test_assert(b.getY() == 50, "Erro na escala: componente y!");

        Ponto2D c = a.scale(0);
        test_assert(b.getX() == 0, "Erro na escala: componente x!");
        test_assert(b.getY() == 0, "Erro na escala: componente y!");

    }
    // Testa a operacao
    // Calcular o coeficiente angular de uma reta que passe pelos dois pontos;
    // https://www.todamateria.com.br/calculo-do-coeficiente-angular/
    static void test_coefAngular() {

        Ponto2D a = new Ponto2D(2,3);
        Ponto2D b = new Ponto2D(4,5);

        test_assert(a.gradient(b) == 1,"Erro na inclinacao da reta!r");

        a = new Ponto2D(2,3);
        b = new Ponto2D(4,4);

        test_assert(a.gradient(b) == 0.5,"Erro na inclinacao da reta!");
        
        test_assert(a.gradient(a) == 0, "Erro na inclinacao da reta!");

    }


    public static void main(String[] args) {

        System.out.println("Executando testes ...");
        System.out.println("================");

        test_new_get();
        System.out.println("test_new_get [PASS]\n");

        test_add();
        System.out.println("test_add [PASS]\n");

        test_scale();
        System.out.println("test_scale [PASS]\n");

        test_coefAngular();
        System.out.println("test_coefAngular [PASS]\n");

        System.out.println("================");
        System.out.println("TODOS TESTES PASS");
    }
}