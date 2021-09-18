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

    public  QueueItemTwoWay add(QueueItemTwoWay queueItem, int i){
        boolean isinquere= false;
        int n=0;
        if (getQueueItem() == null || i==0) {
            if(getQueueItem().getNext() != null){
                queueItem.setNext(getQueueItem());
                getQueueItem().setPrev(queueItem);
            }

            setQueueItem(queueItem); //pierszy element kolejki

        }
        else if(i<=count()) {
            QueueItemTwoWay tmp = this.queueItem;
            while (tmp.getNext() != null){
                if(tmp.getNext().equals(queueItem)) {
                    isinquere = true;
                    System.out.println(queueItem.toString() + " Istnieje juz w kolejce");
                    break;
                }
                if(n==i) break;
                n++;
                if(tmp.getNext() == null) break;
                else tmp=tmp.getNext();
            }

            if (!isinquere) {
                tmp.getPrev().setNext(queueItem);
                queueItem.setPrev(tmp.getPrev());
                tmp.setPrev(queueItem);
                queueItem.setNext(tmp);


                return queueItem;
            }
            else {
                return null;
            }
        }
        else {
            System.out.println("Nie ma miejsca do wstawienia tego elementu");
        }
        return queueItem;
    }
    QueueItemTwoWay poll(int i) {
        int n = 0;
        if (i >= 0 && i < count()) {
            if(i==0) setQueueItem(getQueueItem().getNext());

            else if (getQueueItem() != null) {
                QueueItemTwoWay tmp = getQueueItem();
                while ((tmp = tmp.getNext()) != null && i>n) {
                    n++;
                }

                tmp.getPrev().getPrev().setNext(tmp);
                tmp.setPrev(tmp.getPrev().getPrev());


                return tmp.getNext();
            }
        } else {
            System.out.println("Nie ma takiego elementu co usniecia");

        }
        return null;
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

       // super.print();
    }

    @Override
    QueueItemTwoWay poll() {
        if(getQueueItem() != null)
            setQueueItem(getQueueItem().getNext());
        else
            System.out.println("KOlejka jest pusta");
        return getQueueItem();
    }

    @Override
    int count() {
        int n = 0;
        if(getQueueItem() != null){
            QueueItemTwoWay tmp = getQueueItem();
            while ((tmp = tmp.getNext()) !=null){
                n++;
            }
        }
        //System.out.println(n);
        return n;
    }


}
