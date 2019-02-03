package by.epam.kvirikashvili.interpreter;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TerminalExpressionRightShiftTest {

    @Test
    public void testInterpret() {
        //given
        Context expected = new Context();
        expected.pushValue(45);
        //when
        Context actual = new Context();
        actual.pushValue(363);
        actual.pushValue(3);
        TerminalExpressionRightShift terminalExpressionRightShift = new TerminalExpressionRightShift();
        terminalExpressionRightShift.interpret(actual);
        //then
        Assert.assertEquals(expected, actual);
    }
}