package abstractizare;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //abstractizare cu interfata
        Par n1 = new Par();
        System.out.println(n1.isPar(42));
        System.out.println(n1.isPar(15));

        //abstractizare cu class abstract
        Triunghi d = new Dreptunghic(3.0,4.0,5.0);
        Triunghi e = new Echilateral(6.0);
        Triunghi i = new Isoscel(4.0,5.0);

        List<Triunghi> list = List.of(d, e, i);
        for(Triunghi t:list) {
            System.out.println(t);
            System.out.println(t.perimetru());
            System.out.println(t.aria());
            System.out.println("---------------");
        }
    }
}
