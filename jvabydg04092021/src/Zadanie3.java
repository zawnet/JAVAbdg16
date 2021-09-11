/*
Zadanie 3
Napisz program, który korzystając z instrukcji do ... while, sumuje liczby całkowite od 1 do 100.
 */

public class Zadanie3 {
    public static void main(String[] args) {
        int i , suma;
        i=0;
        suma=0;
        do{
            suma +=++i;
        }
        while (i<100);

        System.out.println(suma);
    }
}
