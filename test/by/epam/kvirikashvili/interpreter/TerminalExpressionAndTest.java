package by.epam.kvirikashvili.interpreter;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TerminalExpressionAndTest {

    @Test
    public void testInterpret() {
        //given
        Context expected = new Context();
        expected.pushValue(68);
        //when
        Context actual = new Context();
        actual.pushValue(452);
        actual.pushValue(636);
        TerminalExpressionAnd terminalExpressionAnd = new TerminalExpressionAnd();
        terminalExpressionAnd.interpret(actual);
        //then
        Assert.assertEquals(expected, actual);
    }
}