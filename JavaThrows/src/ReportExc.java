public class ReportExc {
    public ReportExc(){
        wykonaj();
    }

    private void wykonaj() {
        try {
            int num = Integer.parseInt("1aaa");
        }
        catch (NumberFormatException exc){
            System.out.println("-----> Co pdoaje getMessage()");
            System.out.println(exc.getMessage());
            System.out.println("-----> CO podaje toString()");
            System.out.println(exc);
            System.out.println("-----> Wydruk śladu stosu"
                    + " (kolejność wywołąń metod) ");
            exc.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new ReportExc();
    }
}
