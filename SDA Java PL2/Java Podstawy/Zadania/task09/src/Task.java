import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int sumaMinMax=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int i=0;
        int sumaLiczb = 0;
        double sredniaArtmetyczna=0.0d;
        while ((n=scanner.nextInt()) != 0){
            i++;
            sumaLiczb += n;
            if(n<min){
                min = n;
            }
            if(n>max){
                max = n;
            }


        }
        sumaMinMax = max+min;
        sredniaArtmetyczna = (double) sumaMinMax / 2;
        //System.out.println(i);
        System.out.println(sumaMinMax);
        System.out.println(sredniaArtmetyczna);
    }
}