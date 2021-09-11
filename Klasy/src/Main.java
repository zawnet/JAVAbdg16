public class Main {
    int wiek;
    int waga;
    public Main(){
        wiek = 5;
    }

    public Main(int wiek){
        this.wiek = wiek;
    }


    static void myStaticMethod(){
        System.out.println("Metoda statyczna");
    }
    public void myPublicMethod(){
        System.out.println("Metoda publiczna");
    }
    public static void main(String[] args) {
        Main myObj = new Main(5);
       // myObj.wiek = 40;
        System.out.println(myObj.wiek);
        //System.out.println(myObj.waga);
        //myStaticMethod();
       //myObj.myPublicMethod();

    }
}
