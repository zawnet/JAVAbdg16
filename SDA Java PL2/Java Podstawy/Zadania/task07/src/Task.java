import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;

        while (Math.pow(2,i)<=n){
            System.out.printf("%d\n",(int)Math.pow(2,i));
            i++;
        }
    }
}