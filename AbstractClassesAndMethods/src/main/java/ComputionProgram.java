import Machines.Addition;
import Machines.Computation;
import Machines.Multiplication;

import java.util.Scanner;

/**
 * Program wykorzystujacy implementacje interfejsow
 */
public class ComputionProgram {
    public static void main(String[] args) {
        Computation computation;

        if(shouldMultiply()){
            computation = new Multiplication();
        }
        else {
            computation = new Addition();
        }
        double argument1 = getArgument();
        double argument2 = getArgument();

        double result = computation.compute(argument1,argument2);

        System.out.println("Wynik: "+ result);
    }

    private static double getArgument() {
        return new Scanner(System.in).nextDouble();
    }

    private static boolean shouldMultiply() {
        System.out.println("Co chcesz zrobić (+ czy *) ?");
        Scanner input = new Scanner(System.in);

        if(input.next().contains("*")) return true;
        else return false;

 //       Integer[] array = new Integer[10];
//        byte[] array = (123);
 //       char array[] = {"a"};
  //      long[] array = {"1"};
    }

}
