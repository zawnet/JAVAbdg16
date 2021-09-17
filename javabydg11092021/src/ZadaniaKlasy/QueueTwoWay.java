package ZadaniaKlasy;

public class QueueTwoWay extends Queue {
    private QueueItemTwoWay queueItem; //Piwerszy elemet kolejki

    public QueueItemTwoWay getQueueItem() {
        return queueItem;
    }

    public void setQueueItem(QueueItemTwoWay queueItem) {
        this.queueItem = queueItem;
    }

    /**
     * dodaje kolejny element do kolejki. Metoda powinna blokowa umieszczanie na
     * stosie takich samych elementów (o tej samej nazwie - w tym celu przeciąż metodę equals()).
     * Metoda zwraca element, który zosta dodany do kolejki
     * @param queueItem
     * @return element, który został dodany do kolejki
     */
    public  QueueItemTwoWay add(QueueItemTwoWay queueItem){
        boolean isinquere= false;
        if (this.queueItem == null) {
            setQueueItem(queueItem); //pierszy element kolejki
        }
        else {
            QueueItemTwoWay tmp = this.queueItem;
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
                queueItem.setPrev(tmp);
                return queueItem;
            }
            else {
                return null;
            }
        }
        return queueItem;
    }

    @Override
    void print() {
        int n = 0;
        if(getQueueItem() != null){
            QueueItem tmp = getQueueItem();
            System.out.print(tmp.getName()+ " -> ");
            while ((tmp = tmp.getNext()) !=null){
                System.out.print(tmp.getName()+" -> ");
            }
        }
    }

    @Override
    QueueItemTwoWay poll() {
        if(getQueueItem() != null)
            setQueueItem(getQueueItem().getNext());
        else
            System.out.println("KOlejka jest pusta");
        return getQueueItem();
    }
}
