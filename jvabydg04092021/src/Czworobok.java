public class Czworobok {
    private double bokA, bokB, bokC, bokD;

    public Czworobok(double bokA, double bokB, double bokC, double bokD) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
        this.bokD = bokD;
    }

    public double obliczObwod(){
        return this.bokA + this.bokB + this.bokC + this.bokD;
    }
}
