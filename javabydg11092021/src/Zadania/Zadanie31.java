package Zadania;

import java.util.Arrays;

/**
 * Zaimplementuj algorytm sortowania przez scalanie
 */

public class Zadanie31 {
    private static int tmp[];

    public static void main(String[] args) {
        int a[] = {54,26,93,17,77,31,44,55,20};
        tmp = new int[a.length];


        mergeSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    private static void mergeSort(int a[], int l, int p){

        if(p<=l) {
            //System.out.println();
            return; //jezeli prawa strona jest rowna lub mniejsza lewej to zakoncz dzielenie
        }
        int s=(l+p)/2;

        mergeSort(a, l,s);
        mergeSort(a,s+1,p);
        mergeArray(a,l,s,p);
       // System.out.println("Lewy -> "+l + " Prawy -> "+p);



    }

   private static void mergeArray(int a[],int l, int s, int p){
       int i,j,q;
       for (i=l; i<=p; i++){
           tmp[i]=a[i];  // Skopiowanie danych do tablicy pomocniczej
       }
       i=l; j=s+1; q=l;                 // Ustawienie wskaźników tablic
       while (i<=s && j<=p) {           // Przenoszenie danych z sortowaniem ze zbiorów pomocniczych do tablicy głównej
           if (tmp[i]<tmp[j]) {
               a[q++] = tmp[i++];
           }
           else {
               a[q++] = tmp[j++];
           }
       }
       while (i<=s){
           a[q++]=tmp[i++]; // Przeniesienie nie skopiowanych danych ze zbioru pierwszego w przypadku, gdy drugi zbiór się skończył
       }
   }


}
