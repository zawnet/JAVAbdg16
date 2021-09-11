public class Zadanie1 {
    public static void main(String[] args) {
        for (int i = 1; i<=10;++i) {
            for (int j = 1; j <= 10; ++j) {
                if (i == 1 )
                    System.out.printf("%4s", (j));
            }

            System.out.print("\n+---");
            for (int j = 1; j <= 10; ++j) {
               // if (j == 1)
                   // System.out.printf("%4s", (i));

                if (j == 10) {
                    System.out.printf("%s\n","+");
                   // System.out.printf("%d\n", i * j);
                }
                else {
                    System.out.printf("%4s","+---");
                    //System.out.printf("%d\t", i * j);
                }
            }
            for (int j = 1; j <= 10; ++j) {
                if (j == 1)
                    System.out.printf("%4s", (i));
                if (j == 10) {
                    //System.out.println("+---+");
                     System.out.printf("|%3s|", (i * j));
                }
                else {
                    //System.out.print("+---");
                    System.out.printf("|%3s", (i * j));
                }
            }
            //Wypisanie ostatniego wiersza
            if(i==10) {
                System.out.println();
                for (int j = 1; j <= 10; ++j) {
                    System.out.print("+---");
                    if (j==10) {
                        System.out.println("+");
                    }
                }
            }



        }


    }
}
