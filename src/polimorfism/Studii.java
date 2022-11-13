package polimorfism;

public class Studii {
    private String nume;

    public Studii(String nume){
        this.nume = nume;
    }

    public String getNume(){
        return this.nume;
    }

    public String durata(){
        return "Durata nedeterminata";
    }
}
