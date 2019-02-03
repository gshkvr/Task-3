package by.epam.kvirikashvili.reader;

import by.epam.kvirikashvili.exception.IncorrectInputFileException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileReaderTest {
    private static final String FILE_PATH = "./files/text.txt";
    private static final String INCORRECT_FILE_PATH = "./files/text111.txt";
    private final FileReader reader = new FileReader();
    private final StringBuilder sb = new StringBuilder();

    @BeforeTest
    public void setUp() {
        sb.append("    It has survived - not only (five) centuries, but also the leap into 13<<2 electronic typesetting, remaining 3>>5 essentially 6&9|(3&4) unchanged... It was popularised in the 5|(1&2&(3|(4&(2^5|6&47)|3)|2)|1) with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\r\n");
        sb.append("    It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using (71&(2&3|(3|(2&1>>2|2)&2)|10&2))|78 Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using (Content here), content here, making it look like readable English.\r\n");
        sb.append("    It is a (8^5|1&2<<(2|5>>2&71))|1200 established fact that a reader will be of a page when looking at its layout.\r\n");
        sb.append("\tBye.");
    }

    @Test
    public void testRead() throws IncorrectInputFileException {
        //given
        String expected = sb.toString();
        //when
        String actual = reader.read(FILE_PATH);
        //then
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = IncorrectInputFileException.class)
    public void testReadException() throws IncorrectInputFileException {
        //given
        String expected = sb.toString();
        //when
        String actual = reader.read(INCORRECT_FILE_PATH);
        //then
        Assert.assertEquals(actual, expected);
    }
}