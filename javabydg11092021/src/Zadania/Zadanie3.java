package Zadania;

import java.util.Scanner;

/**
 *Napisz program, który konwertuje liczb z postaci dziesitnej do postaci szesnastkowej. Liczb wprowadzamy z klawiatury.
 * Przykad:
 * Wprowad liczb w postaci dziesitnej: 15
 * Posta szesnastkowa liczby dziesitnej 15 to F
 */
public class Zadanie3 {
    public static void main(String[] args) {
        System.out.println("Wprowad liczb w postaci dziesitnej: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Postać szesnastkowa liczby dziesitnej "+n+" to "+decimalToHexConventer(n));
    }

    private static String decimalToHexConventer(int n){
        String result = "";
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                            'A', 'B', 'C', 'D', 'E', 'F'};

        while (n!=0){
            int r = n%16;
            n /=16;
             result = hexDigits[r] + result;
        }
        return result;
    }
}
