public class Zadanie3i {

    public static void main(String[] args) {
        int a=7;
        int b=8;
        for(int i = 1 ; i<=a; i++){
            for (int j=1; j<=a; j++ ){
                if(i==1 || j==i || i==a || i==a-(j-1) || j==a || j==1 )
                    System.out.printf("%2s","#");
                else
                    System.out.printf("%2s"," ");
            }
            System.out.println("");
        }
    }
}
