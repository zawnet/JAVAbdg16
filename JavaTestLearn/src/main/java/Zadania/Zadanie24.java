package Zadania;

/**
 * Napisz program, który wykorzystujc rekurencj, policzy n-t potg liczby 2
 * Przykad
 * Wejcie n = 5
 * Wyjcie 32
 */

public class Zadanie24 {
    public static void main(String[] args) {
        System.out.println(dwoToPowerR(5));
    }

    private static int dwoToPowerR(int n){
        if(n==0)
            return 1;
        else
            return 2*dwoToPowerR(n-1);
    }
}
