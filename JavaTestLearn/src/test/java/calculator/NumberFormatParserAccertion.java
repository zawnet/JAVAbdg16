package calculator;

import Zadania.NumberFormatParser;
import company.Person;
import org.assertj.core.api.AbstractAssert;

public class NumberFormatParserAccertion extends AbstractAssert<NumberFormatParserAccertion,Integer > {

    protected NumberFormatParserAccertion(Integer decimal) {
        super(decimal, NumberFormatParserAccertion.class);
    }

    public static NumberFormatParserAccertion assertThat(Integer actual){
        return new NumberFormatParserAccertion(actual);
    }

    public NumberFormatParserAccertion shouldRetrunBinaryNumber(){
        isNotNull();
       // if(actual.intToBinary(dec) == )
        return this;
    }

}
