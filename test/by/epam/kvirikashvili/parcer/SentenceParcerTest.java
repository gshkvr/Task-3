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

public class SentenceParcerTest {
    private final StringBuilder stringBuilder = new StringBuilder();

    @BeforeTest
    public void setUp() {
        stringBuilder.append("Belarus is a country.");
    }

    @Test(dataProvider = "testSentence", dataProviderClass = TextBuilderTestData.class)
    public void testParse(Part sentence) throws NoSuchParserTypeException, NoSuchOperationException {
        //given
        Part expected = sentence;
        //when
        String sSentence = stringBuilder.toString();
        Part actual = new Composite(PartType.SENTENCE);
        Parser sentenceParser = ParserFactory.getParser(PartType.SENTENCE);
        Parser lexemeParser = ParserFactory.getParser(PartType.LEXEME);
        sentenceParser.setNext(lexemeParser);
        sentenceParser.parse(actual, sSentence);
        //then
        Assert.assertEquals(expected, actual);
    }
}