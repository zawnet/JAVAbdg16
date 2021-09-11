import java.util.Arrays;
import java.util.Scanner;
//Napisać to w wersji na liczbach całkowitych
public class Zadania {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  a = input.nextInt();
        String a1 = String.format("%d",a);
        for (int i = a1.length()-1; i>=0; i--)
        {
            System.out.print(a1.charAt(i));
        }

    }
}
class Zadaniav2 {
    public static void main(String[] args) {
        int liczba = 12345;
        int result = 0;
        while (liczba > 0){
            int a = liczba % 10;
            result = result*10 + a;
            //System.out.print(a);
            liczba = liczba/10;
        }
        System.out.println(result);

    }
}

class Zadaniav3 {
    public static void main(String[] args) {
        String liczba = "12345";
        String result = "";
        for( char c : liczba.toCharArray()){
            System.out.println(c);
            result = c+result;
        }
        System.out.println(result);

    }
}

class Zadania2{
    public static void main(String[] args) {
            int a[] = {1,2,3,4,5};
            int suma=0;
            for (int i = 0; i<a.length;i++){
                suma += a[i];
            }
        System.out.println(suma);
    }
}

class Zadania3{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int suma=0;
        for (int i = 0; i<a.length;i++){
            suma += a[i];
        }
        System.out.println(suma/(a.length));
    }
}

class Zadania4{
    public static void main(String[] args) {
        int a[] = {1,4,5,9,99};
        int element=9;
        for (int i = 0; i<a.length;i++){
            if(a[i] == element){
                System.out.printf("Index elementu %d: to: %d", element, i);
                break;
            }
        }
        //System.out.println(suma);
    }
}

class Zadania4v2{
    public static void main(String[] args) {
        int a[] = {1,4,5,9,99};
        int index=0;
        int searchValue = 8;
        do {
            if(a[index] == searchValue) {
                System.out.printf("Index elementu %d: to: %d", searchValue, index);
                break;
            }
            index++;
        }while (index<a.length);
        //System.out.println(suma);
    }
}

class Zadania5{
    public static void main(String[] args) {
        int[] a = {1,4,5,9,99};
        int[] copyA = new int[a.length];

        for (int i = 0; i< a.length; i++){
            copyA[i] = a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(copyA));
    }
}

class Zadanie6 {
    public static void main(String[] args) {
        int[] a = {1,4,5,9,99};
        int min = Integer.MAX_VALUE; //Tu trzeba pamietac aby miec z czym prownać
        int max = Integer.MIN_VALUE;
        //int min = a[0];
        //int max = a[0];

        for (int element : a){
            if(element<min)
                min = element;
            if(element>max)
                max = element;
        }
        System.out.println("Dla tablicy: " + Arrays.toString(a)+" minimalny element to: "+ min+ " a maksymalny to: "+max);
    }
}

class Zadanie7 {
    public static void main(String[] args) {
        int liczba = 34566;
        switch (liczba%2){
            case 0:
                System.out.println("Liczba jest parzysta");
                break;
            case 1:
                System.out.println("liczba jest nieparzysta");
                break;
            default:
                System.out.println("Coś poszło nie tak");
                break;
        }
    }
}



