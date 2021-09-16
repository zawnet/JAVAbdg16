package Zadania;

import java.util.Arrays;

/**
 * Zaimplementuj algorytm sortowania przez scalanie
 */

public class Zadanie31 {

    public static void main(String[] args) {
        int a[] = {54,26,93,17,77,31,44,55,20};
        int tmp[] = new int[a.length];

        mergeSort(a,0,a.length-1);
    }

    private static void mergeSort(int a[], int l, int p){

        if(p<=l) {
            //System.out.println();
            return; //jezeli prawa strona jest rowna lub mniejsza lewej to zakoncz dzielenie
        }
        int s=(l+p)/2;

        mergeSort(a, l,s);
        mergeSort(a,s+1,p);

        System.out.println("Lewy -> "+l + " Prawy -> "+p);
        mergeArray(a,l,s,p);


    }

   private static void mergeArray(int a[],int l, int s, int p){
        int i = l;
        int j = s+1;
        int tmp[] = new int[p];

        for(i=l;i<p;i++){
            tmp[i] = a[i];
        }
        for(int k = l; k<=p; k++) {
            if(i<=s){
                if(j<=p){
                    if(tmp[j] <tmp[j++]){

                    }
                }
            }
        }
       System.out.println(Arrays.toString(tmp));
   }

}
