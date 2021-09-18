package Zadania;

import java.util.Arrays;

/**
 * Zaimplementuj algorytm sortowania bąelkowego
 */

public class Zadanie26 {

    public static void main(String[] args) {
        int a[] = {54,26,93,17,77,31,44,55,20};

        System.out.println(Arrays.toString(bubbleSort(a)));
        System.out.println(Arrays.toString(bubbleSortForFor(a)));
    }

    /**
     * Implementacja algorytmu sortowania bąbelkowego dla tablicy liczb całkowitych
     * @param a Tablica do porostowania
     * @return Posortowana tablica
     */
    private static int[] bubbleSort(int a[]){
        int n = a.length;
        while (n>0) {
            //szukamy największego w tablicy elemetu i umieszczamy go na końcu tablicy
            for (int i = 0; i < n - 1; i++) {
                int tmp;
                if (a[i] > (tmp = a[i + 1])) {
                    a[i + 1] = a[i];
                    a[i] = tmp;
                }
            }
            //po wyznaczneiu największego elementu zaweżamy zakres szukania o n-1
            n--;
        }
        return a;
    }

    /**
     * Implementacja sortowania bąbelkowego przy ućzyciu dwóch pętli for
     * @param a
     * @return
     */
    private static int[] bubbleSortForFor(int a[]){

        for(int i = 0; i<a.length-1; i++){
            for(int j = 0; j< a.length-i - 1; j++){
                int tmp;
                if(a[j]>(tmp = a[j+1])){
                   a[j+1] = a[j];
                   a[j] = tmp;
               }
            }
        }
        return a;
    }

}
