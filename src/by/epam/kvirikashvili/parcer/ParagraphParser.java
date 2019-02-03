package by.epam.kvirikashvili.parcer;

import by.epam.kvirikashvili.entity.Composite;
import by.epam.kvirikashvili.entity.Part;
import by.epam.kvirikashvili.entity.PartType;
import by.epam.kvirikashvili.exception.NoSuchOperationException;
import by.epam.kvirikashvili.exception.NoSuchParserTypeException;

public class ParagraphParser extends Parser {
    private ParagraphParser() {
    }

    private static final class SingletonParagraphParser {
        private static final ParagraphParser INSTANCE = new ParagraphParser();
    }

    public static ParagraphParser getInstance() {
        return SingletonParagraphParser.INSTANCE;
    }

    @Override
    public void parseConcrete(Part part, String text) throws NoSuchParserTypeException, NoSuchOperationException {
        Part sentence = new Composite(PartType.SENTENCE);
        nextParser.parse(sentence, text);
        part.add(sentence);
    }
}
