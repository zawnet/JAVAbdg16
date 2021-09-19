package Zadania;

import java.util.Arrays;

/**
 * Napisz program, który przeniesie wszystkie cyfry 0 na koniec tablicy
 * Przykad
 * Wejcie: [0, 0, 1, 3, 0, 5, 0, 6]
 * Wyjcie: [1, 3, 5, 6, 0, 0, 0, 0]
 */
public class Zadanie21 {

    public static void main(String[] args) {
        int tab[] = {0, 0, 1, 3, 0, 5, 0, 6};
        System.out.println(Arrays.toString(setZerosToTheEndOfMatrix(tab)));
    }

    private static int[] setZerosToTheEndOfMatrix(int matrix[]){
        int matrixlenght = matrix.length-1;
        int j = 0;
        for (int i=0; i<matrixlenght; i++){
            if(matrix[i] == 0 ){
                if(matrix[matrixlenght] != 0) {
                    int tmp = matrix[matrixlenght];
                    matrix[matrixlenght] = matrix[i];
                    matrix[i] = tmp;
                    matrixlenght--;
                }
                else {
                    matrixlenght--;
                    i--;
                }
            }
            else {

                continue;
            }

        }
        return matrix;
    }
}
