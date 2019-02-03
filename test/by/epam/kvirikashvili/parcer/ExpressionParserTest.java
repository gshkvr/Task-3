package by.epam.kvirikashvili.parcer;

import by.epam.kvirikashvili.builder.TextBuilderTestData;
import by.epam.kvirikashvili.entity.Composite;
import by.epam.kvirikashvili.entity.Part;
import by.epam.kvirikashvili.entity.PartType;
import by.epam.kvirikashvili.exception.NoSuchOperationException;
import by.epam.kvirikashvili.exception.NoSuchParserTypeException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExpressionParserTest {
    private final StringBuilder stringBuilder = new StringBuilder();

    @BeforeTest
    public void setUp() {
        stringBuilder.append("2015");
    }

    @Test(dataProvider = "testExpression", dataProviderClass = TextBuilderTestData.class)
    public void testParse(Part expression) throws NoSuchParserTypeException, NoSuchOperationException {
        //given
        Part expected = expression;
        //when
        String sExpression = stringBuilder.toString();
        Part actual = new Composite(PartType.EXPRESSION);
        Parser expressionParser = ParserFactory.getParser(PartType.EXPRESSION);
        expressionParser.parse(actual, sExpression);
        //then
        Assert.assertEquals(expected, actual);
    }
}