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
    private int freeElement;
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

        stackElements = new StackElement[size];
        freeElement = 0;
        this.size = stackElements.length;

    }

    /**
     *  dodaje kolejny element do stosu, gdy stos jest przepeniony powinna
     *  * wypisa informacj o jego przepenieniu. Metoda powinna blokować umieszczanie na stosie takich samych elementów (o
     *  * tej samej nazwie - w tym celu przeciąż metodę equals()). Metoda zwraca element, który umiecia na stosie
     * @param stackElement
     * @return
     */
    public StackElement push(StackElement stackElement){
        if(freeElement < size && !equals(stackElement)){
            this.stackElements[freeElement] = stackElement;
          freeElement++;
            return stackElement;
        }
        else {
            return null;
        }
    }

    /**
     * zdejmuje i zwraca najnowszy element ze stosu, gdy zostanie wywoana na pustym stosie powinna wypisa informacj o tym, e stos jest pusty
     * @return najnowszy element ze stosu
     */
    public StackElement pop(){
        if(freeElement <= 0 ) {
            return null;
        }
        else {
            StackElement tmp = stackElements[freeElement -1];
            freeElement--;
            return tmp;
        }
    }

    @Override
    public boolean equals(Object obj) {
        int n=0;
        StackElement element = (StackElement) obj;
        while (n<freeElement)
        {
            if(stackElements[n].equals(element) || stackElements[n].getName() == element.getName()){
                return true;
            }
           n++;
        }
        return false;
    }

    int count(){
        return freeElement - 1;
    }

    void print(){
        StringBuilder sb;
        if(freeElement <= 0){
            sb = new StringBuilder("Stos jest pusty !!!");
        }
        else {
            sb = new StringBuilder("Elementy stosu to: \n");
            for (int i = count(); i >= 0; i--) {
                sb.append(stackElements[i].getName()).append("\n");
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        Stack stack = new Stack(4);

        stack.push(new StackElement("Paweł"));
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
        stack.print();
    }
}
