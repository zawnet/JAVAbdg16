package Zwierzeta;

public class Hippopotamidae extends Zwierze{
    @Override
    public void wedruj() {
        super.wedruj();
        System.out.println("wędruje wdłuż afykańskich rzek");
    }

    @Override
    public void jedz() {
        super.jedz();
        System.out.println("Jem rośliny");
    }
}
