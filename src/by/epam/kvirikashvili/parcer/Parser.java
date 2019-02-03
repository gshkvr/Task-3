package by.epam.kvirikashvili.parcer;

import by.epam.kvirikashvili.entity.Part;
import by.epam.kvirikashvili.entity.PartType;
import by.epam.kvirikashvili.exception.NoSuchOperationException;
import by.epam.kvirikashvili.exception.NoSuchParserTypeException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Parser {
    private static final String SPLIT_TEXT = "^(\\s{4}|\\t).*";
    private static final String SPLIT_PARAGRAPH = "[^\\.!?]*(\\!\\?|\\.(\\.{2})?)";
    private static final String SPLIT_SENTENCE = "[^\\s]*[^\\s]";
    private static final String SPLIT_LEXEME = "(([()0-9<>&|^]+)|([(]|[a-zA-Z]+|[)]))|([\\-,!?:;()]|(\\.(\\.{2})?))";
    private static final String SPLIT_WORD = "[\\w]";
    private static final String SPLIT_SYMBOL = "[^\\w]";
    private static final String SPLIT_EXPRESSION = "[\\d]";

    protected Parser nextParser;

    public void setNext(Parser next) {
        nextParser = next;
    }

    protected Pattern getPattern(PartType type) {
        switch (type) {
            case TEXT:
                return Pattern.compile(SPLIT_TEXT, Pattern.MULTILINE);
            case PARAGRAPH:
                return Pattern.compile(SPLIT_PARAGRAPH, Pattern.MULTILINE);
            case SENTENCE:
                return Pattern.compile(SPLIT_SENTENCE, Pattern.MULTILINE);
            case LEXEME:
                return Pattern.compile(SPLIT_LEXEME);
            case WORD:
                return Pattern.compile(SPLIT_WORD);
            case SYMBOL:
                return Pattern.compile(SPLIT_SYMBOL);
            case EXPRESSION:
                return Pattern.compile(SPLIT_EXPRESSION);
            default:
                throw new UnsupportedOperationException();
        }
    }

    public void parse(Part part, String text) throws NoSuchParserTypeException, NoSuchOperationException {
        Pattern pattern = getPattern(part.getType());
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String textPart = matcher.group();
            parseConcrete(part, textPart);
        }
    }

    protected abstract void parseConcrete(Part part, String text) throws NoSuchParserTypeException, NoSuchOperationException;

}
