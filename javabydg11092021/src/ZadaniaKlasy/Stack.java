package ZadaniaKlasy;

/**
 * Wykorzystujc umiejtno programowania obiektowego, napisz program składający się z nastpujących klas
 * Stack - klasa reprezentujca stos, stos ma swój stłay rozmiar, który jest ustanawiany w trakcie tworzenia instancji stosu, posiada
 * dwie metody
 * StackElement push(StackElement stackElement) - dodaje kolejny element do stosu, gdy stos jest przepeniony powinna
 * wypisa informacj o jego przepenieniu. Metoda powinna blokować umieszczanie na stosie takich samych elementów (o
 * tej samej nazwie - w tym celu przeciąż metodę equals()). Metoda zwraca element, który umiecia na stosie
 * StackElement pop - zdejmuje i zwraca najnowszy element ze stosu, gdy zostanie wywoana na pustym stosie powinna
 * wypisa informacj o tym, e stos jest pusty
 * StackElement peek - zwraca najnowszy element ze stosu, ale go nie usuwa, gdy zostanie wywoana na pustym stosie
 * powinna wypisa informacj o tym, e stos jest pusty
 * int count - zwraca informacj o iloci elementów pooonych na stosie
 * void print - wypisuje wszystkie elementy stosu w kolejnoci od najnowszego do najstarszego
 */
public class Stack {
    private int size;
    private int count=0;
    private StackElement stackElements[];

    public int getSize() {
        return size;
    }

    public StackElement[] getStackElements() {
        return stackElements;
    }

    /**
     * Konstruktor wymagajacy podania rozmiaru stosu
     * @param size
     */
    public Stack(int size) {
        this.size = size;
        stackElements = new StackElement[size];
    }

    /**
     *  dodaje kolejny element do stosu, gdy stos jest przepeniony powinna
     *  * wypisa informacj o jego przepenieniu. Metoda powinna blokować umieszczanie na stosie takich samych elementów (o
     *  * tej samej nazwie - w tym celu przeciąż metodę equals()). Metoda zwraca element, który umiecia na stosie
     * @param stackElement
     * @return
     */
    public StackElement push(StackElement stackElement){
        System.out.println(count());
        if(count() < getSize() && !equals(stackElement)){
            this.stackElements[count++] = stackElement;
            return stackElement;
        }
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        int n=0;
        StackElement element = (StackElement) obj;
        while (n<count()){
            if(stackElements[n].equals(element) || stackElements[n].getName() == element.getName()){
                return true;
            }
            n++;
        }
        return false;
    }

    int count(){
        return count;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(4);
        StackElement stackElement = new StackElement();
        stackElement.setName("Paweł");
        stack.push(stackElement);
        stackElement = new StackElement();
        stackElement.setName("Aneta");
        stack.push(stackElement);
        stackElement = new StackElement();
        stackElement.setName("Ola");
        stack.push(stackElement);
        stackElement = new StackElement();
        stackElement.setName("Jaś");
        stack.push(stackElement);
        stackElement = new StackElement();
        stackElement.setName("Małgorzata");
        stack.push(stackElement);
        System.out.println(stack.count());
    }
}
