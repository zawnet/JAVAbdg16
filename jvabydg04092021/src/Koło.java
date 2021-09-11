public class Koło {

    private double promien;

    public Koło(double promien) {
        this.promien = promien;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public double obliczPole(){
        return Math.PI*Math.pow(promien,2);
    }

    public double obliczObwod(){
        return 2*(Math.PI*promien);
    }
}
