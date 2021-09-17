package ZadaniaKlasy;
/**
 * @author Paweł Zawada (ZAWNET)
Kolejka - liniowa struktura danych, w której nowe dane dopisywane s na kocu kolejki, a z pocztku kolejki pobierane s dane do dalszego
przetwarzania (FIFO - First In, First Out).
Wykorzystujc umiejtno programowania obiektowego, napisz program skadajcy si z nastpujcych klas
Queue - klasa reprezentujca kolejk. Klasa posiada skadow o nazwie head, która jest typem referencyjnym QueueItem i
wskazuje na pierwszy element kolejki. Dodatkowo klasa posiada nastpujce metody
QueueItem add(QueueItem queueItem) - dodaje kolejny element do kolejki. Metoda powinna blokowa umieszczanie na
stosie takich samych elementów (o tej samej nazwie - w tym celu przeci metod equals()). Metoda zwraca element, który
zosta dodany do kolejki
QueueItem poll() - zdejmuje i zwraca pierwszy element z kolejki, gdy zostanie wywoana na pustej kolejce powinna
wypisa informacj o tym, e kolejka jest pusta
int count() - zwraca informacj o iloci elementów w kolejce
void print() - wypisuje wszystkie elementy kolejki w kolejnoci od pierwszego do ostatniego
QueueItem - klasa reprezentujca element kolejki, posiada dwie skadowe
next: QueueItem - typ referencyjny, wskazuje na nastpny element kolejki
name: String - nazwa elementu
created: Date - data utworzenia
 */

import jdk.jshell.spi.ExecutionControl;

public class Queue {

    private QueueItem queueItem; //Piwerszy elemet kolejki

    public void setQueueItem(QueueItem queueItem) {
        this.queueItem = queueItem;
    }

    /**
     * dodaje kolejny element do kolejki. Metoda powinna blokowa umieszczanie na
     * stosie takich samych elementów (o tej samej nazwie - w tym celu przeciąż metodę equals()).
     * Metoda zwraca element, który zosta dodany do kolejki
     * @param queueItem
     * @return element, który został dodany do kolejki
     */
    public  QueueItem add(QueueItem queueItem){
        boolean isinquere= false;
        if (this.queueItem == null) {
            setQueueItem(queueItem); //pierszy element kolejki
        }
        else {
            QueueItem tmp = this.queueItem;
            while (tmp.getNext() != null){
                if(tmp.getNext().equals(queueItem)) {
                    isinquere = true;
                    System.out.println(queueItem.toString() + " Istnieje juz w kolejce");
                    break;
                }
                if(tmp.getNext() == null) break;
                else tmp=tmp.getNext();
            }

            if (!isinquere) {
                tmp.setNext(queueItem);
                return queueItem;
            }
            else {
                return null;
            }
        }
        return queueItem;
    }

    @Override
    public boolean equals(Object obj) {
        if(queueItem == null) return false;
        QueueItem tmp = queueItem;
        while (tmp.getNext() != null){
            if(tmp.getNext().equals(obj)) return true;
            else tmp=tmp.getNext();
        }
        return false;
    }

    /**
     * zdejmuje i zwraca pierwszy element z kolejki, gdy zostanie wywoana na pustej kolejce powinna
     * wypisa informacj o tym, e kolejka jest pusta
     * @return zwraca pierwszy element z kolejki
     */
    QueueItem poll(){
        if(queueItem != null)
            queueItem = queueItem.getNext();
        else
            System.out.println("KOlejka jest pusta");
        return queueItem;

    }
    /**
     * zwraca informacj o iloci elementów w kolejce
     * @return
     */
    int count(){
        int n = 0;
        if(queueItem != null){
            QueueItem tmp = queueItem;
            while ((tmp = tmp.getNext()) !=null){
                n++;
            }
        }
        return n;
    }

    /**
     * wypisuje wszystkie elementy kolejki w kolejnoci od pierwszego do ostatniego
     */
    void print(){
        int n = 0;
        if(queueItem != null){
            QueueItem tmp = queueItem;
            System.out.print(tmp.getName()+ " -> ");
            while ((tmp = tmp.getNext()) !=null){
                System.out.print(tmp.getName()+" -> ");
            }
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(new QueueItem("Paweł"));
        queue.add(new QueueItem("Aneta"));
        queue.add(new QueueItem("Ola"));
        queue.add(new QueueItem("Jaś"));
        queue.add(new QueueItem("Małgorzata"));
        queue.add(new QueueItem("Waldemar"));
        queue.add(new QueueItem("Huber"));
        //queue.poll();
        queue.add(new QueueItem("Konrad"));

        //queue.add(new QueueItem("Konrad"));
        queue.print();

    }
}
