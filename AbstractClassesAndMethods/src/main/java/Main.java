import Animals.Cat;
import Animals.FatCat;
import Animals.Garfield;
import Animals.LasagnaEater;
import Machines.Calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main0(String[] args) {
        List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(Boolean.parseBoolean("False"));
        list.add(Boolean.TRUE);
        System.out.print(list.size());
        System.out.println(list.get(1) instanceof Boolean);
        char myCharacter = "piper".charAt(3);
        System.out.println(myCharacter);
        System.out.println("nifty".getClass().getSimpleName() == "String");
        System.out.println("hello my friends".split(" ")[0]);

        String meesage = "Hello WOrd";
        //String newMeesage = meesage.substring(6,12)+meesage.substring(12,6);
        System.out.println(meesage);

        //String a -> f

        Calculator calculator = new Calculator();

        System.out.println(calculator.PI);

        Garfield garfield = new Garfield();
        FatCat fatCat = new Garfield();
        Cat cat = new Garfield();
        LasagnaEater lasagnaEater = new Garfield();

        garfield.getLasagnaRecipe();
        garfield.getName();
        garfield.getWeight();

        fatCat.getWeight();
        fatCat.getLasagnaRecipe();
        fatCat.getName();

        cat.getName();

        lasagnaEater.getLasagnaRecipe();




    }

    public static void main(String[] args) {
        //import java.util.Scanner;

                Scanner scanner = new Scanner(System.in);
                int n = 0;
                int sumaMinMax=0;
                int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;
                int i=0;
                int sumaLiczb = 0;
                double sredniaArtmetyczna=0.00d;
                while ((n=scanner.nextInt()) != 0){
                    i++;
                    sumaLiczb = sumaLiczb + n;

                    if(n!= 0 && n<min){
                        min = n;
                    }
                    if(n!=0 && n>max){
                        max = n;
                    }
                        sumaMinMax = min+max;
                sredniaArtmetyczna = sumaLiczb / i;
                System.out.println(i);
                System.out.printf("%d %.2f",sumaMinMax,sredniaArtmetyczna);
            }
        }


