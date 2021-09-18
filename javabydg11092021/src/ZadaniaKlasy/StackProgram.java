package ZadaniaKlasy;

/**
 * Program testujacy zachwanie klasy Stack
 */
public class StackProgram {
    public static void main(String[] args) {
        Stack stack = new Stack(4);

        stack.push(new StackElement("Paweł"));
        stack.push(new StackElement("Aneta"));
        stack.push(new StackElement("Aneta"));
        stack.push(new StackElement("Ola"));
        stack.push( new StackElement("Jaś"));
        stack.pop();
        stack.push(new StackElement("Małgorzata"));
        //System.out.println(stack.count());
        stack.print();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(new StackElement("Waldemar"));
        stack.push(new StackElement("Hubert"));
        stack.push(new StackElement("Konrad"));
        stack.peek().print();
        stack.print();
    }
}
