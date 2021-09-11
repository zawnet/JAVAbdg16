public class Zwierze {

    public void zwierzecyOdglos(){
        System.out.println("Zwierzę wydaje dzwięk: ");
    }
}

class Kot extends  Zwierze {
    public void zwierzecyOdglos(){
        super.zwierzecyOdglos();
        System.out.println("Kot miałczy");
    }
}

class Pies extends Zwierze {

    public void zwierzecyOdglos(){
        super.zwierzecyOdglos();
        System.out.println("Pies szczeka");
    }

}
class Main1{
    public static void main(String[] args) {
        Kot kot = new Kot();
        kot.zwierzecyOdglos();

        Pies pies = new Pies();
        pies.zwierzecyOdglos();
    }
}

