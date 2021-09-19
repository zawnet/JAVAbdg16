package Zadania;

/**
 * Napisz program, który wykorzystujc rekurencj obliczy funkcj Fibonacciego
 */

public class Zadanie28 {

    public static void main(String[] args) {
        int n = 19;
        System.out.println(nFibonacci(n));
    }

    /**
     * Metoda oblicza n-ty elementy ciagu Fibonacciego
     * @param n numer dzukanego elementu w ciagu
     * @return wartość n-tego elemtu w ciągu Fibonacciego lub wyjątek IllegalArgumentException() w przypadku n<0;
     */
    private static int nFibonacci(int n){
        if(n>=0) {
            if (n == 0) return 0;
            else if (n == 1) return 1;
            else return nFibonacci(n - 1) + nFibonacci(n - 2);
        }
        else {
            throw new IllegalArgumentException();
        }

    }
}
