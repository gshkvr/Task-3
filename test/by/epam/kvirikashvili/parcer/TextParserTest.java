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

public class TextParserTest {
    private final StringBuilder stringBuilder = new StringBuilder();

    @BeforeTest
    public void setUp() {
        stringBuilder.append("    Belarus is a country. It situated in center of Europe.\n");
        stringBuilder.append("    Minsk - capital of Belarus...\n");
        stringBuilder.append("    Four years ago was (8^5|1&2<<(2|5>>2&71))|2007.");
    }

    @Test(dataProvider = "testText", dataProviderClass = TextBuilderTestData.class)
    public void testParse(Part text) throws NoSuchParserTypeException, NoSuchOperationException {
        //given
        Part expected = text;
        //when
        String sText = stringBuilder.toString();
        Part actual = new Composite(PartType.TEXT);
        Parser textParser = ParserFactory.getParser(PartType.TEXT);
        Parser paragraphParser = ParserFactory.getParser(PartType.PARAGRAPH);
        Parser sentenceParser = ParserFactory.getParser(PartType.SENTENCE);
        Parser lexemeParser = ParserFactory.getParser(PartType.LEXEME);
        textParser.setNext(paragraphParser);
        paragraphParser.setNext(sentenceParser);
        sentenceParser.setNext(lexemeParser);
        textParser.parse(actual, sText);
        //then
        Assert.assertEquals(expected, actual);
    }
}