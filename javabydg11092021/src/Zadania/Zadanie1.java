package Zadania;
/*
Napisz program, który konwertuje liczb z postaci dziesitnej do postaci binarnej. Liczb wprowadzamy z klawiatury.
Przykad:
Wprowad liczb w postaci dziesitnej: 5
Posta binarna liczby dziesitnej 5 to 101
 */

import java.security.SecureRandom;
import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //System.out.println(intToBinary(n));
        //System.out.println(intToOctal(n));
       System.out.println(intToBinaryV2(n));
        //System.out.println(binatyToInt(1100));
       // System.out.println(convertBinarytoDecimical(n));
       // System.out.println(binatyToInt(n));
        //System.out.println(convertDecimalToOctal(n));
        //System.out.println(intToOctal(n));
    }

    public static int intToBinary(int n)
    {
        String s = "";
        while (n > 0)
        {
            s =  ( (n % 2 ) == 0 ? "0" : "1") +s;
            n = n / 2;
        }
        return Integer.parseInt(s);
    }
/*
Napisz program, który konwertuje liczb z postaci dziesitnej do postaci ósemkowej. Liczb wprowadzamy z klawiatury.
Przykad:
Wprowad liczb w postaci dziesitnej: 15
Posta ósemkowa liczby dziesitnej 15 to 17
 */
    public static int intToOctal(int n)
    {
        String s = "";
        while (n > 0)
        {
            s =  ( (n % 8 ) == 0 ? n : n % 8) +s;
            n = n / 8;
        }
        return Integer.parseInt(s);
    }


    private static int convertOctalToDecimal(int n){
        int liczba = 0;
        int potega = 0;
        while (n != 0){
            int r = n % 8;
            liczba = liczba + r*(int)Math.pow(2,potega++);
            n /=8;
        }

        return liczba;
    }

    public  static long intToBinaryV2(int n){
        int byteNumber = 0;
        int r=0;
        long liczba = 0;
        while ((n!=0)){
            r = n%2;
            n /=2;
            liczba += Math.pow(10,byteNumber)*r;
            byteNumber++;
        }
        //System.out.println(pow);

        return liczba;
    }
    public static String intToHex(int n){
        return "";
    }

    public static int binatyToInt(int n){
        String binary = String.valueOf(n);
        System.out.println(binary);
        int liczba = 0;
        int potega = 0;
        for (int i = binary.length()-1; i>=0; i--){
            int value = Character.getNumericValue(binary.charAt(i));
            liczba  = liczba + value * (int)Math.pow(2,potega++);
        }
        return liczba;
    }

    private static int convertBinarytoDecimical(int number){
        //liczba  = 0
        //potega = 0
        //1010
        //1010 mod 10 = 101 r 0
        //liczba = liczba + r * 2^potega = 0
        //potega = potega + 1;
        //1010 -> 101

        int liczba = 0;
        int potega = 0;
        while (number != 0){
            int r = number % 10;
            liczba = liczba + r*(int)Math.pow(2,potega++);
            number /=10;
        }

        return liczba;

    }
}
