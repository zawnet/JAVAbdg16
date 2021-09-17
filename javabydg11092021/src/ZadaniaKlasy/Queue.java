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

    public QueueItem getQueueItem() {
        return queueItem;
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
        if (getQueueItem() == null) {
            setQueueItem(queueItem); //pierszy element kolejki
        }
        else {
            QueueItem tmp = getQueueItem();
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
        if(getQueueItem() == null) return false;
        QueueItem tmp = getQueueItem();
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
        if(getQueueItem() != null)
             setQueueItem(getQueueItem().getNext());
        else
            System.out.println("KOlejka jest pusta");
        return getQueueItem();

    }
    /**
     * zwraca informacj o iloci elementów w kolejce
     * @return
     */
    int count(){
        int n = 0;
        if(getQueueItem() != null){
            QueueItem tmp = getQueueItem();
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
        QueueTwoWay queue = new QueueTwoWay();
        queue.add(new QueueItemTwoWay("Paweł"));
        queue.add(new QueueItemTwoWay("Aneta"));
        queue.add(new QueueItemTwoWay("Ola"));
        queue.add(new QueueItemTwoWay("Jaś"));
        queue.add(new QueueItemTwoWay("Małgorzata"));
        queue.add(new QueueItemTwoWay("Waldemar"));
        queue.add(new QueueItemTwoWay("Huber"));
        //queue.poll();
        queue.add(new QueueItemTwoWay("Konrad"));
        queue.print();
        System.out.println();
        queue.poll(0);

        //queue.add(new QueueItem("Konrad"));
        queue.print();

    }
}
