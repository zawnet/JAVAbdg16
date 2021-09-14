package Zadania;

/**
 * Zaimplementuj algorytm sortowania przez wstawianie
 */

public class Zadanie25 {
    public static void main(String[] args) {
        int a[] = {54,26,93,17,77,31,44,55,20};

        insertSort()
    }

    private static int[] insertSort(int a[]){
        int n = a.length-1;
        for(int i = 1; i<n; i++)
        {
            int insertelement = a[i];
            int j = i-1;
            while (j>0 && a[j]>insertelement){
                    int tmp = a[j];
                    a[i]=a[j];
                    a[j] = insertelement;


            }
        }
        return a;
    }
}
