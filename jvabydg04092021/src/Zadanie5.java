/*
Zadanie 5
Napisz program, który w zadeklarowanej tablicy dwuwymiarowej 10×10 o nazwie macierz
umieszcza na przekątnej liczbę 1, a poza przekątną — 0
 */

import java.util.Arrays;

public class Zadanie5 {
    public static void main(String[] args) {
        int n, m;
        n = 10;
        m = 10;
        int macierz[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j || (j==((n-1)-i)))
                    macierz[i][j] = 1;
                else
                    macierz[i][j] = 0;
            }
            System.out.println(Arrays.toString(macierz[i]));
        }
    }


}
