package calculator;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    public static void beforeAll(){

    }

    @BeforeEach
    public void beforeEach(){
        calculator = new Calculator(2,2);
    }

    @AfterAll
    public static void afterAll(){

    }
    @AfterEach
    public void afterEach(){

    }


    @Test
    @DisplayName("Test dodawanie")
    public void addTest(){

        int result = calculator.add();
        assertEquals(4,result);

        calculator.setB(3);

        result = calculator.add();
        assertNotEquals(4,result);
    }

    @Test
    @DisplayName("Test odejmowanie")
    public void minusTest(){
        int result = calculator.minus();
        assertEquals(0,result);
    }


    //Testy zagnieżdzone tworzymy używając klas wewnętrznych
    @Nested
    public class NestedCalcualtorTest{

    }


}
