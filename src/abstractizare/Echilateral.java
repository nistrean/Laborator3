package abstractizare;

public class Echilateral extends Triunghi{
    public Echilateral(Double lat1){
        super(lat1, lat1, lat1);
    }

    public Double perimetru(){
        return 3 * super.getLat1();
    }

    public Double aria(){
        return ((super.getLat1() * super.getLat1()) * Math.sqrt(3)) / 4;
    }

    @Override
    public String toString() {
        return "Triunghi Echilateral: " + "latura = " + super.getLat1();
    }
}
