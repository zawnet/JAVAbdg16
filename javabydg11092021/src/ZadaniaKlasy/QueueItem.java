package ZadaniaKlasy;

import java.util.Date;

public class QueueItem {

    private QueueItem next;
    private String name;
    private Date created;

    //Constructors definicion


    public QueueItem(QueueItem next, String name) {
        this.next = next;
        this.name = name;
        this.created = new Date();
    }

    public QueueItem(String name) {
        this.name = name;
        this.created = new Date();
    }

    public QueueItem getNext() {
        return next;
    }

    public String getName() {
        return name;
    }

    public Date getCreated() {
        return created;
    }

    public void setNext(QueueItem next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object obj) {
        obj = (QueueItem) obj;
        return (this == obj || this.getName() == ((QueueItem) obj).getName());
    }

    @Override
    public String toString() {
        return "QueueItem{" +
                "next=" + next +
                ", name='" + name + '\'' +
                ", created=" + created +
                '}';
    }
}
