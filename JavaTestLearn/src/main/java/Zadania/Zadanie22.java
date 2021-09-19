package Zadania;

/**
 * Napisz program, który wypisze wszystkich liderów w tablicy
 * (lider to taka liczba, dla której wszystkie liczby po jej prawej stronie s od niej mniejsze)
 * Przykad
 * Wejcie: [10, 9, 14, 23, 15, 0, 9]
 * Wyjcie: 23, 15, 9
 *
 */
public class Zadanie22 {

    public static void main(String[] args) {
        int tab[] = {10, 9, 14, 23, 15, 0, 9};
        System.out.println(findLeadersInMatrix(tab));
    }

    private static String findLeadersInMatrix(int matrix[]){
        StringBuilder sb = new StringBuilder();
        int actualleaader =0;
        int i = 0;
        int sum = 0;
        while (sum <= actualleaader && i<matrix.length-1)
        {
            if(matrix[i] > sum){
                actualleaader = matrix[i];
            }
          sum +=matrix[i];
          i++;


        }
        System.out.println(sum);


        return sb.toString();
    }
}
