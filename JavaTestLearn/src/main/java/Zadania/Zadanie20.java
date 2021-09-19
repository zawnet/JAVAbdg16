package Zadania;

/**
 * Napisz program, który znajdzie pary wszystkich liczb w tablicy, których suma jest równa wybranej liczbie
 * Przykad
 * Wejcie: tab=[2, 7, 4, -5, 11, 5, 20], liczba=15
 * Wyjcie: 4 + 11 = 15, -5 + 20 = 15
 */
public class Zadanie20 {
    public static void main(String[] args) {
        int tab[] = {2, 7, 4, -5, 11, 5, 20};
        System.out.println(findDigitsSumInMatrix(tab,15));
    }

    private static String findDigitsSumInMatrix(int matrix[], int sum){
        StringBuilder sb = new StringBuilder();
        int matrixlenght = matrix.length;
        for(int i = 0; i<matrixlenght; i++){
            for (int j = i+1;j<matrixlenght; j++){
                if(matrix[i]+matrix[j] == sum){
                    sb.append(matrix[i]).append(" + ").append(matrix[j]).append(" = ").append(sum).append("\n");
                }
            }
        }
        return sb.toString();
    }
}
