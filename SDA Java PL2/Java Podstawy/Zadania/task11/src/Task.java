import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Tu zaimplementuj rozwiązanie
        if(number>1){
            int k = 2;
            boolean is = true;
            while (k<number && k>=2){
                if(number%k == 0){
                    is=false;
                    break;
                }
                k++;
            }
            if(is){
                System.out.println("Tak");
            }
            else {
                System.out.println("Nie");
            }
        }
        else {
            System.out.println("Przerywam pracę");
        }

    }
}