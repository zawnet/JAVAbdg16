package calculator;

import Zadania.NumberFormatParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.*;

public class NumberFormatParserTests {

    NumberFormatParser numberFormatParser;
    @BeforeEach
    public void beforeEach(){
        numberFormatParser = new NumberFormatParser();
    }


    @Test
    public void shouldTakeDecimalNumber(){

      //  assertDoesNotThrow(NumberFormatException.class,
      //          () -> numberFormatParser.intToBinary(10));

    }

    @Test
    public void shouldRetrunBinaryNumber(){
        int result = numberFormatParser.intToBinary(3);
        assertEquals(11,result);
    }

    @Test
    public void shouldOctalNumber(){
        int result = numberFormatParser.intToOctal(100);
        assertEquals(144,result);
    }

    @Test
    public void shouldNumberFromOctal(){
        int result = numberFormatParser.convertOctalToDecimal(144);
        assertEquals(100,result);
    }

    @Test
    public void shouldHexNumber(){
        String result = numberFormatParser.decimalToHexConventer(1000);
        assertEquals("3E8",result);
    }

    @Test
    public void shouldNumberFromHex(){
        //int result = numberFormatParser.
    }
    @Test
    public void shouldDecimalFromBinaryNumber(){
        int result = numberFormatParser.convertBinarytoDecimical(11);
        assertEquals(3,result);
    }
    //Testy przy użyciu asertJ
    @Test
    public void equalityDecimalFromBinaryNumber() {
        assertThat(numberFormatParser.convertBinarytoDecimical(11)).isEqualTo(3);
    }




}
