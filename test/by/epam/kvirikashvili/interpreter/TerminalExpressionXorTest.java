package by.epam.kvirikashvili.interpreter;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TerminalExpressionXorTest {

    @Test
    public void testInterpret() {
        //given
        Context expected = new Context();
        expected.pushValue(51);
        //when
        Context actual = new Context();
        actual.pushValue(363);
        actual.pushValue(344);
        TerminalExpressionXor terminalExpressionXor = new TerminalExpressionXor();
        terminalExpressionXor.interpret(actual);
        //then
        Assert.assertEquals(expected, actual);
    }
}