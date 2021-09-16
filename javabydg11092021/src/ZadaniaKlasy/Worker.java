package ZadaniaKlasy;

import java.util.Scanner;

/**
 * Na bazie zadania 32 napisz program, w którym zostanie zawarty proces dziedziczenia. Napisz klas o nazwie Worker, która bdzie
 * dziedziczy po klasie Person oraz bdzie zawiera dodatkowe pola: education i workplace. Metody init() i print() powinny, podobnie jak dla
 * klasy Person, obsugiwa wprowadzanie danych i ich wywietlanie.
 */

public class Worker extends Person{
    private String education;
    private String workplace;

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    @Override
    public void init() {
        super.init();
        Scanner input = new Scanner(System.in);
        System.out.println("Education: ");
        setEducation(input.nextLine());
        System.out.println("Workplace: ");
        setWorkplace(input.nextLine());
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Education: "+getEducation());
        System.out.println("Workspace: "+getWorkplace());

    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.init();
        worker.print();
    }
}
