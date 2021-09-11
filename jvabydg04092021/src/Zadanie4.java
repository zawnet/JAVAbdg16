/*
Zadanie 4
Napisz program wyświetlający tabliczkę mnożenia dla liczb od 1 do 100 z wykorzystaniem podwójnej pętli for.
 */
public class Zadanie4 {
    public static void main(String[] args) {
        for (int i =0; i<10; i++){
                if (i == 0)
                    System.out.printf("%4s", "|");

                if (i == 9) {
                    System.out.printf("%3s", (i + 1));
                    System.out.println();
                }
                else {
                    System.out.printf("%3s", (i + 1));
                }
        }
        for (int i =0; i<10; i++){
            System.out.printf("%s", "---");
            if (i == 9) {
                System.out.printf("%s", "----");
                System.out.println();
            }
        }
        for(int i = 0; i<10; i++)
            for (int j=0; j<10; j++){
                if(j==0) {
                    System.out.printf("%2s",i+1);
                    System.out.printf("%2s", "|");
                }
                System.out.printf("%3s", (i + 1) *(j+1));
                if(j==9)
                    System.out.println();
            }
    }


}

