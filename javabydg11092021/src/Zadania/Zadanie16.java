package Zadania;

/**
 * Napisz program, który oblicza sum cyfr liczby wprowadzonej przez uytkownika.
 * Przykad:
 * Podaj liczb: 25
 * Spodziewany rezultat dziaania programu:
 * Suma cyfr liczby 25 to 7
 * Napisz program, który zlicza ilo
 */
public class Zadanie16 {
    public static void main(String[] args) {
        System.out.println(sumDecimalDigits(25));
    }

    private static int sumDecimalDigits(int n){
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

}
