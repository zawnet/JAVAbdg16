import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        number = input.nextInt();
        for(int i = 1; i<=number;++i){
            if(i%2==1)
                System.out.println(i);
            else
                continue;
        }
    }
}