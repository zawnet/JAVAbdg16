public class Prostakat extends Czworobok {



    private double dlugoscPierwszegoBoku;
    private double dlugoscDrugiegoBoku;

    public Prostakat(double dlugoscPierwszegoBoku, double dlugoscDrugiegoBoku) {
        super(dlugoscPierwszegoBoku, dlugoscDrugiegoBoku, dlugoscPierwszegoBoku, dlugoscDrugiegoBoku);
        this.dlugoscPierwszegoBoku = dlugoscPierwszegoBoku;
        this.dlugoscDrugiegoBoku = dlugoscDrugiegoBoku;
    }



    public double getDlugoscDrugiegoBoku() {
        return dlugoscDrugiegoBoku;
    }

    public double getDlugoscPierwszegoBoku() {
        return dlugoscPierwszegoBoku;
    }

    public void setDlugoscDrugiegoBoku(double dlugoscDrugiegoBoku) {
        this.dlugoscDrugiegoBoku = dlugoscDrugiegoBoku;
    }

    public void setDlugoscPierwszegoBoku(double dlugoscPierwszegoBoku) {
        this.dlugoscPierwszegoBoku = dlugoscPierwszegoBoku;
    }

    public double obliczPole() {
        return dlugoscDrugiegoBoku*dlugoscDrugiegoBoku;
    }





}
