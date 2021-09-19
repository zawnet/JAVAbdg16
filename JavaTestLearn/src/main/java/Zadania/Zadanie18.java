package Zadania;

/**
 * Napisz program, który tworzy i wypisuje unikalne 3-cyfrowe liczby niezawierajce powtarzajcych si cyfr z zakresu od 1 do 4. Program,
 * równie powinien wywietli ile jest takich liczb.
 * Spodziewany rezultat dziaani programu:
 * 123
 * 124
 * …
 * 431
 * 432
 * Ilo wszystkich liczb 3-cyfrowych to 24
 */
public class Zadanie18 {
    public static void main(String[] args) {
        System.out.println(generateUnicalNDigitsNumber(4));
    }

    private static String generateUnicalNDigitsNumber(int nDigits) {
        StringBuilder s = new StringBuilder();
        int count = 0;
        int ammount =0;
        for (int a = 1; a <= nDigits; a++) {
            for (int b = 1; b <= nDigits; b++) {
                if (a == b){count++; continue;}
                for (int c = 1; c <= nDigits; c++) {
                    if (b == c || b==a){count++; continue;}
                    if (a != b && b != c && a !=c) {
                        ammount++;
                        count++;
                        s.append(a).append(b).append(c).append("\n");
                    }
                }
            }
        }
            return "Wystąpień: " + ammount + "\n" + s.toString();


    }

}
