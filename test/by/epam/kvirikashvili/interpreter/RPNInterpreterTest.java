package by.epam.kvirikashvili.interpreter;

import by.epam.kvirikashvili.exception.NoSuchOperationException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RPNInterpreterTest {
    @Test(dataProvider = "interpreterTest", dataProviderClass = RPNInterpreterTestData.class)
    public void testCalculate(String expression, String result) throws NoSuchOperationException {
        //given
        String expected = result;
        //when
        RPNInterpreter interpreter = new RPNInterpreter(expression);
        String actual = interpreter.calculate();
        //then
        Assert.assertEquals(actual, expected);
    }
}