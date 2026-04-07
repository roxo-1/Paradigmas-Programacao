// javac teste_ponto3d.java Ponto2D.java Ponto3D.java

public class teste_ponto3d{
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

    static void test_equals_tostring_2D(){

        Ponto2D p = new Ponto2D(10,20);

        test_assert(p.equals(new Ponto2D(10,20)) == true, "Erro na verificacao de igualdade (10,20) == (10,20");
        test_assert(p.equals(new Ponto2D(1,20)) == false, "Erro na verificacao de igualdade (10,20) != (1,20");
        test_assert(p.equals(new Ponto2D(10,1)) == false, "Erro na verificacao de igualdade (10,20) != (10,1");

        test_assert("(10.0,20.0)".equals(p.toString())== true, "Erro na verificacao do metodo toString, esperado \"(10.0,20.0)\"");
       
    }
    static void test_equals_tostring_3D() {

        Ponto2D p = new Ponto3D(10,20,30);

        test_assert(p.equals(new Ponto3D(10,20,30)) == true, "Erro na verificacao de igualdade (10,20,30) == (10,20,30)");
        test_assert(p.equals(new Ponto3D(1,20,30)) == false, "Erro na verificacao de igualdade (10,20,30) != (1,20,30");
        test_assert(p.equals(new Ponto3D(10,2,30)) == false, "Erro na verificacao de igualdade (10,20,30) != (10,2,30");
        test_assert(p.equals(new Ponto3D(10,20,3)) == false, "Erro na verificacao de igualdade (10,20,30) != (10,20,3");


        test_assert("(10.0,20.0,30.0)".equals(p.toString()) == true, "Erro na verificacao do metodo toString, esperao \"(10.0,20.0,30.0)\"");
    }

    static void test_distance_3D() {

        // TODO: implemente aqui o teste para o calcula da distancia utilizando Ponto3D


    }
    public static void main(String[] args) {

        System.out.println("Executando testes ...");
        System.out.println("================\n");

        test_equals_tostring_2D();
        System.out.println("test_equals_tostring_2D [PASS]\n");

        test_equals_tostring_3D();
        System.out.println("test_equals_tostring_3D [PASS]\n");

        // test_distance_3D();
        // System.out.println("test_distance_3D [PASS]\n");

        System.out.println("================");
        System.out.println("TODOS TESTES PASS");
    }
}