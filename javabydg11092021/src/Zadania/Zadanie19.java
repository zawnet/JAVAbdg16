package Zadania;

import java.util.Arrays;

/**
 * Napisz program, który dla zadanej tablicy liczb cakowitych usunie z niej wszystkie duplikaty
 * Przykad
 * Wejcie: [10, 22, 10, 20, 11, 22]
 * Wyjcie: [10, 22, 20, 11]
 */
public class Zadanie19 {

    public static void main(String[] args) {
        int[] matrix = {10,22,10,20,11,22};
        System.out.println(Arrays.toString(removeDuplicatesInMatrix(matrix)));
    }
    private static int[] removeDuplicatesInMatrix(int[] matrix){
        int nunical = matrix.length;
        for(int i = 0; i<matrix.length; i++){
            for(int j = i+1; j<i; j++)
            {
                if(matrix[i] == matrix[j]){

                   // int tmp = matrix[j];
                    matrix[j] = matrix[nunical-1];
                   // matrix[nunical-1] = tmp;
                    nunical--;
                    j--;

                }
                else continue;
            }
        }


        return Arrays.copyOf(matrix,nunical);
    }
}
