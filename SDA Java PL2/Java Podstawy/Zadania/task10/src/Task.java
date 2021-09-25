import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = 1;
        while (k <= n){
            if(n%k==0){
                System.out.println(k);
            }
            k++;
        }
    }
}