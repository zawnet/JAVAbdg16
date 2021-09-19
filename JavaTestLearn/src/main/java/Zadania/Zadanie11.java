package Zadania;

import java.util.Scanner;

public class Zadanie11 {


    public String convertHexToBinary(String number) {
        // 2A5

        //2 - A - 5     rozbijamy na 3 częsci
        //2 - 10 - 5    zamieniamy na wartosc dziesietna tych liczb

        //krok 1  - 5 zamianiamy na banary  (4 bity)
        //5_(10) -> 101_(2) -> -0101_(2)
        //krok 2 - 10 zamienamy na bainarny (4 bity)
        //10_(10) -> 1010_(2)
        //krok 3
        //2_(10 -> 10_(2) -> 0010_(2)
        String binary = "";

        for (int i = number.length() -1 ; i>=0; i--){
            int decmimal = convertHexToDecimal(number.charAt(i));
            System.out.println(decmimal);
            String partBinary = intToBinary(decmimal);
            binary = partBinary + binary;
            }
        while (binary.charAt(0) == '0'){
            binary = binary.substring(1,binary.length());
        }

        return  binary;
        }




    private static int convertHexToDecimal(char number) {
        number = Character.toUpperCase(number);
        switch (number){
            case '0': return 0;
            case '1': return 1;
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            case 'A': return 10;
            case 'B': return 11;
            case 'C': return 12;
            case 'D': return 13;
            case 'E': return 14;
            case 'F': return 15;
            default:
                return -1;

        }

    }

    public static String intToBinary(int n)
    {
        String s = "";
        while (n > 0)
        {
            s =  ( (n % 2 ) == 0 ? "0" : "1") +s;
            n = n / 2;
        }
        while (s.length() < 4) {
            s = '0'+s;
        }
        return s;

    }

}
