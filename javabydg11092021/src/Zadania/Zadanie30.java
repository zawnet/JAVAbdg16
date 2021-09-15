package Zadania;

import java.util.Arrays;

/**
 * Zaimplementuj algorytm sortowania Quick Sort
 */
public class Zadanie30 {

    public static void main(String[] args) {
        int a[] = {54,26,93,17,77,31,44,55,20};

        System.out.println(Arrays.toString(quickSort(a,0,a.length-1)));
    }

    private static int[] quickSort(int a[], int l, int r){
        //if(r <= l) return a;

        int v = a[(l+r)/2]; //ustalamy element rodzielajacy na wyniku dzielania calkowitego dlugosic tablicy przez 2
        int i = l;
        int j = r;

        do{
            while ( (a[i] < v)) i++;
            while ( (a[j] > v)) j--;

            if(i<=j){
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++; j--;
            }
            else {
                break;
            }
        } while (i<=j);

        if(l<j) return quickSort(a,l,j);
        if(i<r) return quickSort(a,i,r);


        return a;
    }
}
