package zawnet.hotelreservation.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class GuestRepository {
    private EntityManager em;

    public GuestRepository(EntityManager em) {
        this.em = em;
    }

    public Guest createNewGuest(String name, int age) {
        System.out.println("------CREATE------");
        Guest guest = new Guest(name, age);
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        System.out.println("------Persisting in new transaction------");
        em.persist(guest);
        System.out.println(" New guest ID: "+guest.getId());
        System.out.println("------Closing transaction------");
        transaction.commit();
        return guest;


    }

    public Guest findById(long id) {
        System.out.println(" ------ FIND BY ID ------");
        return em.find(Guest.class, id);
    }

    public void updateAge(Guest guest, int newAge){

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        guest.setAge(newAge);
        transaction.commit();
    }

    public void delete(Guest guest){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(guest);
        transaction.commit();
    }

}
