package ZadaniaKlasy;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author Paweł Zawada (ZAWNET)
 * Reprezentuje pojedynczy element sotosu
 */
public class StackElement {
    private String name;
    private Date created;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public StackElement(String name, Date created) {
        this.name = name;
        this.created = created;
    }
    public StackElement(){
        this.created = new Date();
    }

    public StackElement(String name) {
        this.name = name;
        this.created = new Date();
    }

    @Override
    public String toString() {
        return "StackElement{" +
                "name='" + name + '\'' +
                ", created=" + created +
                '}';
    }

    public void print(){
        System.out.println(toString());
    }

}
