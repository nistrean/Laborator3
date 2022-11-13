package polimorfism;

public class Main {
    public static void main(String[] args) {
        Studii s = new Gimnaziu();
        System.out.println("Studii: " + s.getNume() + ", durata: " + s.durata());
        s = new Liceu();
        System.out.println("Studii: " + s.getNume() + ", durata: " + s.durata());
        s = new Licenta();
        System.out.println("Studii: " + s.getNume() + ", durata: " + s.durata());
    }
}
