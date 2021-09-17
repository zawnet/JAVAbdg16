package ZadaniaKlasy;

/**
 * Klasa rozszerzajaca klasę QueueItem o wskaznik do elementy poprzedniego
 */
public class QueueItemTwoWay extends QueueItem {
    private QueueItemTwoWay prev;

    public QueueItemTwoWay(String name) {
        super(name);
    }

    public QueueItemTwoWay getPrev() {
        return prev;
    }

    public void setPrev(QueueItemTwoWay prev) {
        this.prev = prev;
    }

    public void setNext(QueueItemTwoWay next) {
        super.setNext(next);
    }

    public QueueItemTwoWay getNext() {
        return (QueueItemTwoWay) super.getNext();
    }


}
