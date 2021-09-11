public class Varargs {
    void method(Prostakat p, Object... objects){
        for (Object obj : objects){
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        Varargs varargs = new Varargs();
       // varargs.method(new Prostakat());
        //varargs.method(new Prostakat(),"Ala ma kota");
        //varargs.method(new Prostakat(),"Ala ma kota", "Kot ma Ale");
    }


}
