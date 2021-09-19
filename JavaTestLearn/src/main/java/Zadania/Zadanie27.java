package Zadania;
/**
 *
 * Napisz program, który wykorzystujc rekurencję sprawdzi,
 * czy wprowadzone przez uytkownika słowo jest palindromem.
 */
public class Zadanie27 {

    public static void main(String[] args) {
        String word = "geuieg";
        System.out.println(isPalindrome(word));
        System.out.println(isPalindromeIter(word));
    }

    /**
     * Rekurencyjna werjsa metody sprawdzającej czy słowo jest palindromem
     * @param word sprawdzane słowo
     * @return
     */
    private static boolean isPalindrome(String word){
        //Ustalamy dlugosc napisu
        int n = word.length()-1;

        if(word.length()==1){
            return true;
        }
        //w przeciwnym przypadku zwracamy false
        if (word.charAt(0) != word.charAt(n)) {
            return false;
        }
        //Wywołujemy ponownie metodne na podsłowie 2 do n
        return isPalindrome(word.substring(2, n));

    }

    /**
     * Iteracyjna metoda sprawdzajaca czy dane słowo jest palindromem
     *
     * @param word
     * @return wartość logidzna true jak jest false jak nie jest
     */
    private static boolean isPalindromeIter(String word){
        boolean ispalindrome  = false;
        int n = word.length()-1;

        if(n>0) {
            for (int i = 0; i < n; i++) {
                //System.out.println(word.charAt(i) + " "+word.charAt(n));
                if (word.charAt(i) == word.charAt(n)) {
                    ispalindrome = true;
                } else {
                    ispalindrome = false;
                    break;
                }
                n--;
            }
        }

        return ispalindrome;
    }
}
