package by.epam.kvirikashvili.interpreter;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TerminalExpressionOrTest {

    @Test
    public void testInterpret() {
        //given
        Context expected = new Context();
        expected.pushValue(495);
        //when
        Context actual = new Context();
        actual.pushValue(452);
        actual.pushValue(363);
        TerminalExpressionOr terminalExpressionOr = new TerminalExpressionOr();
        terminalExpressionOr.interpret(actual);
        //then
        Assert.assertEquals(expected, actual);
    }
}