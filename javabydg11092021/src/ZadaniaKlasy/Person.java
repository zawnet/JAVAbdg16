package ZadaniaKlasy;

import javax.print.attribute.standard.Finishings;
import java.util.Scanner;

/**
 * Napisz program, w którym zdefiniowano klas Person, zawierajc nastpujce pola: firstName, lastName, street, postalCode, city oraz dwie
 * metody init() i print(). Pierwsza z nich umoliwia wprowadzenie danych, natomiast druga wywietla je na ekranie komputera.
 */


class Person {

    private String firstName;
    private String lastName;
    private String street;
    private String postalCode;
    private String city;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Metoda innit odpowiada za prowadzanie dancyh do poól klasy poprzez motyfikator setter
     */
    public void init(){
        Scanner input = new Scanner(System.in);
        System.out.println("First name: ");
        setFirstName(input.nextLine());
        System.out.println("Last name: ");
        setLastName(input.nextLine());
        System.out.println("Street: ");
        setStreet(input.nextLine());
        System.out.println("Postal code: ");
        setPostalCode(input.nextLine());
        System.out.println("City: ");
        setCity(input.nextLine());
    }

    /**
     * Metoda print pozwala wyświetlić wartości pól klasy poprzez modyfikato dostępu getter
     */
    public void print(){

        System.out.println("First name: "+getFirstName());
        System.out.println("Last name: "+getLastName());
        System.out.println("Street: "+getStreet());
        System.out.println("Postal code: "+getPostalCode());
        System.out.println("City: "+getCity());
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.init();
        person.print();
    }
}
