package Zadania;

public class NumberFormatParser {

    public int intToBinary(int n)
    {
        String s = "";
        while (n > 0)
        {
            s =  ( (n % 2 ) == 0 ? "0" : "1") +s;
            n = n / 2;
        }
        return Integer.parseInt(s);
    }

    public int intToOctal(int n)
    {
        String s = "";
        while (n > 0)
        {
            s =  ( (n % 8 ) == 0 ? n : n % 8) +s;
            n = n / 8;
        }
        return Integer.parseInt(s);
    }


    public int convertOctalToDecimal(int n){
        int liczba = 0;
        int potega = 0;
        while (n != 0){
            int r = n % 10;
            liczba = liczba + r*(int)Math.pow(8,potega++);
            n /=10;
        }

        return liczba;
    }

    public  long intToBinaryV2(int n){
        int byteNumber = 0;
        int r=0;
        long liczba = 0;
        while ((n!=0)){
            r = n%2;
            n /=2;
            liczba += Math.pow(10,byteNumber)*r;
            byteNumber++;
        }
        //System.out.println(pow);

        return liczba;
    }

    public String intToHex(int n){
        return "";
    }

    public int binatyToInt(int n){
        String binary = String.valueOf(n);
        int liczba = 0;
        int potega = 0;
        for (int i = binary.length()-1; i>=0; i--){
            int value = Character.getNumericValue(binary.charAt(i));
            liczba  = liczba + value * (int)Math.pow(2,potega++);
        }
        return liczba;
    }

    public int convertBinarytoDecimical(int number){
        //liczba  = 0
        //potega = 0
        //1010
        //1010 mod 10 = 101 r 0
        //liczba = liczba + r * 2^potega = 0
        //potega = potega + 1;
        //1010 -> 101

        int liczba = 0;
        int potega = 0;
        while (number != 0){
            int r = number % 10;
            liczba = liczba + r*(int)Math.pow(2,potega++);
            number /=10;
        }

        return liczba;

    }

    public int convertDecimalToOctal(int n){
        int liczba = 0;                             //reprezentuje liczbe w postaci osemkowej
        int wyst = 0;                               //przechowuje ilosc dzielen n/8

        while (n != 0){                             //1 krok wyst=0 r=15%8=7 n->15 2 n=15/8=1  liczba = 10^0 * 7 = 1*7 =7 wyst=1
            //2 wyst=1 r=1%8=1  n->1/8=0 liczba = 7+10^1=7+10=17;
            int r = n % 8;                          //r - reszta z dzielenia aktualnej wartosci n przez 8 (n mod 8)
            //System.out.println(r);
            n /= 8;                                 //Dzielenie całkowiete  n / 8
            liczba += (Math.pow(10,wyst) * r);      //
            wyst++;
        }

        return liczba;
    }

    public  String decimalToHexConventer(int n){
        String result = "";
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'};

        while (n!=0){
            int r = n%16;
            n /=16;
            result = hexDigits[r] + result;
        }
        return result;
    }


}
