import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();



        if(a>=b) {
            System.out.println("Robota skończona");
        }
        else {
            int suma=0;
            int n=a;
           while (n<=b)
           {
               suma =suma+n;
               n++;
           }
            System.out.println(suma);
        }
    }
}