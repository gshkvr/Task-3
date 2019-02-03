package by.epam.kvirikashvili.interpreter;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NonterminalExpressionNumberTest {

    @Test
    public void testInterpret() {
        //given
        Context expected = new Context();
        expected.pushValue(5);
        //when
        Context actual = new Context();
        NonterminalExpressionNumber expressionNumber = new NonterminalExpressionNumber(5);
        expressionNumber.interpret(actual);
        //then
        Assert.assertEquals(expected, actual);
    }
}