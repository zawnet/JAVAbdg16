public class Samochod {
    //Atrybuty klasy
    private String typ;
    public String marka;
    public String model;
    public Integer przebieg;
    public Boolean stan;
    private Integer predkosc;
    int rocznik;

    public Samochod(String marka,String model,Integer przebieg,Boolean stan,Integer predkosc,int rocznik) {
        this.typ = typ;
        this.marka = marka;
        this.model = model;
        this.przebieg = przebieg;
        this.stan = stan;
        this.predkosc = predkosc;
        this.rocznik = rocznik;

    }
    public Samochod(int rocznik, String marka){
        this.rocznik = rocznik;
        this.marka = marka;
    }

    public Samochod(){

    }

    public void przyspiesz(int predkosc){

    }

    //Metoda klasy
    public String getInfo(){
        String info = "Marka samochodu: " + this.marka + "\n";
        info += "Model samochodu: "+ this.model;
        return info;
    }

    public static void main(String[] args) {
        Samochod samochod = new Samochod();
        samochod.marka = "Fiat";
        samochod.model = "Tipo";
        samochod.predkosc = 150;
        samochod.przebieg = 200000;
        samochod.stan = true;

        System.out.println(samochod.getInfo());

        Samochod samochod2 = new Samochod(2015,"skoda");



    }
}
