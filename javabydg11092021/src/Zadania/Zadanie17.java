package Zadania;

/**
 * Napisz program, który zlicza ilo liter, spacji, cyfr i innych znaków z tekstu wprowadzonego przez uytkownika z klawiatury.
 * Przykad:
 * Wprowad tekst: Ala ma kota, kota ma Al.
 * Spodziewany rezultat dziaana programu:
 * litery: 18
 * spacje: 5
 * cyfry: 0
 * inne: 2
 */
public class Zadanie17 {
    public static void main(String[] args) {
        String txt = "Ala ma kota, kota ma Alę.";
        System.out.println(sumCharacterInText(txt));
    }

    private static String sumCharacterInText2(String txt){
        long nWordChars = 0;
        long nSpaces = 0;
        long nDigits = 0;
        long nOthers = 0;

        for (char c:txt.toCharArray()){
            if(Character.isLetter(c)){
                nWordChars++;
            }
            else if(Character.isDigit(c)){
                nDigits++;
            }
            else if (Character.isSpaceChar(c)){
                nSpaces++;
            }
            else {
                nOthers++;
            }
        }
        return  new StringBuilder().append("Litery: ").append(nWordChars)
                .append("\nspacje: ").append(nSpaces)
                .append("\ncyfry: ").append(nDigits)
                .append("\ninne: ").append(nOthers)
                .toString();
    }

    private static String sumCharacterInText(String txt){
        long nWordChars = 0;
        long nSpaces = 0;
        long nDigits = 0;
        long nOthers = 0;

        for (int i = 0; i<txt.length()-1; i++){
            char character = txt.charAt(i);
            if(character >='A' && character <='z' ||
                    (character =='Ą' || character =='ą' || character =='Ę' || character =='ę'

                    )

            ) {
                nWordChars++;
            }
            else if(character == ' '){
                nSpaces++;
            }
            else if(character >= '0' && character <= '9'){
                nDigits++;
            }

        }

            return  new StringBuilder().append("Litery: ").append(nWordChars)
                    .append("\nspacje: ").append(nSpaces)
                    .append("\ncyfry: ").append(nDigits)
                    .append("\ninne: ").append(nOthers)
                    .toString();


    }

}
