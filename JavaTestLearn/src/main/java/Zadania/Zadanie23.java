package Zadania;
/**
 * Napisz program, który wykorzystujc algorytm szukania binarnego zwróci indeks szukanej liczby w posortowanej tablicy liczb cakowitych
 * Przykad
 * Wejcie [3, 6, 8, 11, 45, 47, 69, 99], n=47
 * Wyjcie: 5
 */

public class Zadanie23 {
    public static void main(String[] args) {
        int tab[] = {3, 6, 8, 11, 45, 47, 69, 99};
        System.out.println(findBinaryInMatrix(tab,100));
    }

    private static int findBinaryInMatrix(int matrix[], int n){
        int startindex, endindex, matrixlenght, center;
        matrixlenght = matrix.length-1;
        startindex = 0;
        endindex = matrixlenght;
        center = 0;
      //  center = (startindex + endindex)/2;
        while (true)
        {
            if(endindex < startindex)
                return -1;
            center = (startindex + endindex)/2;
            if(matrix[center] == n){
                return center;
            }
            else if(matrix[center]>n){
                    endindex = center - 1;
            }
            else {
                    startindex = center +1;
            }
        }
    }
}
