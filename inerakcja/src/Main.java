import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName;
        String samopoczucie;
        System.out.println("Jak masz na imie:");
        userName = myObj.nextLine();
        System.out.println(userName+" to fajne imie ");
        System.out.println("Powiedz "+userName+ "jak się czujesz ?");
        samopoczucie = myObj.nextLine();
        System.out.println("Twoje sampoczucie to: "+samopoczucie);

    }
}
