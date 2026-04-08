// javac -g testa_figura_geometrica.java Retangulo.java FiguraGeometrica.java Reta.java

public class testa_figura_geometrica{
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

    static void test_figura_geometrica_abstrata() {
      
      Retangulo r1 = new Retangulo("azul",10,20);
      Retangulo r2 = new Retangulo("azul",10,21);

      test_assert(r1.equals(r2) == false,"Os retangulos sao diferentes");
      test_assert(r1.area() == 200.0,"Esperada o area do r1 igual a 200.0!");
      test_assert(r1.perimetro() == 60.0,"Esperada o perimetro do r1 igual a 60.0!");

       r1.desenhar();

       Reta reta1 = new Reta( "verde",10);
       reta1.desenhar();

    }


    public static void main(String[] args) {

        System.out.println("Executando testes ...");
        System.out.println("================\n");

        test_figura_geometrica_abstrata();
        System.out.println("test_figura_geometrica_abstrata [PASS]\n");


        System.out.println("================");
        System.out.println("TODOS TESTES PASS");
    }
}
