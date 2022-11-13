package abstractizare;

public class Isoscel extends Triunghi{
    public Isoscel(Double lat1, Double lat3){
        super(lat1,lat1,lat3);
    }

    public Double perimetru(){
        return 2 * super.getLat1() + super.getLat3();
    }

    public Double aria(){
        double semiperimetru = (super.getLat1() + super.getLat1() + this.getLat3()) / 2;

        return Math.sqrt(semiperimetru*(semiperimetru - super.getLat1())
                *(semiperimetru  - super.getLat1())
                *(semiperimetru - this.getLat3()));
    }

    @Override
    public String toString() {
        return "Triunghi Isoscel: " + "latura1,2 = " + super.getLat1()
                + ", latura 3: " + super.getLat3();
    }
}
