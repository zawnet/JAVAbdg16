package zawnet.hotelreservation.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Arrays;

public class App {

    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("thePersistenceUnit");
    private static EntityManager em  = factory.createEntityManager();

    public static void main(String[] args) {
        GuestRepository guestRepository  = new GuestRepository(em);
        ReservationRepository reservationRepository = new ReservationRepository(em);
        Guest guest1 = guestRepository.createNewGuest("Paweł", 37);
        Guest guest2 = guestRepository.createNewGuest("Paweł", 37);
        //Guest guest = guestRepository.findById(1);
        guestRepository.updateAge(guest1, 40);
       // guestRepository.delete(guest);

        reservationRepository.createReservation(Arrays.asList(guest1,guest2));
    }
}
