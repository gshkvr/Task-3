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

public class WordParserTest {
    private final StringBuilder stringBuilder = new StringBuilder();

    @BeforeTest
    public void setUp() {
        stringBuilder.append("country");
    }

    @Test(dataProvider = "testWord", dataProviderClass = TextBuilderTestData.class)
    public void testParse(Part word) throws NoSuchParserTypeException, NoSuchOperationException {
        //given
        Part expected = word;
        //when
        String sWord = stringBuilder.toString();
        Part actual = new Composite(PartType.WORD);
        Parser wordParser = ParserFactory.getParser(PartType.WORD);
        wordParser.parse(actual, sWord);
        //then
        Assert.assertEquals(expected, actual);
    }
}