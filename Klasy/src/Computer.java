public class Computer {

    // obowiązkowe pola
    private String motherboard;     // płyta główna
    private Processor processor;       // "i5", "i7", "intel", "amd"

    private RAM[] ram;                // ilość ramu
    // dodatkowe pola
    private int hd;                 // wielkość dysku w GB
    private String monitor;         // nazwa preducenta
    private String printer;         // nazwa drukarki



    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setPrinter(String printer) {
        this.printer = printer;
    }

    public void setRam(RAM[] ram) {
        this.ram = ram;
    }


    public RAM[] getRam() {
        return ram;
    }

    public int getHd() {
        return hd;
    }

    public String getMonitor() {
        return monitor;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public String getPrinter() {
        return printer;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Computer(String motherboard, Processor processor, RAM[] ram) {
        this.motherboard = motherboard;
        this.processor = processor;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "motherboard='" + motherboard + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", hd=" + hd +
                ", monitor='" + monitor + '\'' +
                ", printer='" + printer + '\'' +
                '}';
    }
}
