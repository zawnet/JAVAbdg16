import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] numbers = Arrays
                .stream(args)
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = 0;
        while (n < 10){
            int countNuber = 0;
            n++;
            for(int i = 0; i< numbers.length; i++){
                if(n == numbers[i]){
                    countNuber++;
                }
                else {
                    continue;
                }
            }
            System.out.println(n+" - "+countNuber);
        }
    }
}