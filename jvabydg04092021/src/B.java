public class B extends A {

    void print(){
        System.out.println("B");
    }

    @Override
    void oddychaj() {
        super.oddychaj();
        System.out.println("Oddycham pod wodą");
    }

    public static void main(String[] args) {
        A b = new B();
        b.print();
        b.oddychaj();
    }
}
