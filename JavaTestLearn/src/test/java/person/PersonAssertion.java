package person;

import company.Person;
import org.assertj.core.api.*;

public class PersonAssertion  extends AbstractAssert<PersonAssertion, Person> {

    protected PersonAssertion(Person person){
        super(person,PersonAssertion.class);
    }


    public static PersonAssertion assertThat(Person actual){
        return new PersonAssertion(actual);
    }


    public PersonAssertion hasFulName(String firstname, String lastname){
        isNotNull();
        //assertThat(person1)
        if(!actual.getName().equals(firstname) ||
        !actual.getSurmanme().equals(lastname))
            failWithMessage("Expected person to have full firstname and lastname");
        return this;
    }

    public PersonAssertion hasAdult(){
        isNotNull();
        //assertThat(person1)
        if(actual.getAge() < 18 )
            failWithMessage("Expected person to is adult");
        return this;
    }
}
