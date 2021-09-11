public class Main {

    private static void While(){
        int i = 0;
        while (i<5)
        {
            System.out.println(i);
            i++;
        }
    }
    private static void DoWhile(){
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i<5);
    }

    private static void For(){
        for(int i=1; i<=10; i++)
        {
            System.out.println(i);
        }
    }

    //W for w warunku moga sie znales tylko dwa ;
    private static void ForDuzaMniejsza(){
        int i,b;
        for(i=0,b=1;i<20; i=i+1, b=b+1) {
            System.out.printf("PĘTLA DUŻA, index i=%d\n",i);
            if(b==5){
                System.out.printf("PETLA MNIEJSZA, index b=%d\n",b);
                b=1;
            }
        }
    }

    private static void ForAfterFor(){
        for (int i=1; i<=20;i++)
            System.out.println(i*i);
        for (int i=1;i<=20;i++)
            System.out.println(i*i*i);
    }

    private static void Silnia(){
        int i;
        int n=3;
        int silnia=1;
        for (i=1;i<=n;i++){
            silnia = silnia*i;

        }
        System.out.println(silnia);
    }

    private static void Suma(){
        int i;
        int n=5;
        int suma=1;
        for (i=1;i<=n;i++){
            suma = suma+i;

        }
        System.out.println(suma);
    }
    //Warunki fora sa poza petla
    public static void For2(){
        int i = 0;
        for (;i<5;){
            System.out.println("PĘTLA");
            i=i+1;
        }
    }

    public static void ForBreake(){
        for (int i=0;i<10;i++){
            if(i==4){
                break;
            }
            System.out.println(i);
        }
    }
    public static void ForBreakeContinue(){
        for (int i=0;i<10;i++){
            if(i==4){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void WhileBreak(){
        int i = 0;
        while (i<10){
            System.out.println(i);
            i++;
            if(i==4){
                break;
            }
        }
    }
    //Wyswietla liczby nieparzyste z danego zakresu
    private static void ForIf(){
        for (int i = 0;i<=20;i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }

    public static void TablicaCars(){
        String[] auta = {"Volvo", "BMW", "Ford","Mazda"};
        auta[1] = "Opel";
        System.out.println(auta.length);
    }

    public static void TablicaLiczby(){
        int[] liczby = {10, 20, 30,40};
        liczby[0] = 50;
        System.out.println(liczby.length);
    }
    public static void TablicaWyswietlCars(){
        String[] auta = {"Volvo", "BMW", "Ford","Mazda"};
        auta[1] = "Opel";
        for(int i= auta.length;i<auta.length;i++) {
            System.out.println(auta[i]);
        }
    }

    public static void TablicaWyswietlLiczby(){
        int[] liczby = {10, 20, 30,40};
        liczby[0] = 50;
        for(int i = liczby.length - 2; i<liczby.length;i++) {
            System.out.println(liczby[i]);
        }
    }
//Auta for - ech
    public static void TablicaForEachCars(){
        String[] auta = {"Volvo", "BMW", "Ford","Mazda"};
        auta[1] = "Opel";
        for(String i : auta) {
            System.out.println(i);
        }
    }

    private static void Tablica2x(){
        int[][] liczby = {{1,2,3,4},{5,6,7}};
        int x = liczby[1][2];
        for (int i = 0;i<liczby.length;++i){
            for (int j = 0;j<liczby[i].length;++j){
                System.out.println(liczby[i][j]);
            }
        }

    }

    enum Level{
        LOW,
        MEDIUM,
        HIGH
    }
    enum DniTygondia {
        PONIEDZIALEK,
        WTOREK,
        SRODA,
        CZWARTEK,
        PIATEK,
        SOBOTA,
        NIEDZIELA
    }

    public static void main(String[] args) {

        Level myVal = Level.MEDIUM;
        System.out.println(myVal);
        Tablica2x();
        TablicaForEachCars();
        TablicaWyswietlCars();
        TablicaWyswietlLiczby();
        //TablicaCars();
        //TablicaLiczby();
        //DoWhile();
        //ForDuzaMniejsza();
       // ForAfterFor();
        //Silnia();
        //ForBreakeContinue();
        //WhileBreak();
        //ForIf();
    }
}
