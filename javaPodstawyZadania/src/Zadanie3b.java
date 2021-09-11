public class Zadanie3b {

    public static void main(String[] args) {
        int a=8;
        int b=8;
        for(int i = a ; i>=1; i--){
            for (int j=1; j<=i; j++ ){
                System.out.printf("%2s","#");
            }
            System.out.println("");
        }
    }
}
