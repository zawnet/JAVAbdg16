import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        RownanieKwadratowe();
    }
    public static void RownanieKwadratowe(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj parametr a: ");
        double a = input.nextDouble();
        System.out.println("Podaj parametr b:");
        double b = input.nextDouble();
        System.out.println("Podaj parametr c");
        double c = input.nextDouble();

        double delta = Math.pow(b,2) - 4 * (a*c);
        //Rowanie posiada 2 rozwiazania
        if(delta>0){
            double x1 = (-b - Math.sqrt(Math.pow(b,2)-4*a*c)) / 2*a;
            double x2 = (-b + Math.sqrt(Math.pow(b,2)-4*a*c)) / 2*a;
            System.out.printf("x1 = %.2f, x2 = %.2f", x1,x2);
        }
        //Rownanie posiada tylko jedno prozwiazanie
        else if (delta == 0){
            double x1 = -b / (2*a);
            System.out.printf("x1 = %f", x1);
        }
        else {
            System.out.println("Równanie nie posaida rozwiązań");
        }
    }
}
