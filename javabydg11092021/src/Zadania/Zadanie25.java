package Zadania;

import java.util.Arrays;

/**
 * Zaimplementuj algorytm sortowania przez wstawianie
 */

public class Zadanie25 {
    public static void main(String[] args) {
        int a[] = {54,26,93,17,77,31,44,55,20};

        System.out.printf(Arrays.toString(insertSort(a)));
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
}
