package Zadania;

public class Zadanie13 {

    public static void main(String[] args) {
        System.out.println(addBinary("1101","10"));
    }

    /**
     * Metoda dodaje dwie liczby binarne
     * Zasady:
     * 0+0 = 0  1+0 = 1  0+1 = 1     1+1=10
     * @param number1
     * @param number2
     * @return Zwraca postać bianrną wyniku dowawania number1 i number2
     */
    private static String addBinary(String number1, String number2)
    {
            String result = "";
            int addOne = 0;
            int maxLen = Math.max(number1.length(), number2.length());
            if(number1.length() > number2.length()){
                while (number2.length() < number1.length()){
                    number2 = '0'+number2;
                }
            }
            else if(number2.length() > number1.length()){
                while (number1.length() < number2.length()){
                    number1 = '0'+number2;
                }
            }

            for (int i = 0; i<maxLen; i++){

                int l1  = number1.charAt(maxLen-1 - i)-'0';
                int l2  = number2.charAt(maxLen-1 - i)-'0';

                int bsum = l1+l2+addOne;
                addOne= bsum/2;

                result = bsum%2 + result;
                //System.out.println(result);
            }

        return (addOne == 0)? result : "1"+result;
    }
}
