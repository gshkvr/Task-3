package by.epam.kvirikashvili.parcer;

import by.epam.kvirikashvili.entity.PartType;
import by.epam.kvirikashvili.exception.NoSuchParserTypeException;

public class ParserFactory {
    public static Parser getParser(PartType type) throws NoSuchParserTypeException {
        switch (type) {
            case TEXT:
                return TextParser.getInstance();
            case PARAGRAPH:
                return ParagraphParser.getInstance();
            case SENTENCE:
                return SentenceParcer.getInstance();
            case LEXEME:
                return LexemeParser.getInstance();
            case WORD:
                return WordParser.getInstance();
            case SYMBOL:
                return SymbolParser.getInstance();
            case EXPRESSION:
                return ExpressionParser.getInstance();
            default:
                throw new NoSuchParserTypeException();
        }
    }
}
