public class Zadanie3f {

    public static void main(String[] args) {
        int a=8;
        int b=8;
        for(int i = 1 ; i<=a; i++){
            for (int j=1; j<=a; j++ ){
                if(i==1 || j==i || i==a )
                    System.out.printf("%2s","#");
                else
                    System.out.printf("%2s"," ");
            }
            System.out.println("");
        }
    }
}
