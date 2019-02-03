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

public class LexemeParserTest {
    private final StringBuilder stringBuilder = new StringBuilder();

    @BeforeTest
    public void setUp() {
        stringBuilder.append("Country...");
    }

    @Test(dataProvider = "testLexeme", dataProviderClass = TextBuilderTestData.class)
    public void testParse(Part lexeme) throws NoSuchParserTypeException, NoSuchOperationException {
        //given
        Part expected = lexeme;
        //when
        String sLexeme = stringBuilder.toString();
        Part actual = new Composite(PartType.LEXEME);
        Parser lexemeParser = ParserFactory.getParser(PartType.LEXEME);
        lexemeParser.parse(actual, sLexeme);
        //then
        Assert.assertEquals(expected, actual);
    }
}