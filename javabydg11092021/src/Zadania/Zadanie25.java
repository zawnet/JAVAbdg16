package Zadania;

import java.util.Arrays;

/**
 * Zaimplementuj algorytm sortowania przez wstawianie
 */

public class Zadanie25 {
    public static void main(String[] args) {
        int a[] = {54,26,93,17,77,31,44,55,20};

        System.out.printf(Arrays.toString(insertSortForFor(a)));
    }

    private static int[] insertSort(int a[]){
        int n = a.length;
        int j,v;
        for(int i = 1; i<n; i++) {
           j=i;
           v=a[i];
           while (j > 0 && a[j-1] > v){
               a[j] = a[j-1];
               j = j-1;
           }
           a[j] =v;
        }
        return a;
    }

    private static int[] insertSortForFor(int a[]){
        int n = a.length;  //długość tablicy a
        int v;  //wstawiany elemetnt
        int j;  //index w drugiej pętli;

        for (int i = 1; i<n; i++){              //Zaczynamy od drugiego elementu zakladajac ze pierwszy jest posrotowany
            v=a[i];                             //wybieramy element ktory bedziemy wstawiac na miejsce elementu od niego mniejszego
            for(j=i; j>0; j--){                 //sprawdzamy po kolei wartosci indeksow po lewej stronie od i
                if(v<a[j-1]){                   //jeżeli nasz element wstawaiany jest mniejszy niż ktoroys z elementows po lewej stronie od indexu i
                    a[j] = a[j-1];              //to nalezy wstawic namiejsce tam gdzie jest v wartosc a[j-j]
                    a[j-1] = v;
                }else {                         //jeżeli napotkamy element większy to zatrzymujemy pętle
                    break;
                }
            }
        }
        return a;

    }
}
