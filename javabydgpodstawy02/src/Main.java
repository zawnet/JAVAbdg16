import javax.swing.*;
import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Main {
    int wiek = 18;
    public static void main1(String[] args) {
        int a = 15;
        int b =-5;
        a += b;
        System.out.println(a);
        a =+b;
        System.out.println(a);
        a=-b;
        System.out.println(a);
    }

    public static void main2(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a>=0 && a<=9){
            if(a==1){
                System.out.println("jest to najniższa liczba nieparzysta");
            }
            else if (a==2){
                System.out.println("jest to najniższa liczba parzysta");
            }
            else {
                System.out.println("Liczba mieści sie  w podanym zakresie");
            }
        }
        else {
            System.out.println("Podałeś nieprawidłowe wartości");
        }
    }

    public static void main3(String[] args) {

        int[] tablica = new int[10];

        for (int i = 0; i<tablica.length;i++){
            tablica[i] = 0;
        }

        for (int i = 0; i<tablica.length;i++){
            //tablica[i] = 37 + i;
            //System.out.println(tablica[i]);
        }
        for (int i = 0; i<tablica.length;i++){

            tablica[i] = 37 + i;

            System.out.println(tablica[i]);
            i++;
        }
        for (int i = 0; i<tablica.length;i++){
            //tablica[i] = 37 + i;
            System.out.println(tablica[i]);
            ///i++;
        }
    }

    public static void main4(String[] args) {
        int[] a = {-5,-4,-3,-2,-1,0,1,2,3,4,5};
        for(int i = 0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if((a[i] + a[j]) == 3){
                    System.out.printf("(%d, %d)", a[i], a[j]);
                }
            }
        }
    }


    public static void main5(String[] args) {

        Scanner myObj = new Scanner(System.in);
        String userName;
        System.out.println("Podaj swoje imię: ");
        userName = myObj.nextLine();
        System.out.println(userName+" to fajne imie");

        //metoda nestLine() służy do odczytu pełnego wiersza
    }

    public static void mojaMetoda(String imie){
        System.out.println(imie + " Nowak");
    }
    public static int mojaMetoda2(int x){
        return x+2;
    }

    public static int mojaMetoda3(int x, int y){
        return x+y;
    }
    static void checkAge(int Age){
        if(Age<18){
            System.out.println("Brak dostęu - jeśeś zbyt młody/młoda");
        }
        else {
            System.out.println("Dostęp udzielony - jesteś dorosły/dorosła!");
        }
    }
    static void mojaMetoda(String imie, int wiek){
        System.out.println(imie+" ma "+wiek+" lat ");
    }
    static int plusMethod(int x, int y){
        return x+y;
    }
    static double plusMethod(double x, double y){
        return x+y;
    }

    public static int sum(int k){
        if(k>0){
            return k+sum(k-1);
        }else{
            return 0;
        }
    }

    public static int silniar(int k){
        if(k<1){
            return 1;
        }
        else{
            return k * silniar(k-1);
        }
    }

    public static int sum(int start, int end){
        if(end>start){
            return end + sum(start,end-1);
        } else {
            return end;
        }
    }

    public static void main6(String[] args) {
        mojaMetoda("Jan");
        mojaMetoda("Maria");
        mojaMetoda("Emilka");
        mojaMetoda("Bartek");
        int suma = mojaMetoda3(40,60);
        System.out.println(suma);

        checkAge(20);
        mojaMetoda("Paweł",37);

        int myNum1 = plusMethod(8,5);
        double myNum2 = plusMethod(4.3,6.26);

        System.out.println("int: "+myNum1);
        System.out.println("double: "+myNum2);
        System.out.println(sum(5));
        System.out.println(silniar(1));
        int restult = sum(5,10);
        System.out.println(restult);

    }

    int sumaLiczb(int a, int b, int c){
        return a+b+c;
    }

    double sumaLiczb(int a){
        return 0;
    }

    static String sprawdzPogode(float temp, float cisnienie, float wiatr){
        if (temp>=15.0 && (cisnienie >= 980.0 && cisnienie <=1020.0) && wiatr<=15.0){
            return "ładna";
        }
        else {
            return "brzydka";
        }

    }

    static void czyNaPlaze(String podogaInfo){
        if(podogaInfo == "ładna"){
            System.out.println("Pogoda jest ładna, idź na plażę");
        }
        else {
            System.out.println("Pogoda nie jest ładna, lepiej zostań w domu");
        }
    }
    //prog stypendium socajelnego 1500 brutto na
    static boolean stypendiumSocjalneKryterium(String imie, String nazwisko, int rokStudiow,double dochodNaCzlonkaRodziny  ){

        if((dochodNaCzlonkaRodziny <= 1500 && sprawdzMiejsceSocajalne(rokStudiow)))
            return true;
        else
            return  false;
    }



    static boolean sprawdzMiejsceSocajalne(int rok)
    {
        for (int i = 0; i<5; i++)
        {
            if(Drugi.tabSoocalne[rok][i] == true){
                System.out.println(Drugi.tabSoocalne[rok][i]);
                Drugi.tabSoocalne[rok][i] = false;
                return true;

            }
            else {
                continue;
            }

        }
        return false;
    }


    public static void main7(String[] args) {

    }

}

