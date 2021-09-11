package Macierze;

import java.util.Arrays;

public class Macierz {
    public static void main(String[] args) {

        int b[][] = {{3, 1}, {2, 1}, {1, 0}};
        int a[][] = {{1, 0, 2}, {-1, 3, 1}};
        int c[][] = mnozenieMacierzy(a,b); //Wywołanie statycznej metoty mnożącej dwie macierze
        for (int i = 0; i < c.length; i++) {
            System.out.println(Arrays.toString(c[i]));
        }
    }
    //Funkcja mnoży dwie podane w parametrze macierze a i b i zwraca pomnozona macierz c
    public static int[][] mnozenieMacierzy(int a[][], int b[][])
    {
        //macierz c [wiersze macierzy a][kolumny macierzy b]
        int c[][] = new int[a.length][b[0].length];
        //sprawszamy czy ilosc kolumn w a jest rowna ilosci wierszy w b
        if (a[0].length == b.length) {
            for (int i = 0; i < c.length; i++) { //wiersze macierzy c
                for (int j = 0; j < c[0].length; j++) { //kolumny macierzy c
                    int suma = 0;
                    for (int k = 0; k < a[i].length; k++) {
                        suma += a[i][k] * b[k][j];
                    }
                    c[i][j] = suma; //zapisujemy w c[i][j] wynik sumy mnozenia
                }
            }
        } else {
            new IllegalArgumentException("Błędnie zdefiniowane macierze");
        }
        return c;
    }
}
