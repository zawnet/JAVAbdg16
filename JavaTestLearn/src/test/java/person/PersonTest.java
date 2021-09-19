package person;

import company.Person;
import org.junit.jupiter.api.Test;
import static person.PersonAssertion.*;


import static org.assertj.core.api.Assertions.*;


public class PersonTest {

    @Test
    public void equalityTest(){
        Person person1 = new Person("Jan", "Nowak");
        Person person2 = new Person("Jan", "Nowak");

        person2 = person1;
        //assertThat(person1).isEqualTo(person2);
        person2 = new Person("Jan", "Nowak");
        //assertThat(person1).usingRecursive
        assertThat(person1).hasFulName("Jan", "Nowak");
        person1.setAge(18);
        assertThat(person1).hasAdult();
    }
}
