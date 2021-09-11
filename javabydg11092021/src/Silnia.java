public class Silnia {
    public static void main(String[] args) {
        System.out.println(silnia(4));
        System.out.println(wsilnia(4));
    }

    public static int silnia(int n){
        return (n==1)? 1 : n*silnia(n-1);
    }

    public static int wsilnia(int n){
        int result = 1;
        while (n>1) {
            //`result *= (n);
            n--;
        }
        return result;
    }


}
