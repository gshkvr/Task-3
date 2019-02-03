package by.epam.kvirikashvili.parcer;

import by.epam.kvirikashvili.entity.Composite;
import by.epam.kvirikashvili.entity.Part;
import by.epam.kvirikashvili.entity.PartType;
import by.epam.kvirikashvili.exception.NoSuchOperationException;
import by.epam.kvirikashvili.exception.NoSuchParserTypeException;

public class SentenceParcer extends Parser {
    private SentenceParcer() {
    }

    private static final class SingletonSentenceParcer {
        private static final SentenceParcer INSTANCE = new SentenceParcer();
    }

    public static SentenceParcer getInstance() {
        return SentenceParcer.SingletonSentenceParcer.INSTANCE;
    }

    @Override
    public void parseConcrete(Part part, String text) throws NoSuchParserTypeException, NoSuchOperationException {
        Part lexeme = new Composite(PartType.LEXEME);
        nextParser.parse(lexeme, text);
        part.add(lexeme);
    }
}
