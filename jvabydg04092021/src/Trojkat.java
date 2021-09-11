public class Trojkat {
    private double podstawa;
    private double a;
    private double b;
    private double c;

    private double wysokosc;

    public Trojkat(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Trojkat(){
        this.a = 3;
        this.b = 4;
        this.c = 5;
    }


    public double getPodstawa() {
        return podstawa;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public void setPodstawa(double podstawa) {
        this.podstawa = podstawa;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }



    public double obliczPole(){
        double p = obliczObwod()/2;
        return Math.sqrt((p*(p-a)*(p-b)*(p-c)));
    }
    public double obliczObwod(){
        return a+b+c;
    }

}
