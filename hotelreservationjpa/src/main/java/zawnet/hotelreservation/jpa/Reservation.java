package zawnet.hotelreservation.jpa;

import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.util.List;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany
    private List<Guest> guest;


    public Reservation(List<Guest> guest) {
        this.guest = guest;
    }


}
