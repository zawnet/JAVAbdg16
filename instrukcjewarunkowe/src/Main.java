import javax.sound.midi.Soundbank;
import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Main {

    private static void SprawdzWarunek(){
        int x = 20;
        int y = 18;
        if(x > y) {
            System.out.printf("%d jes wieksze niż %d", x, y);
        }
    }

    private static void Powitanie(){
        int hour = 7;
        if(hour < 20 && hour > 6)//{
            System.out.println("Dzień dobry");
       // }
        else//{
            System.out.println("Dobry wieczór");
        //}
    }
    //składnia :
    //zmienna = (warunek) ? wyrazeniePrawda : WyrazenieFałsz
    private static void PowitanieShort(){
        int time = 23;
        String result = (time < 20 && time > 6) ? "Dzień dobry" : "Dobry wieczór";
        System.out.println(result);
    }

    private static void Modul(){
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz liczbe x: ");
        int x = input.nextInt();
        int modul = (x>=0)?x:-x;
        System.out.printf("Moduł liczby to: %d",modul);
    }

    private static void Ocena(){
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz swoją ocene: ");
        int ocena = input.nextInt();
        String wynik = (ocena>2)?"Gratulacje!!!":"Powtarzasz egzamin";
        System.out.println(wynik);
    }

    private static void Ocena2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz swoją ocene: ");
        int ocena = input.nextInt();
        if(ocena >=1 && ocena <=6){
            if(ocena>1)
                System.out.println("Gratuluje zdanego egzaminu");
            else
                System.out.println("Przykro mi nie zdałeś");
        }
        else
            System.out.println("Nie ma takiej oceny");

        //String wynik = (ocena>2)?"Gratulacje!!!":"Powtarzasz egzamin";
        //System.out.println(wynik);
    }

    private static void ProgDoroslosci(){
        Scanner input = new Scanner(System.in);
        System.out.println("Proszę poda ile masz lat: ");
        int wiek = input.nextInt();
        String prog = (wiek>=18)?"Wchodzisz":"Przyjdz za rok";
        System.out.println(prog);
    }

    private static void SprawdzWiek(){
        LocalDate nowDate = LocalDate.now();
        LocalDate urDate;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj proszę swoją date urodzewnia w formacie rrrr-MM-dd ");
        String dataUr = input.next();
        urDate = LocalDate.parse(dataUr);
        //obliczenie roznicy pomiedzy dataurodzenia a dzisiejszym dniem
        long wiek = LocalDate.from(urDate).until(LocalDate.now(), ChronoUnit.YEARS);
        String prog = (wiek>=18)?"Wchodzisz":"Przyjdz za rok";
        System.out.println(prog);


    }
    private static void Switch(){
        int day = 4;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }

    private static void Switch2(){
        int day = 4;
        switch (day){
            case 6:
                System.out.println("Dzis jest sobota");
                break;
            case 7:
                System.out.println("Dzis jest niedziela");
                break;
            default:
                System.out.println("Czekam na weekend");
        }
    }

    private static void Switch3(){
        int day = 6;
        switch (day){
            case 1:
                System.out.println("Dzis jest poniedzialek");
                break;
            case 2:
                System.out.println("Dziś jest wtorek");
                break;
            case 3:
                System.out.println("Dziś jest środa");
                break;
            case 4:
                System.out.println("Dziś jest czwartek");
                break;
            case 5:
                System.out.println("Dziś jest piątek");
                break;
            default:
                System.out.println("Miłego weekendu !!!");
        }
    }

    public static void main(String[] args) {
      Switch3();
       // SprawdzWiek();
        //Modul();
      //Ocena2();
      //ProgDoroslosci();
        // SprawdzWarunek();
       //PowitanieShort();
    }
}
