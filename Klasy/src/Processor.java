public class Processor {

    private String name;        // nazwa procesora
    private int cores;          // liczba rdzeni

    public int getCores() {
        return cores;
    }

    public String getName() {
        return name;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Processor(){

    }


    @Override
    public String toString() {
        return "Processor{" +
                "name='" + name + '\'' +
                ", cores=" + cores +
                '}';
    }
}
