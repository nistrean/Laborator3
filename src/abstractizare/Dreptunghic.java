package abstractizare;

public class Dreptunghic extends Triunghi{
    public Dreptunghic(Double lat1,Double lat2,Double lat3){
        super(lat1,lat2,lat3);
    }

    public Double perimetru(){
        return super.getLat1() + super.getLat2() + super.getLat3();
    }

    public Double aria() {
        return (super.getLat1() + super.getLat2()) / 2;
    }

    @Override
    public String toString() {
        return "Triunghi Dreptunghic: " + "latura1 = " + this.getLat1() +
                ", latura2 = " + this.getLat2() +
                ", latura3 = " + this.getLat3();
    }
}
