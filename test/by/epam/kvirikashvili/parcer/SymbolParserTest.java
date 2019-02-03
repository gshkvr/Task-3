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

public class SymbolParserTest {
    private final StringBuilder stringBuilder = new StringBuilder();

    @BeforeTest
    public void setUp() {
        stringBuilder.append("...");
    }

    @Test(dataProvider = "testSymbol", dataProviderClass = TextBuilderTestData.class)
    public void testParse(Part symbol) throws NoSuchParserTypeException, NoSuchOperationException {
        //given
        Part expected = symbol;
        //when
        String sSymbol = stringBuilder.toString();
        Part actual = new Composite(PartType.SYMBOL);
        Parser symbolParser = ParserFactory.getParser(PartType.SYMBOL);
        symbolParser.parse(actual, sSymbol);
        //then
        Assert.assertEquals(expected, actual);
    }
}