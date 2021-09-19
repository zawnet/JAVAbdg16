package company;
import static org.junit.jupiter.api.Assertions.fail;
public class JunitCustomAssertions {

        public static void assertSomething(boolean val) {
            if (!val) {
                fail("expecting true value");
            }
        }

        public static void assertPersonFullname(Person person, String firstName, String lastName) {
            if (!person.getName().equals(firstName) ||
                    !person.getSurmanme().equals(lastName)) {

                fail("full name asserion failed");

            }
        }

        public static void assertArrayContains(String[] array, String value){
            for(String val : array){
                if(val.equals(value)){
                    return;
                }
            }

            fail("Array does not contain "+ value );
        }
}
