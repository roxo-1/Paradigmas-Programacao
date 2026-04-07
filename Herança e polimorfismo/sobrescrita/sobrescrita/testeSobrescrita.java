// javac testeSobrescrita.java A.java B.java
// java testeSobrescrita
import java.util.Scanner;

public class testeSobrescrita {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        A variavelReferenciaA; // variavelReferenciaA eh uma variavel de referencia da classe A
        
        System.out.print("digite um 1 - Classe A e 2 - Classe B:");
        int opc = ler.nextInt();
        if( opc  == 1)
            variavelReferenciaA = new A();
        else // opc == 2
            variavelReferenciaA = new B();
        
        System.out.println("saida:"+variavelReferenciaA.calcula());
        if( variavelReferenciaA  instanceof B )
            System.out.println("saida2:"+((B)variavelReferenciaA).metodoB());
    }
}
