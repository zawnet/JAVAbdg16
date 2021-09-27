package zawnet.hotelreservation.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class ReservationRepository {
    private EntityManager em;

    public ReservationRepository(EntityManager em) {
        this.em = em;
    }

    public void createReservation(List<Guest> guest) {
        Reservation reservation = new Reservation(guest);
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(reservation);
        transaction.commit();
    }
}
