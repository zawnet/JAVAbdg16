public class Reducer {

    public static void main(String[] args) {
        Reducer reducer = new Reducer();
        String numberToReduce = "277777788888899";
        long reducedValue = reducer.reduce(numberToReduce);
        System.out.println("Number to reduce: " + numberToReduce);
        System.out.println("After reduce: " + reducedValue);
    }

    public long reduce(String number) {
        long wynik=1;
            for (int i = 0; i<number.length(); i++){
                wynik *= Integer.parseInt(Character.toString(number.charAt(i)));
                //System.out.print(number.charAt(i) + " ");
            }
            if(wynik >=10)
                return reduce(String.format("%d",wynik));
            else
                return Integer.parseInt(number);
        //System.out.println(wynik);





    }
}