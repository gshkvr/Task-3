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

public class ParagraphParserTest {
    private final StringBuilder stringBuilder = new StringBuilder();

    @BeforeTest
    public void setUp() {
        stringBuilder.append("    Belarus is a country. It situated in center of Europe.");
    }

    @Test(dataProvider = "testParagraph", dataProviderClass = TextBuilderTestData.class)
    public void testParse(Part paragraph) throws NoSuchParserTypeException, NoSuchOperationException {
        //given
        Part expected = paragraph;
        //when
        String sParagraph = stringBuilder.toString();
        Part actual = new Composite(PartType.PARAGRAPH);
        Parser paragraphParser = ParserFactory.getParser(PartType.PARAGRAPH);
        Parser sentenceParser = ParserFactory.getParser(PartType.SENTENCE);
        Parser lexemeParser = ParserFactory.getParser(PartType.LEXEME);
        paragraphParser.setNext(sentenceParser);
        sentenceParser.setNext(lexemeParser);
        paragraphParser.parse(actual, sParagraph);
        //then
        Assert.assertEquals(expected, actual);
    }
}