package by.epam.kvirikashvili.sorter;

import by.epam.kvirikashvili.builder.TextBuilder;
import by.epam.kvirikashvili.builder.TextBuilderTestData;
import by.epam.kvirikashvili.entity.Part;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CompositeSorterTest {
    private final CompositeSorter sorter = new CompositeSorter();
    private final TextBuilder textBuilder = new TextBuilder();
    private final StringBuilder sbSortParagraphBySentencesCount = new StringBuilder();
    private final StringBuilder sbSortWordsInSentenceByLength = new StringBuilder();
    private final StringBuilder sbSortLexemesInSentenceBySymbolCount = new StringBuilder();

    @BeforeTest
    public void setUp() {
        sbSortParagraphBySentencesCount.append("    Minsk - capital of Belarus...\n");
        sbSortParagraphBySentencesCount.append("    Four years ago was 2015.\n");
        sbSortParagraphBySentencesCount.append("    Belarus is a country. It situated in center of Europe.");
        sbSortWordsInSentenceByLength.append("    a is Belarus country. It in of center Europe situated.\n");
        sbSortWordsInSentenceByLength.append("    of - Minsk capital Belarus...\n");
        sbSortWordsInSentenceByLength.append("    ago was Four years 2015.");
        sbSortLexemesInSentenceBySymbolCount.append("    Belarus a country. is situated Europe. It center in of\n");
        sbSortLexemesInSentenceBySymbolCount.append("    capital Belarus... - Minsk of\n");
        sbSortLexemesInSentenceBySymbolCount.append("    ago was years 2015. Four");
    }

    @Test(dataProvider = "testText", dataProviderClass = TextBuilderTestData.class)
    public void testSortParagraphBySentencesCount(Part text) {
        //given
        String expected = sbSortParagraphBySentencesCount.toString();
        //when
        sorter.sortParagraphBySentencesCount(text);
        String actual = textBuilder.buildText(text);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test(dataProvider = "testText", dataProviderClass = TextBuilderTestData.class)
    public void testSortWordsInSentenceByLength(Part text) {
        //given
        String expected = sbSortWordsInSentenceByLength.toString();
        //when
        sorter.sortWordsInSentenceByLength(text);
        String actual = textBuilder.buildText(text);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test(dataProvider = "testText", dataProviderClass = TextBuilderTestData.class)
    public void testSortLexemesInSentenceBySymbolCount(Part text) {
        //given
        String expected = sbSortLexemesInSentenceBySymbolCount.toString();
        //when
        sorter.sortLexemesInSentenceBySymbolCount(text, "a");
        String actual = textBuilder.buildText(text);
        //then
        Assert.assertEquals(expected, actual);
    }
}