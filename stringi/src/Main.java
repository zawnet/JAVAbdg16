public class Main {
    public static void main1(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPRTUVWXYZ";
        System.out.println("the lehnght of txt strings is: " + txt.length());
        //Zamiana znakow
        txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
    }

    public static void main2(String[] args) {

        String txt = "Please locate where 'locate' occurs!";

        System.out.println(txt.indexOf("Please")); //0
    }

    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        //kontakentacja z +
        System.out.println(firstName + " "+ lastName);

        //Konkatenacja
        System.out.println(firstName.concat(" ".concat(lastName)));

        int x = 10;
        int y = 20;
        int z = x + y;

        String x1 = "10";
        String y2 = "20";
        String z2 = x2 + z2;

        String x = "10";
        y = 20;
        z = x+y;
    }
}
