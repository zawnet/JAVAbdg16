import org.xml.sax.InputSource;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    private static void ObwodProstokata() {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź dkugosc boku prostokata: ");
        int dlugoscBoku = input.nextInt();
        System.out.println("Wprowadź szerokosc boku prostokata: ");
        int szerokoscBoku = input.nextInt();
        long wynik = (2*dlugoscBoku) + (2*szerokoscBoku);
        System.out.printf("Obwód prostokoata o dkugosci = %d i szerokosci = %d wynosi: %d\n",dlugoscBoku, szerokoscBoku, wynik);


    }

    private static void PoleProstokata() {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź dkugosc boku prostokata: ");
        int dlugoscBoku = input.nextInt();
        System.out.println("Wprowadź szerokosc boku prostokata: ");
        int szerokoscBoku = input.nextInt();
        long wynik = dlugoscBoku * szerokoscBoku;
        System.out.printf("Pole prostokoata o dkugosci = %d i szerokosci = %d wynosi: %d\n",dlugoscBoku, szerokoscBoku, wynik);
    }
    private static void ProstokatInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź dkugosc boku prostokata: ");
        int dlugoscBoku = input.nextInt();
        System.out.println("Wprowadź szerokosc boku prostokata: ");
        int szerokoscBoku = input.nextInt();
        long wynik = dlugoscBoku * szerokoscBoku;
        System.out.printf("Pole prostokoata o dkugosci = %d i szerokosci = %d wynosi: %d\n",dlugoscBoku, szerokoscBoku, wynik);
    }
    private static final float PI = 3.14f;
    private static void OkregPole()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz długość promienia okręgu: ");
        int promienOkregu = input.nextInt();
        double wynik = PI*Math.pow(promienOkregu,2);
        double wynik2 = PI*(promienOkregu*promienOkregu);
        System.out.printf("Pole okregu o promieniu = %d, wynosi = %f\n", promienOkregu, wynik);
    }
    private static void OkregObwod()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz długość promienia okręgu: ");
        int promienOkregu = input.nextInt();
        double wynik = 2*PI*promienOkregu;
       // double wynik2 = PI*(promienOkregu*promienOkregu);
        System.out.printf("Obwod okregu o promieniu = %d, wynosi = %f\n", promienOkregu, wynik);
    }

    private static void ZamianaLiczb(){
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz liczbe a");
        int a = input.nextInt();
        System.out.println("Wprowadz liczbe b");
        int b = input.nextInt();
        int tmp = a;
        a = b;
        b = tmp;
        System.out.printf("Liczba a = %d liczba b = %d", a,b);
    }
    //oblicza wartosc wyraznienia (2*x*y)/(3*(z*z+1))
    private static void ObliczWyrazenie()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz wartosc x: ");
        int x = input.nextInt();
        System.out.println("Wprowadz wartosc y: ");
        int y = input.nextInt();
        System.out.println("Wprowadz wartosc z: ");
        int z = input.nextInt();

        double wynik = (double) (2*x*y) / (3*(z*z+1));
        System.out.printf("Wartość wyrażenia  wynosi: %f", wynik);
    }

    private static  void PoleTrojkata(){
        Scanner input =  new Scanner(System.in);
        System.out.println("Wprowadz długosć boku a: ");
        int a = input.nextInt();
        System.out.println("Wprowadz dlugosc boku b: ");
        int b = input.nextInt();
        System.out.println("Wprowadz dlugosc boku c: ");
        int c = input.nextInt();
        double p = (double) (a + b + c) / 2;
        double tr = ((p* (p-a) * (p-b) * (p-c)));
        double wynik = Math.sqrt(tr);
        System.out.printf("Wartość wyrażenia wynosi = %f",wynik);
    }

    public static void Waluty(){

        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz ilosc waluty: ");
        double kwotaWL = input.nextDouble();
        System.out.println("Podak kurs wymiany: ");
        float kurs = input.nextFloat();
        double kwotaPLN = kwotaWL * kurs;
        System.out.printf("Kwota po wymianie: %f.2", kwotaPLN);
    }

    public static void WalutyNBP(){
        /*
        try {

            URL url = new URL("http://www.nbp.pl/kursy/xml/LastA.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new InputSource(url.openStream()));
            doc.getDocumentElement().normalize();
        }catch ()
*/
        }

    public static void DataCzas(){
        LocalDate myObj = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        LocalDateTime myDataTime = LocalDateTime.now();
        System.out.println(myObj);
        System.out.println(myTime);
        System.out.println(myDataTime);

        DateTimeFormatter myFormatTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatedDateTime = myDataTime.format(myFormatTime);
        System.out.printf("Po sformatowanieu: %s",formatedDateTime );
    }

    public static void RownanieKwadratowe(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj parametr a: ");
        double a = input.nextDouble();
        System.out.println("Podaj parametr b:");
        double b = input.nextDouble();
        System.out.println("Podaj parametr c");
        double c = input.nextDouble();

        double delta = Math.pow(b,2) - 4 * (a*c);
        //Rowanie posiada 2 rozwiazania
        if(delta>0){
            double x1 = (-b - Math.sqrt(Math.pow(b,2)-4*a*c)) / 2*a;
            double x2 = (-b + Math.sqrt(Math.pow(b,2)-4*a*c)) / 2*a;
            System.out.printf("x1 = %f, x2 = %f", x1,x2);
        }
        //Rownanie posiada tylko jedno prozwiazanie
        else if (delta == 0){
            double x1 = -b / (2*a);
            System.out.printf("x1 = %f", x1);
        }
        else {
            System.out.println("Równanie nie posaida rozwiązań");
        }
    }

    public static void main(String[] args) {
        RownanieKwadratowe();
        //DataCzas();
        //Waluty();
        //PoleTrojkata();
        //metoda Math.max zwraca najwieksza wartosc w podamym przedziale
        //System.out.println(Math.max(5,10)); //10

        //metoda Math.min zwraca najmniejsza wartosc w podanym przedziale
        //System.out.println(Math.min(5,10)); //5

        //Metoda Math.sqrt zwraca pierwiastek kwadratowy z x
        //System.out.println(Math.sqrt(64));

        //Metoda Math.abs  zwraca wartosc bezwzgledna (dodatnia) liczby
        //System.out.println(Math.abs(-4.7)); //4.7

        //Math.random zwraca liczbe lsowa z przedzialu od 0.00 (włącznie) do 1.0 (wlacznie)
        //System.out.println(Math.random());

        //Math random  z przedzalu od 0 do 100
        //int randomNum = (int)(Math.random()*101);
        //System.out.println(randomNum);

        //przy uzyciu metody NextDown
        //double x1 = 1;
        //double x2 = 1000000;
        //double f = Math.random()/Math.nextDown(1.0);
        //double x = x1*(1.0 - f) + x2*f;
        //System.out.println(x);

        // PoleProstokata();
        // ObwodProstokata();

        //OkregPole();
        //OkregObwod();
        //ZamianaLiczb();
        //ObliczWyrazenie();
    }
}
