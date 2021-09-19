package Zadania;

import java.util.Arrays;

/**
 * Zaimplementuj algorytm sortowania Quick Sort
 */
public class Zadanie30 {

    public static void main(String[] args) {
        int a[] = {54,26,93,17,77,31,44,55,20};

        quickSort(a,0,a.length-1);

        System.out.println(Arrays.toString(a));
    }

    private static void quickSort(int a[], int l, int r){
        if(l>=r) return ;

        int v = a[(l+r)/2]; //ustalamy element rodzielajacy (pivot) na wyniku dzielania calkowitego dlugosic tablicy przez 2
        int i = l-1;
        int j = r+1;

        do{
            while ( (a[++i] < v)) ;    //dopoki lewa strona jest mniejsza od pivota przesuwaj wskaznik i do przodu
            while ( (a[--j] > v)) ;    //dopoki prawa strona jest wieksa od pivota przesuwaj wskaznik j do tyłu

                                        //po wykonaniu tych petli otrzymamy indeks po lewjej stronei z elementem wiekszym od pivota
                                        // po prawej stronie z elementem mniejszym od pivota
            if(i<=j){                   // jeżeli wzkańnik j
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
            else {
                break;              //jezeli po prawej stronie nie znalezmismy ani jednego elementu mnieszego od pivot to przerwij petle
            }
        } while (true);

        if(j>l)  quickSort(a,l,j); //jezeli wskaznij po prawej jest wiekszy od poczaktu to wywolaj na prametrach poczatek do to cojest po prawej
        if(i<r)  quickSort(a,i,r); //jezeli wskaznik po lewej jest mniejszy niz koniec to wywolaj na parametrahc to co jest po lewej do koniec

    }
}
