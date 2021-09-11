import java.util.Arrays;

/*
Zadanie 6
Napisz program, który w zadeklarowanej tablicy dwuwymiarowej 10×10 o nazwie macierz umieszcza liczby
1 i 0 zgodnie z przedstawioną poniżej interpretacją graficzną.
0 0 0 0 0 0 0 0 0 1
0 0 0 0 0 0 0 0 1 0
0 0 0 0 0 0 0 1 0 0
0 0 0 0 0 0 1 0 0 0
0 0 0 0 0 1 0 0 0 0
0 0 0 0 1 0 0 0 0 0
0 0 0 1 0 0 0 0 0 0
0 0 1 0 0 0 0 0 0 0
0 1 0 0 0 0 0 0 0 0
1 0 0 0 0 0 0 0 0 0
Program dodatkowo powinien obliczać sumę wyróżnionych elementów.
 */
public class Zadanie6b {
    public static void main(String[] args) {
        int n, m, suma;
        n = 10;
        m = 10;
        suma = 0;
        int macierz[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((j==((n-1)-i))){
                    macierz[i][j] = 1;
                    suma +=macierz[i][j];
                }
                else {
                    macierz[i][j] = 0;
                }
            }
            System.out.println(Arrays.toString(macierz[i]));
        }
        System.out.println(suma);
    }
}
