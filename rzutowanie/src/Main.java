public class Main {
    public static void main2(String[] args) {
        int myInt = 9;
        double myDouble = myInt; //int do double
        System.out.println(myInt); //9
        System.out.println(myDouble);//9.0
    }

    public static void main(String[] args) {
        double myDouble = 9.78d;
        int myInt = (int) myDouble; //rzutowanie double to int
        System.out.println(myDouble); //9.78
        System.out.println(myInt); //9

    }
}
