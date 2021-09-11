import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        double income;
        double tax=0;
        Scanner input = new Scanner(System.in);
        income = input.nextDouble();
        if(income>556.02) {
            if (income <= 85528.00) {
                tax = (0.18 * income) - 556.02;
            } else {
                tax = ((0.18 * 85528.00) - 556.02) + (0.32 * (income - 85528.00));
            }
        }
        System.out.println(tax);
    }
}