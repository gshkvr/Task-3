package by.epam.kvirikashvili.parcer;

import by.epam.kvirikashvili.entity.Composite;
import by.epam.kvirikashvili.entity.Part;
import by.epam.kvirikashvili.entity.PartType;
import by.epam.kvirikashvili.exception.NoSuchOperationException;
import by.epam.kvirikashvili.exception.NoSuchParserTypeException;

public class TextParser extends Parser {
    private TextParser() {
    }

    private static final class SingletonTextParser {
        private static final TextParser INSTANCE = new TextParser();
    }

    public static TextParser getInstance() {
        return TextParser.SingletonTextParser.INSTANCE;
    }

    @Override
    protected void parseConcrete(Part part, String text) throws NoSuchParserTypeException, NoSuchOperationException {
        Part paragraph = new Composite(PartType.PARAGRAPH);
        nextParser.parse(paragraph, text);
        part.add(paragraph);
    }
}
