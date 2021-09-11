import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        float tempInCelsius;
        float tempInFahrenheit;
        Scanner input = new Scanner(System.in);
        tempInCelsius = input.nextFloat();
        tempInFahrenheit = (float)(1.8*tempInCelsius) + 32;
        System.out.println(tempInFahrenheit);

    }
}