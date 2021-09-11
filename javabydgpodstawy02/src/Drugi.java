public class Drugi {
    public static boolean[][] tabSoocalne = new boolean[5][5];
    public  static boolean[][] tabNaukowe = new boolean[5][5];

    public static void main(String[] args) {
        Main myObj1 = new Main();
        myObj1.czyNaPlaze(myObj1.sprawdzPogode(14.0f,998.0f,10f));

        for (int i = 0;i<5;i++){
            for (int j=0; j<5;j++){
                Drugi.tabSoocalne[i][j] = true;
            }
        }
        for (int i = 0;i<5;i++){
            for (int j=0; j<5;j++){
                Drugi.tabNaukowe[i][j] = true;
            }
        }

        if(myObj1.stypendiumSocjalneKryterium("Paweł","Zawada",1,1000)){
            System.out.println("Dostałeś stypendium socjalne");
        }
        else{
            System.out.println("Niestety nie otrzymałeś stypendium socjalnego");
        }



    }
}
