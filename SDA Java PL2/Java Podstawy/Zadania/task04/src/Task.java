import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        double amount=0;
        int numberOfInstallments=0;
        double amountInstallment=0;

        Scanner input = new Scanner(System.in);
        amount = input.nextDouble();
        numberOfInstallments = input.nextInt();

        if(amount<100 || amount>10000){

            amount = 5000;
        }
        if(numberOfInstallments<6 || numberOfInstallments>48) {
            numberOfInstallments = 36;
        }
            if(numberOfInstallments<=12)
                amountInstallment = (amount*0.025 + amount)/numberOfInstallments;
            else if(numberOfInstallments>=13 && numberOfInstallments <=24)
                amountInstallment = (amount*0.05 + amount)/numberOfInstallments;
            else
                amountInstallment = (amount*0.10 +amount)/numberOfInstallments;


        System.out.println(amountInstallment);
    }
}