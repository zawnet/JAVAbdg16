package Zadania;

import java.util.Scanner;

/**
 * Napisz program, który konwertuje liczb z postaci dziesitnej do postaci ósemkowej. Liczb wprowadzamy z klawiatury.
 * Przykad:
 * Wprowad liczb w postaci dziesitnej: 15
 * Posta ósemkowa liczby dziesitnej 15 to 17
 */
public class Zadanie2 {

    public static void main(String[] args) {
        System.out.println("Wprowad liczb w postaci dziesitnej: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Postać ósemkowa liczby dziesitnej "+n+" to "+convertDecimalToOctal(n));
    }

    private static int convertDecimalToOctal(int n){
        int liczba = 0;                             //reprezentuje liczbe w postaci osemkowej
        int wyst = 0;                               //przechowuje ilosc dzielen n/8

        while (n != 0){                             //1 krok wyst=0 r=15%8=7 n->15 2 n=15/8=1  liczba = 10^0 * 7 = 1*7 =7 wyst=1
                                                    //2 wyst=1 r=1%8=1  n->1/8=0 liczba = 7+10^1=7+10=17;
            int r = n % 8;                          //r - reszta z dzielenia aktualnej wartosci n przez 8 (n mod 8)
            //System.out.println(r);
            n /= 8;                                 //Dzielenie całkowiete  n / 8
            liczba += (Math.pow(10,wyst) * r);      //
            wyst++;
        }

        return liczba;
    }

}
