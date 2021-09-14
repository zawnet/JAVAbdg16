package Zadania;

/**
 * Napisz program porównujcy ze sob dwie liczby pod ktem operatorów ‘>', ‘<’, ‘==’, ‘<=’, ‘>=’, '!=’. Liczby wprowadzamy z klawiatury
 * Przykad:
 * Podaj pierwsz liczb: 25
 * Podaj drug liczb: 39
 * Spodziewany rezultat dziaania programu:
 * 25 != 39
 * 25 < 39
 * 25 <= 39
 */

public class Zadanie15 {

    public static void main(String[] args) {
       checkTwoDecimalNumabes(25,39);
    }

    private static void checkTwoDecimalNumabes(int number1, int number2){
        if(number1 > number2){
            System.out.println(number1 +" != " +number2);
            System.out.println(number1 +" > " +number2);
            System.out.println(number1 +" >= " +number2);
        }
        else if(number2 > number1){
            System.out.println(number1 +" != " +number2);
            System.out.println(number1 +" < " +number2);
            System.out.println(number1 +" <= " +number2);
        }
        else {
            System.out.println(number1 +" == " +number2);
            System.out.println(number1 +" >= " +number2);
            System.out.println(number1 +" <= " +number2);
        }
    }

}
