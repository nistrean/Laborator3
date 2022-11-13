package abstractizare;

public abstract class Triunghi {
    private Double lat1;
    private Double lat2;
    private Double lat3;

    public Triunghi(Double lat1, Double lat2, Double lat3){
        this.lat1 = lat1;
        this.lat2 = lat2;
        this.lat3 = lat3;
    }

    public abstract Double perimetru();

    public abstract Double aria();

    public Double getLat1() {
        return lat1;
    }

    public void setLat1(Double lat1) {
        this.lat1 = lat1;
    }

    public Double getLat2() {
        return lat2;
    }

    public void setLat2(Double lat2) {
        this.lat2 = lat2;
    }

    public Double getLat3() {
        return lat3;
    }

    public void setLat3(Double lat3) {
        this.lat3 = lat3;
    }

    @Override
    public String toString() {
        return "Triunghi: " +
                "latura1 = " + lat1 +
                ", latura2 = " + lat2 +
                ", latura3 = " + lat3;
    }
}
