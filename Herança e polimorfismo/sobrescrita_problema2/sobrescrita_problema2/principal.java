// javac principal.java Classe1.java Classe2.java Classe3.java
// java principal
public class principal{
    public static void main(String[] args) {
    int Result=0;
    Classe1 Objs[] = new Classe1[3];
    Objs[0] = new Classe1();
    Objs[1] = new Classe2();
    Objs[2] = new Classe3();
    for (int i=0; i<3; i++)
        Result += Objs[i].Calcula();
    System.out.println( Result );
    }
}

