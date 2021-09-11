/*
Zadanie 2
Napisz program, który za pomocą instrukcji while dla danych wartości x zmieniających
się od 0 do 10 oblicza wartość funkcji y = 3x.
 */

public class Zadanie2 {
    public static void main(String[] args) {
        int x=0;
        while (x<=10){
            int y = 3*x;
            System.out.println(y);
            x++;
        }
    }
}
