package abstractizare;

public class Par implements ParInterface {
    public String isPar(int x){
        if(x % 2 == 0){
            return x + " este numar par";
        }
        else
            return x + " nu este numar par";
    }
}
