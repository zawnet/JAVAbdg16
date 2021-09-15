package Zadania;

import java.util.Arrays;

/**
 * Zaimplementuj algorytm sortowania bąelkowego
 */

public class Zadanie26 {

    public static void main(String[] args) {
        int a[] = {54,26,93,17,77,31,44,55,20};

        System.out.println(Arrays.toString(bubbleSort(a)));
    }

    private static int[] bubbleSort(int a[]){
        int n = a.length;


        while (n>0) {
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int tmp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = tmp;
                }
            }
            n--;
        }
        return a;
    }

}
