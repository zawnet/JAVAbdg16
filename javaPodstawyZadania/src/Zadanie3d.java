public class Zadanie3d {

    public static void main(String[] args) {
        int a=8;
        int b=8;
        for(int i = 1 ; i<=a; i++){
            for (int j=1; j<=a; j++ ){
                if(j>=i)
                    System.out.printf("%2s","#");
                else
                    System.out.printf("%2s"," ");
            }
            System.out.println("");
        }
    }
}
