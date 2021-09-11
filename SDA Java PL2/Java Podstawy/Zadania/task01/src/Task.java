import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int height;
        float weight;
        Scanner input  = new Scanner(System.in);
        height = input.nextInt();
        weight = input.nextFloat();
        if(height>150 && weight<=180){
            System.out.println("Zapnij pasy!");
        }
        else
        {
            System.out.println("Przykro mi, nie możesz jechać!");
        }

    }
}