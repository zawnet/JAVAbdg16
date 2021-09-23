import java.util.Scanner;

public class Task {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int sumaMinMax=0;
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        int i=0;
        int sumaLiczb = 0;
        double sredniaArtmetyczna=0.00d;
        while ((n=scanner.nextInt()) != 0){
            i++;
            sumaLiczb += n;
            if(n<min){
                min = n;
            }
            if(n>max){
                max = n;
            }
            sumaMinMax = min+max;

        }
        sredniaArtmetyczna = sumaLiczb / i;
        System.out.println(i);
        System.out.printf("%d %.2f",sumaMinMax,sredniaArtmetyczna);
    }
}