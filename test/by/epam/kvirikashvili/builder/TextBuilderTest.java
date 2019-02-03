package by.epam.kvirikashvili.builder;

import by.epam.kvirikashvili.entity.Part;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TextBuilderTest {
    private final TextBuilder textBuilder = new TextBuilder();
    private final StringBuilder stringBuilder = new StringBuilder();

    @BeforeTest
    public void setUp(){
        stringBuilder.append("    Belarus is a country. It situated in center of Europe.\n");
        stringBuilder.append("    Minsk - capital of Belarus...\n");
        stringBuilder.append("    Four years ago was 2015.");
    }

    @Test(dataProvider = "testText", dataProviderClass = TextBuilderTestData.class)
    public void testBuildText(Part text) {
        //given
        String expected = stringBuilder.toString();
        //when
        String actual = textBuilder.buildText(text);
        //then
        Assert.assertEquals(expected, actual);
    }
}