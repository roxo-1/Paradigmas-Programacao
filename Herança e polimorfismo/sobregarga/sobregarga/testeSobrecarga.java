
//javac testeSobrecarga.java A.java B.java
//java testeSobrecarga
public class testeSobrecarga {

    public static void main(String[] args) {
        A variavelReferenciaA = new A();
        B variavelReferenciaB = new B();
        
        // polimorfismo de sobregarga
        System.out.println(variavelReferenciaA.calcula()); // calcula() da classe A
        System.out.println(variavelReferenciaA.calcula(10));// calcula() da classe A
        
    }
}
