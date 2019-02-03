package by.epam.kvirikashvili.interpreter;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TerminalExpressionLeftShiftTest {

    @Test
    public void testInterpret() {
        //given
        Context expected = new Context();
        expected.pushValue(1808);
        //when
        Context actual = new Context();
        actual.pushValue(452);
        actual.pushValue(2);
        TerminalExpressionLeftShift terminalExpressionLeftShift = new TerminalExpressionLeftShift();
        terminalExpressionLeftShift.interpret(actual);
        //then
        Assert.assertEquals(expected, actual);
    }
}