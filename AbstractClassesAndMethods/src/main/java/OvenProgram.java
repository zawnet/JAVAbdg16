import Machines.BakingOven;
import Machines.Oven;
import Machines.RoastingOven;

public class OvenProgram {
    public static void main(String[] args) {
        Oven oven = new Oven();
        BakingOven bakingOven = oven;
        RoastingOven roastingOven = oven;

        bakingOven.bakeBread();
        bakingOven.bakeCookies();
        roastingOven.roastChicken();
    }


}
