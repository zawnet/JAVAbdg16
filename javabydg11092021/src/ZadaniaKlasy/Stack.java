package ZadaniaKlasy;

/**
 * @author Paweł Zawada (ZAWNET)
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
        if(checkIsExistInStack(stackElement)){
            System.out.println("Element juz istnieje");
            return null;
        }
        else if(freeElement >= size){
            System.out.println("Brak miejsca do umeszczenia na stosie");
            return null;
        }
        else {
            this.stackElements[freeElement] = stackElement;
            freeElement++;
            return stackElement;
        }

    }

    /**
     * zdejmuje i zwraca najnowszy element ze stosu, gdy zostanie wywoana na pustym stosie powinna wypisa informacj o tym, e stos jest pusty
     * @return najnowszy element ze stosu
     */
    public StackElement pop(){
        if(freeElement <= 0 ) {
            StringBuilder sb = new StringBuilder("Stos jest pusty!!!");
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        else {
            StackElement tmp = stackElements[freeElement -1];
            freeElement--;
            return tmp;
        }
    }

    /**
     * zwraca najnowszy element ze stosu, ale go nie usuwa, gdy zostanie wywoana na pustym stosie
     * powinna wypisa informacj o tym, e stos jest pusty
     * @return najnowszy element ze stosu
     */
    public StackElement peek(){
        if(freeElement <= 0 ) {
            StringBuilder sb = new StringBuilder("Stos jest pusty!!!");
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        else {
            StackElement tmp = stackElements[freeElement -1];
            return tmp;
        }
    }

    /**
     * Metoda sprawdza czy dany obiekt (lub o takiej samej nazwie) znajduje sie na stosie
     * @param stackElement
     * @return
     */
    private boolean checkIsExistInStack(StackElement stackElement){
        int n=0;
        while (n<freeElement)
        {
            if(stackElements[n].equals(stackElement) ){
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
                sb.append(stackElements[i].toString());
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }

}
