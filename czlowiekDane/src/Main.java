import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj imię, wiek w latach oraz wzrost w metrach");
        String imie = myObj.nextLine();
        int wiek = myObj.nextInt();
        double wzrost = myObj.nextDouble();
        System.out.print("Imię: "+ imie + " Wiek: "+ wiek + " Wzrotst: "+ wzrost );

    }
}
