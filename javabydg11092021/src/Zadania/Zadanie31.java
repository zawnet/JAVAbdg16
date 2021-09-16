package Zadania;

import java.util.Arrays;

/**
 * @author Paweł Zawada (ZAWNET)
 * @serial 1
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
        mergeArray2(a,l,s,p);
       // System.out.println("Lewy -> "+l + " Prawy -> "+p);



    }

    /**
     * Implementacja scalania tabllicy przy użyciu petli while
     * @param a
     * @param l
     * @param s
     * @param p
     */
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

    /**
     * Implementacja scalania tablicy przy użyciu pętli for
     * @param a
     * @param l
     * @param s
     * @param p
     */
    private static void mergeArray2(int a[],int l, int s, int p) {
        //zapisujemy elemty od l do p do tablicy pomocniczej
        for(int k = l; k<=p;k++){
            tmp[k] = a[k];
        }
        int i = l, j= s+1;              //ustalamy wskanik i na pierwszy z lewej element, natomiast wsjaznik j na pierwszy za srodkiem element
        for(int k = l; k<=p; k++){      //wykonujemy petle od lewej strony (l) do prawej strony (p)
            if(i>s){                    //jeżeli wskaznik i jest za środnkiem znaczy że wskoczylismy na pierwszy posortowany element z prawejs strony
                a[k] = tmp[j++];        //wstawiamy na miejsce k w tablicy a ten pierwszy za srodkiem element przesuwajac wskaznij j w prawo
            }
            else if(j>p){               //jeżali wskaznik j jest za koncem to znaczy ze wskoczylismy na pierwszy posortowany element z lewej strony
                a[k] =tmp[i++];         //wstawiamy ma miejsce k w tablicy a ten element i przesywamy się z lewej strony o 1 w prawo
            }
            else if(tmp[j]<tmp[i]){     //jeżeli elemet z prawej strony jest mniejszy od tego z lewej wstaiwamy na miejsce k ten element i przesuwamy prawa strone w prawo
                a[k] = tmp[j++];
            }
            else {
                a[k] = tmp[i++];        //odwronie w przypadku gdy element po lewej stronie jest mniejszy wowczas wstawiamy go na miejsce k i przesywałmy lewą strone w prawo o 1
            }
        }
    }
}
