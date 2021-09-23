import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long i = 0;
        int n;
        while ((n=scanner.nextInt()) != 0){
           i += n;
        }

        System.out.println(i);

    }
}